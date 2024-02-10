
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp_la
 */
public class DbsConnect {
  public static Connection connectdbs (){
      Connection con = null;
      try {
          con = DriverManager.getConnection("jdbc:derby://localhost:1527/HotelManagementSystem", "jon", "111319");
          return con;
      } catch (SQLException ex) {
          Logger.getLogger(DbsConnect.class.getName()).log(Level.SEVERE, null, ex);
      }
      return null;
  }  
}
