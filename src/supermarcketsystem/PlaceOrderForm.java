
package supermarcketsystem;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PlaceOrderForm extends javax.swing.JFrame {
    private DefaultTableModel dtm;
    int netTotal=0;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PlaceOrderForm.class.getName());

    Array array;
    public PlaceOrderForm(Array array) {
        initComponents();
        addButton.setVisible(false);
        this.array=array;
        int netTotal=0;
        dtm = (DefaultTableModel) orderTable.getModel();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        totalLable = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        itemIdTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        itemQTYTExtField = new javax.swing.JTextField();
        placeOrderButton = new javax.swing.JButton();
        checkInStockButton = new javax.swing.JButton();
        erroeMasageLable = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Place Oeder");
        jLabel1.setOpaque(true);

        exitButton.setBackground(new java.awt.Color(153, 255, 255));
        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(0, 0, 0));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Item Name", "Item Qty", "Total Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderTable);

        jLabel2.setText("Net Total :");

        jLabel3.setText("Item Id");

        jLabel4.setText("Item QTY");

        placeOrderButton.setBackground(new java.awt.Color(153, 255, 255));
        placeOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        placeOrderButton.setForeground(new java.awt.Color(0, 0, 0));
        placeOrderButton.setText("Place Order");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });

        checkInStockButton.setBackground(new java.awt.Color(153, 255, 255));
        checkInStockButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        checkInStockButton.setForeground(new java.awt.Color(0, 0, 0));
        checkInStockButton.setText("Check Is In Stock");
        checkInStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInStockButtonActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(153, 255, 255));
        addButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(0, 0, 0));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(itemIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkInStockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalLable, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(placeOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(itemQTYTExtField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(erroeMasageLable, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkInStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(itemQTYTExtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(erroeMasageLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLable, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
       dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
        array.placeOrder();
        JOptionPane.showMessageDialog(
        this, 
        "Order Sucsesfull.\nTotal :"+netTotal,
        "Order Sucsesfull",
        JOptionPane.ERROR_MESSAGE);
        dtm.setRowCount(0); 
        netTotal = 0;
        totalLable.setText("");
        
        
        
    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void checkInStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInStockButtonActionPerformed
        String itemId = itemIdTextField.getText();
    String quantityStr = itemQTYTExtField.getText();

    // --- Start of Validation ---

    // 1. Check if either field is empty before proceeding.
    if (itemId.trim().isEmpty() || quantityStr.trim().isEmpty()) {
        erroeMasageLable.setText("Item ID and Quantity are required.");
        return; // Stop the method here
    }

    int requestedQty;
    try {
        // 2. Try to convert the quantity string to an integer.
        requestedQty = Integer.parseInt(quantityStr);
    } catch (NumberFormatException e) {
        // This block runs if parseInt fails (e.g., input is "abc" or empty)
        erroeMasageLable.setText("Please enter a valid number for quantity.");
        return; // Stop the method here
    }

    // --- End of Validation ---

    int index = array.searchItemId(itemId);
    if (index == -1) {
        erroeMasageLable.setText("Item Doesn't Exist"); // Corrected spelling
    } else {
        Item temp = array.getItem(index);
        // Use the validated requestedQty variable here
        if (temp.itemQTY >= requestedQty) {
            erroeMasageLable.setText("Item Available");
            addButton.setVisible(true);
        } else {
            erroeMasageLable.setText("Not Enough Items In Stock!");
            // No need to clear the itemIdTextField here, maybe the user made a typo in quantity.
            // itemIdTextField.setText("");
        }
    }
    }//GEN-LAST:event_checkInStockButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int index=array.searchItemId(itemIdTextField.getText());
        Item item=array.getItem(index);
        int total=Integer.parseInt(itemQTYTExtField.getText())*Integer.parseInt(item.itemPrice);
        netTotal+=total;
        totalLable.setText(String.valueOf(netTotal));
        Object[] rowData = {item.itemId,item.itemName,itemQTYTExtField.getText(),total}; 
        dtm.addRow(rowData);
        array.addItemToSell(new Item(item.itemId,Integer.parseInt(itemQTYTExtField.getText())));
        itemIdTextField.setText("");
        itemQTYTExtField.setText("");
        addButton.setVisible(false);

    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton checkInStockButton;
    private javax.swing.JLabel erroeMasageLable;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField itemIdTextField;
    private javax.swing.JTextField itemQTYTExtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JLabel totalLable;
    // End of variables declaration//GEN-END:variables
}
