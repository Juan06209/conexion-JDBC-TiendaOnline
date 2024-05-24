/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bdtiendaonline;

/**
 *
 * @author Juan
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class BDTiendaOnline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String usuario = "root";
        String paswword = "";
        String url = "jdbc:mysql://localhost:3306/bd_tiendaonline";
        Connection conexion;
        Statement statement;
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BDTiendaOnline.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            
            conexion = DriverManager.getConnection(url,usuario,paswword);
            statement = conexion.createStatement();
            statement.executeUpdate("INSERT INTO comprador(CC,NOMBRE,CONTRASEÑA,DIRECCION,TEL) VALUES('1044609397','JUAN','JUAN123','CR11 N7-57','3015061515')");
            rs = statement.executeQuery("SELECT * FROM comprador");
            rs.next();
            
            do {
                System.out.println(rs.getInt("idComprador")+ " : "+rs.getInt("cc"));
            }while(rs.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(BDTiendaOnline.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
