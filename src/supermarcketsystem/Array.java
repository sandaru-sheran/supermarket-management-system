package supermarcketsystem;

import java.awt.Window;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

class Array {
    private Item[] itemArray = new Item[0];
    private User[] userArray = new User[0];
    private Item[] toSellItemArray = new Item[0];

    private final String URL = "jdbc:mysql://localhost:3306/supermarket_db";
    private final String USER = "root";
    private final String PASS = ""; 

    public Array() {
        loadDataFromDB();
    }

    public Array(Item[] item, User[] user) {
        this.userArray = user;
        this.itemArray = item;
    }

    private Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Array.class.getName()).log(Level.SEVERE, null, e);
        }
        return DriverManager.getConnection(URL, USER, PASS);
    }

    public void loadDataFromDB() {
        try (Connection conn = getConnection()) {
            Statement stItem = conn.createStatement();
            ResultSet rsItem = stItem.executeQuery("SELECT * FROM items");
            ArrayList<Item> itemList = new ArrayList<>();
            while (rsItem.next()) {
                itemList.add(new Item(
                    rsItem.getString("itemId"),
                    rsItem.getString("itemName"),
                    String.valueOf(rsItem.getDouble("itemPrice")),
                    rsItem.getInt("itemQTY")
                ));
            }
            itemArray = itemList.toArray(new Item[0]);

            Statement stUser = conn.createStatement();
            ResultSet rsUser = stUser.executeQuery("SELECT * FROM users");
            ArrayList<User> userList = new ArrayList<>();
            while (rsUser.next()) {
                userList.add(new User(
                    rsUser.getString("name"),
                    rsUser.getString("username"),
                    rsUser.getString("password"),
                    rsUser.getString("mobileNumber"),
                    rsUser.getBoolean("status")
                ));
            }
            userArray = userList.toArray(new User[0]);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addItemToSell(Item item) {
        Item[] temp = new Item[toSellItemArray.length + 1];
        for (int i = 0; i < temp.length - 1; i++) {
            temp[i] = toSellItemArray[i];
        }
        temp[temp.length - 1] = item;
        toSellItemArray = temp;
    }

    public boolean addItem(Item item) {
        String sql = "INSERT INTO items (itemId, itemName, itemPrice, itemQTY) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, item.itemId);
            pstmt.setString(2, item.itemName);
            pstmt.setDouble(3, Double.parseDouble(item.itemPrice)); 
            pstmt.setInt(4, item.itemQTY);
            pstmt.executeUpdate();
            loadDataFromDB();
            return true;
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Item getItem(int Index) {
        return itemArray[Index];
    }

    public boolean updateIte(Item item, int Index) {
        String sql = "UPDATE items SET itemName=?, itemPrice=?, itemQTY=itemQTY+? WHERE itemId=?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, item.itemName);
            pstmt.setDouble(2, Double.parseDouble(item.itemPrice));
            pstmt.setInt(3, item.itemQTY);
            pstmt.setString(4, itemArray[Index].itemId);
            pstmt.executeUpdate();
            loadDataFromDB();
            return true;
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Item[] getItemArray() {
        return itemArray;
    }

    public User[] getUSerArray() {
        return userArray;
    }

    public void removeItem(String itemId) {
        String sql = "DELETE FROM items WHERE itemId = ?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, itemId);
            pstmt.executeUpdate();
            loadDataFromDB();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeUser(String userName) {
        String sql = "DELETE FROM users WHERE username = ?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, userName);
            pstmt.executeUpdate();
            loadDataFromDB();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int userNameSearchIndex(String userName) {
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i].username.equals(userName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean placeOrder() {
        String sql = "UPDATE items SET itemQTY = itemQTY - ? WHERE itemId = ?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            for (Item item : toSellItemArray) {
                pstmt.setInt(1, item.itemQTY);
                pstmt.setString(2, item.itemId);
                pstmt.executeUpdate();
            }
            toSellItemArray = new Item[0];
            loadDataFromDB();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addUser(User user) {
        String sql = "INSERT INTO users (name, username, password, mobileNumber, status) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.name);
            pstmt.setString(2, user.username);
            pstmt.setString(3, user.password);
            pstmt.setString(4, user.mobileNumber);
            pstmt.setBoolean(5, user.status);
            pstmt.executeUpdate();
            loadDataFromDB();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public int searchItemId(String data) {
        for (int i = 0; i < itemArray.length; i++) {
            if (itemArray[i].itemId.equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public User validateUser(String userName, String password) {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, userName);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new User(
                    rs.getString("name"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("mobileNumber"),
                    rs.getBoolean("status")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new User("-1", "-1", "-1", "-1", false);
    }

    public User userNameSearch(String userName) {
        for (User u : userArray) {
            if (u.username.equals(userName)) {
                return u;
            }
        }
        return new User("-1", "-1", "-1", "-1", false);
    }

    public void logOut() throws IOException {
        Window[] windows = Window.getWindows();
        for (Window window : windows) {
            window.dispose();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Array.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}