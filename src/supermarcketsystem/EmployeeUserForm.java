
package supermarcketsystem;

import java.io.IOException;


public class EmployeeUserForm extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(EmployeeUserForm.class.getName());

    Array array;
    public EmployeeUserForm(Array array,String name) {
        initComponents();
        this.array=array;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sellItemsButten = new javax.swing.JButton();
        viewStockButten = new javax.swing.JButton();
        logOutButten = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Wellcome Employee");
        jLabel1.setOpaque(true);

        sellItemsButten.setBackground(new java.awt.Color(153, 255, 255));
        sellItemsButten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sellItemsButten.setForeground(new java.awt.Color(0, 0, 0));
        sellItemsButten.setText("Sell Items");
        sellItemsButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellItemsButtenActionPerformed(evt);
            }
        });

        viewStockButten.setBackground(new java.awt.Color(153, 255, 255));
        viewStockButten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewStockButten.setForeground(new java.awt.Color(0, 0, 0));
        viewStockButten.setText("View Stock");
        viewStockButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStockButtenActionPerformed(evt);
            }
        });

        logOutButten.setBackground(new java.awt.Color(153, 255, 255));
        logOutButten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logOutButten.setForeground(new java.awt.Color(0, 0, 0));
        logOutButten.setText("Save And Log Out");
        logOutButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sellItemsButten, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewStockButten, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOutButten, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(sellItemsButten, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewStockButten, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logOutButten, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtenActionPerformed
        try {
            array.logOut();
        } catch (IOException ex) {
            System.getLogger(EmployeeUserForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_logOutButtenActionPerformed

    private void viewStockButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStockButtenActionPerformed
        new StockViewForm(array).setVisible(true);
    }//GEN-LAST:event_viewStockButtenActionPerformed

    private void sellItemsButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellItemsButtenActionPerformed
        new PlaceOrderForm(array).setVisible(true);
    }//GEN-LAST:event_sellItemsButtenActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logOutButten;
    private javax.swing.JButton sellItemsButten;
    private javax.swing.JButton viewStockButten;
    // End of variables declaration//GEN-END:variables
}
