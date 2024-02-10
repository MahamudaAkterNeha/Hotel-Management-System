
public class AdminPanel extends javax.swing.JFrame {

    public AdminPanel() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PendingCustomer = new javax.swing.JButton();
        ManageRooms = new javax.swing.JButton();
        CustomerReviews = new javax.swing.JButton();
        CustomerData = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SignOut = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PendingCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PendingCustomer.png"))); // NOI18N
        PendingCustomer.setToolTipText("");
        PendingCustomer.setActionCommand("PendingCustomer");
        PendingCustomer.setMaximumSize(new java.awt.Dimension(40, 100));
        PendingCustomer.setMinimumSize(new java.awt.Dimension(40, 100));
        PendingCustomer.setPreferredSize(new java.awt.Dimension(40, 100));
        PendingCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PendingCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(PendingCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 230, 270));

        ManageRooms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManageRooms.png"))); // NOI18N
        ManageRooms.setText("jButton1");
        ManageRooms.setActionCommand("ManageRooms");
        ManageRooms.setMaximumSize(new java.awt.Dimension(40, 100));
        ManageRooms.setMinimumSize(new java.awt.Dimension(40, 100));
        ManageRooms.setPreferredSize(new java.awt.Dimension(40, 100));
        ManageRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageRoomsActionPerformed(evt);
            }
        });
        getContentPane().add(ManageRooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 320, 230, 270));

        CustomerReviews.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CustomerReview.jpg"))); // NOI18N
        CustomerReviews.setMaximumSize(new java.awt.Dimension(40, 100));
        CustomerReviews.setMinimumSize(new java.awt.Dimension(40, 100));
        CustomerReviews.setPreferredSize(new java.awt.Dimension(40, 100));
        CustomerReviews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerReviewsActionPerformed(evt);
            }
        });
        getContentPane().add(CustomerReviews, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 320, 230, 270));

        CustomerData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customerdata.jpg"))); // NOI18N
        CustomerData.setActionCommand("CustomerData");
        CustomerData.setMaximumSize(new java.awt.Dimension(40, 100));
        CustomerData.setMinimumSize(new java.awt.Dimension(40, 100));
        CustomerData.setPreferredSize(new java.awt.Dimension(40, 100));
        CustomerData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerDataActionPerformed(evt);
            }
        });
        getContentPane().add(CustomerData, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 230, 270));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Data");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 230, 57));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pending Customer");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 600, 230, 57));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manage Rooms");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 600, 230, 57));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Customer Review");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 600, 230, 57));

        SignOut.setBackground(new java.awt.Color(255, 255, 255));
        SignOut.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SignOut.setText("Sign Out");
        SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutActionPerformed(evt);
            }
        });
        getContentPane().add(SignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 820, 198, 78));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin Panel.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setMaximumSize(new java.awt.Dimension(1850, 1000));
        jLabel5.setMinimumSize(new java.awt.Dimension(1850, 1000));
        jLabel5.setPreferredSize(new java.awt.Dimension(1850, 1000));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1850, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerDataActionPerformed
        // TODO add your handling code here:
        new CustomerData().setVisible(true);
    }//GEN-LAST:event_CustomerDataActionPerformed

    private void PendingCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PendingCustomerActionPerformed
        // TODO add your handling code here:
        new PendingCustomer().setVisible(true);
    }//GEN-LAST:event_PendingCustomerActionPerformed

    private void ManageRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageRoomsActionPerformed
        // TODO add your handling code here:
        new ManageRoom().setVisible(true);
    }//GEN-LAST:event_ManageRoomsActionPerformed

    private void CustomerReviewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerReviewsActionPerformed
        // TODO add your handling code here:
        new CustomerReviews().setVisible(true);
    }//GEN-LAST:event_CustomerReviewsActionPerformed

    private void SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new SelectionPage().setVisible(true);
    }//GEN-LAST:event_SignOutActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustomerData;
    private javax.swing.JButton CustomerReviews;
    private javax.swing.JButton ManageRooms;
    private javax.swing.JButton PendingCustomer;
    private javax.swing.JButton SignOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
