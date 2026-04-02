
package supermarcketsystem;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
        Array array;

        private String adminUserName="admin";
        private String adminPassword="admin";
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

    public Login() throws IOException {
        initComponents();
        this.array = new Array(); 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        uNameInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordInput = new javax.swing.JTextField();
        logInButten = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 470));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Supermarcket Management System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, 48));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 170, 34));

        uNameInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(uNameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 253, 37));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 170, 34));

        passwordInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(passwordInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 253, 37));

        logInButten.setBackground(new java.awt.Color(153, 255, 255));
        logInButten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logInButten.setForeground(new java.awt.Color(0, 0, 0));
        logInButten.setText("Log In");
        logInButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtenActionPerformed(evt);
            }
        });
        getContentPane().add(logInButten, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 127, 36));

        cancel.setBackground(new java.awt.Color(153, 255, 255));
        cancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancel.setForeground(new java.awt.Color(0, 0, 0));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 127, 36));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void logInButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtenActionPerformed
        String userName = uNameInput.getText();
        String password = passwordInput.getText();
        
        if(userName.equals(adminUserName) && password.equals(adminPassword)){
            new AdminUserForm(array).setVisible(true);
            dispose();
        } else {
            User user = array.validateUser(userName, password);
            if(!(user.username.equals("-1"))){ 
                if(user.status){
                    new ManagerUserForm(array, user.name).setVisible(true);
                } else {
                    new EmployeeUserForm(array, user.name).setVisible(true);
                }
                dispose();
            } else {
                JOptionPane.showMessageDialog(
                    this,
                    "Error: Invalid Username or Password. Please try again.",
                    "Login Failed",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_logInButtenActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Login().setVisible(true);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton logInButten;
    private javax.swing.JTextField passwordInput;
    private javax.swing.JTextField uNameInput;
    // End of variables declaration//GEN-END:variables
}
