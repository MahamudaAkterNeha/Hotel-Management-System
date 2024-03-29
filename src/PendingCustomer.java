
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class PendingCustomer extends javax.swing.JFrame {

    /**
     * Creates new form PendingCustomer
     */
    Connection con;
    public PendingCustomer() {
        initComponents();
        try {
          con = DriverManager.getConnection("jdbc:derby://localhost:1527/HotelManagementSystem", "jon", "111319");
          
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Database not connected","Error",JOptionPane.ERROR_MESSAGE);
      }
        
        
        showTable();
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
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PendingCustomerList = new javax.swing.JTable();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search by Name or Email:");

        PendingCustomerList.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        PendingCustomerList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Phone Number", "Email", "Present Address", "Permanent Address", "Age", "Number of Children", "Number of Adults", "Total Residants", "Room Type", "Bed Type", "Total Number of Days", "Check in Date", "Check out Date", "Total Cost", "Serial Number of Total Rooms", "Confirmation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        PendingCustomerList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PendingCustomerListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PendingCustomerList);

        Back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1840, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void PendingCustomerListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PendingCustomerListMouseClicked
        // TODO add your handling code here:
        
        int index = PendingCustomerList.getSelectedRow();
        TableModel model = PendingCustomerList.getModel();
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
        if(confirmation.equals("Not Confirmed")){
         
        
            try{
                int a = JOptionPane.showConfirmDialog(null,"Do you want to confirm "+email+"","Select",JOptionPane.YES_NO_OPTION);
               String query7 = "INSERT INTO CUSTOMERDATA (\"NAME\", PHONENUMBER,EMAIL,PRESENTADDRESS,PERMANENTADDRESS,AGE,NUMBEROFCHILDREN,NUMBEROFADULTS,TOTALRESIDANTS,ROOMTYPE,BEDTYPE,TOTALDAYS,CHECKINDATE,CHECKOUTDATE,TOTALCOST,SERIALNUMBEROFROOMS) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
            PreparedStatement ps = con.prepareStatement(query7);
            ps.setString(1, CusName);
            ps.setString(2, phoneNumber);
            ps.setString(3, email);
            ps.setString(4, preAdd); 
            ps.setString(5, permAdd);
            ps.setString(6, age);
            ps.setString(7, numofChildren);
            ps.setString(8, numofAdults);
            ps.setString(9, totalResidants);
            ps.setString(10,roomType);
            ps.setString(11,bedType);
            ps.setString(12,totalDays);
            ps.setString(13,checkinDate);
            ps.setString(14,checkoutDate);
            ps.setString(15,totalCost);
            ps.setString(16,serialNumberofRoom);
            ps.executeUpdate();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
        
    }//GEN-LAST:event_PendingCustomerListMouseClicked

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
            java.util.logging.Logger.getLogger(PendingCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PendingCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PendingCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendingCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PendingCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTable PendingCustomerList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void showTable() {
       
         
        String query3 = "SELECT * FROM PENDINGCUSTOMER";
        try{
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery(query3);
         PendingCustomerList.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Database not connected","Error",JOptionPane.ERROR_MESSAGE);
      }
    
    
    }
}
