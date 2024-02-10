
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;



public class ManageRoom extends javax.swing.JFrame {

    Connection con;
    
    public ManageRoom() {
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
        RoomInfoTable = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        jlebel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AddRoom = new javax.swing.JButton();
        RoomNumber = new javax.swing.JTextField();
        RoomType = new javax.swing.JTextField();
        BedType = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RoomInfoTable.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        RoomInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Bed Type", "Availabilty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(RoomInfoTable);
        if (RoomInfoTable.getColumnModel().getColumnCount() > 0) {
            RoomInfoTable.getColumnModel().getColumn(0).setResizable(false);
            RoomInfoTable.getColumnModel().getColumn(1).setResizable(false);
            RoomInfoTable.getColumnModel().getColumn(2).setResizable(false);
            RoomInfoTable.getColumnModel().getColumn(3).setResizable(false);
            RoomInfoTable.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 319, 1268, 418));

        Back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Back.setText("Back");
        Back.setToolTipText("");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 820, 139, 65));

        jlebel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlebel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlebel1.setText("Room Number :");
        getContentPane().add(jlebel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 43, 154, 46));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Room Type :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 115, 143, 41));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Bed Type :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 179, 143, 41));

        AddRoom.setBackground(new java.awt.Color(153, 204, 255));
        AddRoom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddRoom.setText("Add Room");
        AddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRoomActionPerformed(evt);
            }
        });
        getContentPane().add(AddRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 248, 183, 53));

        RoomNumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(RoomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 43, 280, 46));

        RoomType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(RoomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 112, 280, 46));

        BedType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(BedType, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 176, 280, 46));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CommonBackground2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void AddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRoomActionPerformed
        // TODO add your handling code here:
        String roomNum = RoomNumber.getText();
        String roomType = RoomType.getText();
        String bedType = BedType.getText();
        String availability = "Available";
        
        
        if(roomNum.equals("") || roomType.equals("") || bedType.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please enter all data!");
        }
        else
        {
            String Data[] = {roomNum,roomType,bedType,"Available"};
            
            String query2 = "INSERT INTO ROOMS (ROOMNUMBER, ROOMTYPE, BEDTYPE, AVAILABILITY) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query2);
            ps.setString(1, roomNum);
            ps.setString(2, roomType);
            ps.setString(3, bedType);
            ps.setString(4, availability);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NewCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            DefaultTableModel tblModel = (DefaultTableModel)RoomInfoTable.getModel();
            
            tblModel.addRow(Data);
            RoomNumber.setText("");
            RoomType.setText("");
            BedType.setText("");
        
        
        }
    }//GEN-LAST:event_AddRoomActionPerformed

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
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRoom;
    private javax.swing.JButton Back;
    private javax.swing.JTextField BedType;
    private javax.swing.JTable RoomInfoTable;
    private javax.swing.JTextField RoomNumber;
    private javax.swing.JTextField RoomType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlebel1;
    // End of variables declaration//GEN-END:variables

    private void showTable() {
         
        String query3 = "SELECT * FROM ROOMS";
        try{
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery(query3);
         RoomInfoTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Database not connected","Error",JOptionPane.ERROR_MESSAGE);
      }
    
    }
}
