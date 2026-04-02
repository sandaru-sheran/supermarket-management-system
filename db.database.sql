-- 1. Create the database
CREATE DATABASE IF NOT EXISTS supermarket_db;
USE supermarket_db;

-- 2. Create the Users table
-- This matches the User object expected by your Login.java
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL,
    status BOOLEAN NOT NULL COMMENT '1 (true) for Manager, 0 (false) for Employee'
);

-- 3. Create the Items/Inventory table
-- A standard structure for the products in your supermarket
CREATE TABLE items (
    item_id INT AUTO_INCREMENT PRIMARY KEY,
    item_code VARCHAR(50) UNIQUE NOT NULL,
    item_name VARCHAR(150) NOT NULL,
    category VARCHAR(50),
    price DECIMAL(10, 2) NOT NULL,
    stock_quantity INT NOT NULL DEFAULT 0
);

-- 4. Insert some test data so you can test your login screen right away!
-- Note: Your "admin" is hardcoded in Java, so these are just standard users.
INSERT INTO users (name, username, password, status) VALUES 
('Main Manager', 'manager_user', 'manager123', 1),
('Cashier One', 'cashier_user', 'cashier123', 0);

-- Insert a few sample items
INSERT INTO items (item_code, item_name, category, price, stock_quantity) VALUES 
('ITM001', 'Samba Rice 1kg', 'Grocery', 220.00, 50),
('ITM002', 'Munchee Super Cream Cracker', 'Snacks', 150.00, 100),
('ITM003', 'Anchor Milk Powder 400g', 'Dairy', 1150.00, 25);
