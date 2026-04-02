/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarcketsystem;

import java.io.IOException;

/**
 *
 * @author sanda
 */
public class ManagerUserForm extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ManagerUserForm.class.getName());

    Array array;
    public ManagerUserForm(Array array,String name) {
        initComponents();
        this.array=array;
        welcomeLable.setText("Welcome "+name);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLable = new javax.swing.JLabel();
        addItemButton = new javax.swing.JButton();
        registorEmployeeButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        stockViewButton = new javax.swing.JButton();
        removeItemButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLable.setBackground(new java.awt.Color(204, 255, 204));
        welcomeLable.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        welcomeLable.setForeground(new java.awt.Color(255, 0, 0));
        welcomeLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLable.setText("Wellcome Manager");
        welcomeLable.setOpaque(true);

        addItemButton.setBackground(new java.awt.Color(153, 255, 255));
        addItemButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addItemButton.setForeground(new java.awt.Color(0, 0, 0));
        addItemButton.setText("Add Items");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        registorEmployeeButton.setBackground(new java.awt.Color(153, 255, 255));
        registorEmployeeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registorEmployeeButton.setForeground(new java.awt.Color(0, 0, 0));
        registorEmployeeButton.setText("Registor Employee");
        registorEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registorEmployeeButtonActionPerformed(evt);
            }
        });

        logOutButton.setBackground(new java.awt.Color(153, 255, 255));
        logOutButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(0, 0, 0));
        logOutButton.setText("Save And Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        stockViewButton.setBackground(new java.awt.Color(153, 255, 255));
        stockViewButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stockViewButton.setForeground(new java.awt.Color(0, 0, 0));
        stockViewButton.setText("Stock View");
        stockViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockViewButtonActionPerformed(evt);
            }
        });

        removeItemButton.setBackground(new java.awt.Color(153, 255, 255));
        removeItemButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        removeItemButton.setForeground(new java.awt.Color(0, 0, 0));
        removeItemButton.setText("Remove Items");
        removeItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomeLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registorEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(welcomeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeItemButton)
                .addGap(18, 18, 18)
                .addComponent(stockViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registorEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        try {
            array.logOut();
        } catch (IOException ex) {
            System.getLogger(ManagerUserForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void registorEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registorEmployeeButtonActionPerformed
        new RegistorEmployeeForm(array).setVisible(true);
    }//GEN-LAST:event_registorEmployeeButtonActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        new AddItemForm(array).setVisible(true);
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void removeItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemButtonActionPerformed
        new RemoveItemForm(array).setVisible(true);
    }//GEN-LAST:event_removeItemButtonActionPerformed

    private void stockViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockViewButtonActionPerformed
        new StockViewForm(array).setVisible(true);
    }//GEN-LAST:event_stockViewButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton registorEmployeeButton;
    private javax.swing.JButton removeItemButton;
    private javax.swing.JButton stockViewButton;
    private javax.swing.JLabel welcomeLable;
    // End of variables declaration//GEN-END:variables
}
