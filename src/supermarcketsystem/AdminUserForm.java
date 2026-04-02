
package supermarcketsystem;

import java.io.IOException;

public class AdminUserForm extends javax.swing.JFrame {
    Array array;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminUserForm.class.getName());


    public AdminUserForm(Array array) {
        initComponents();
        this.array=array;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        registorManagerButton = new javax.swing.JButton();
        registorEmployeeButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Wellcome Admin");
        jLabel1.setOpaque(true);

        registorManagerButton.setBackground(new java.awt.Color(153, 255, 255));
        registorManagerButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registorManagerButton.setForeground(new java.awt.Color(0, 0, 0));
        registorManagerButton.setText("Registor Manager");
        registorManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registorManagerButtonActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registorManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registorEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(registorManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registorEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registorManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registorManagerButtonActionPerformed
        new RegistorManagerForm(array).setVisible(true);
    }//GEN-LAST:event_registorManagerButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        try {
            array.logOut();
        } catch (IOException ex) {
            System.getLogger(AdminUserForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void registorEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registorEmployeeButtonActionPerformed
        new RegistorEmployeeForm(array).setVisible(true);
    }//GEN-LAST:event_registorEmployeeButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton registorEmployeeButton;
    private javax.swing.JButton registorManagerButton;
    // End of variables declaration//GEN-END:variables
}
