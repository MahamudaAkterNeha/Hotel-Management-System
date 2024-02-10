
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class Bill extends javax.swing.JFrame {

     Connection con ;
     
    public Bill() {
        initComponents();
        
         
      try {
          con = DriverManager.getConnection("jdbc:derby://localhost:1527/HotelManagementSystem", "jon", "111319");
          
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Database not connected","Error",JOptionPane.ERROR_MESSAGE);
      }
      
       showTable();
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Bill = new javax.swing.JTextArea();
        CreatBill = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "PhoneNumber", "Email", "PresentAddress", "PermanentAddress", "Age", "NumberofChildren", "NumberofAdults", "TotalResidants", "RoomType", "BedType", "TotalDays", "CheckInDate", "CheckOutDate", "TotalCost", "SerialNumberOfRooms"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BillTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BillTable);
        if (BillTable.getColumnModel().getColumnCount() > 0) {
            BillTable.getColumnModel().getColumn(5).setResizable(false);
            BillTable.getColumnModel().getColumn(8).setResizable(false);
            BillTable.getColumnModel().getColumn(15).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 67, 1876, -1));

        Bill.setColumns(20);
        Bill.setRows(5);
        jScrollPane2.setViewportView(Bill);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 1033, 335));

        CreatBill.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CreatBill.setText("Create Bill");
        getContentPane().add(CreatBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(1476, 540, 250, 72));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CommonBackground2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BillTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTableMouseClicked
        // TODO add your handling code here:
        int index = BillTable.getSelectedRow();
        TableModel model = BillTable.getModel();
        String email = model.getValueAt(index, 2).toString();
        String confirmation = model.getValueAt(index, 16).toString();
        String CusName = model.getValueAt(index, 0).toString();
        String phoneNumber = model.getValueAt(index, 1).toString();
        String preAdd = model.getValueAt(index, 3).toString();
        String permAdd = model.getValueAt(index, 4).toString();
        String age = model.getValueAt(index, 5).toString();
        String numofChildren = model.getValueAt(index, 6).toString();
        String numofAdults = model.getValueAt(index, 7).toString();
        String totalResidants = model.getValueAt(index, 8).toString();
        String roomType = model.getValueAt(index, 9).toString();
        String bedType = model.getValueAt(index, 10).toString();
        String totalDays = model.getValueAt(index,11).toString();
        String checkinDate = model.getValueAt(index, 12).toString();
        String checkoutDate = model.getValueAt(index, 13).toString();
        String totalCost = model.getValueAt(index, 14).toString();
        String serialNumberofRoom = model.getValueAt(index, 15).toString();
        
        
        //Bill.setText("Name: "+ CusName+);
    }//GEN-LAST:event_BillTableMouseClicked

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Bill;
    private javax.swing.JTable BillTable;
    private javax.swing.JButton CreatBill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void showTable() {
         String query8 = "SELECT * FROM CUSTOMERDATA";
        try{
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery(query8);
         BillTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Database not connected","Error",JOptionPane.ERROR_MESSAGE);
      }
    }
}
