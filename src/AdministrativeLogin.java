
//import java.sql.*;
//import javax.swing.JOptionPane;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;


public class AdministrativeLogin extends javax.swing.JFrame {
/*Connection con = DbsConnect.connectdbs();
PreparedStatement ps =null;
ResultSet rs = null;
    /**
     * Creates new form AdministrativeLogin
     */
    public AdministrativeLogin() {
        initComponents();
        //DbsConnect.connectdbs();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Password = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        SignIn = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 350, 130));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 670, -1));

        Password.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Password.setText("Password:");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 660, 163, 50));

        Username.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Username.setText("Username:");
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 590, 163, 50));

        username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 590, 317, 50));

        password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 660, 317, 50));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 840, 670, -1));

        SignIn.setBackground(new java.awt.Color(255, 255, 255));
        SignIn.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        SignIn.setText("SignIn");
        SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInActionPerformed(evt);
            }
        });
        getContentPane().add(SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 740, 150, 60));

        Back.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 860, 173, 64));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin Panel.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1850, 1000));
        jLabel2.setMinimumSize(new java.awt.Dimension(1850, 1000));
        jLabel2.setPreferredSize(new java.awt.Dimension(1850, 1000));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInActionPerformed
        // TODO add your handling code here:
       /*String Signin = "SELECT * FROM Login WHERE Username=Oyishee AND Password=20210104011";
       try{
        ps =con.prepareStatement(Signin);
        ps.setString(1, username.getText());
        ps.setString(2, password.getText());
        rs=ps.executeQuery();
        if(rs.next()){
            new AdminPanel().setVisible(true);
        }
       }catch(SQLException ex){
         JOptionPane.showMessageDialog(null, ex);
       }*/
      String Username = username.getText();
      String Password = password.getText();
      if(("Oyishee".equals(Username) && "20210104011".equals(Password)) || ("Neha".equals(Username) && "20210104013".equals(Password)) || ("Jotirbe".equals(Username) && "20210104019".equals(Password))){
          this.setVisible(false);
          new AdminPanel().setVisible(true);
      }
      
    }//GEN-LAST:event_SignInActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new SelectionPage().setVisible(true);
        
    }//GEN-LAST:event_BackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdministrativeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrativeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrativeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrativeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministrativeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Password;
    private javax.swing.JButton SignIn;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
