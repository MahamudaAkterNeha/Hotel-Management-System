/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotir
 */
public class SelectionPage extends javax.swing.JFrame {

    /**
     * Creates new form SelectionPage
     */
    public SelectionPage() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdministrativeLogin = new javax.swing.JButton();
        Reception = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdministrativeLogin.setBackground(new java.awt.Color(255, 255, 255));
        AdministrativeLogin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        AdministrativeLogin.setText("Administrative Login");
        AdministrativeLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministrativeLoginActionPerformed(evt);
            }
        });
        getContentPane().add(AdministrativeLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 391, 459, 107));

        Reception.setBackground(new java.awt.Color(255, 255, 255));
        Reception.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Reception.setText("Reception");
        Reception.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceptionActionPerformed(evt);
            }
        });
        getContentPane().add(Reception, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 214, 459, 107));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SelectionPage.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1850, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(1850, 1000));
        jLabel1.setPreferredSize(new java.awt.Dimension(1850, 1000));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReceptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceptionActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Reception().setVisible(true);
    }//GEN-LAST:event_ReceptionActionPerformed

    private void AdministrativeLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministrativeLoginActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdministrativeLogin().setVisible(true);
    }//GEN-LAST:event_AdministrativeLoginActionPerformed

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
            java.util.logging.Logger.getLogger(SelectionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectionPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdministrativeLogin;
    private javax.swing.JButton Reception;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
