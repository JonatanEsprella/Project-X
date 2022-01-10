/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cecfg.empleadosDAL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author TOSHIBA
 */
public class conexion {
    String cadenaDeConexion = "jdbc:sqlserver://localhost:1433;databaseName=CEC";
    
    public conexion(){
        
          
    }

    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        
        try (Connection con = DriverManager.getConnection(cadenaDeConexion, "cecfgi", "123"); Statement stmt = con.createStatement();){
            stmt.executeQuery(strSentenciaSQL);
            
            System.out.println("CORRECTO CONWXION ");
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("CORRECTO CONWXION NO CONECTADA");
            return 0;
        }
        
    }
    
    public ResultSet consultaRegistros(String strSentenciaSQL){
        try (Connection con = DriverManager.getConnection(cadenaDeConexion, "cecfgi", "123"); Statement stmt = con.createStatement();){
            ResultSet respuesta = stmt.executeQuery(strSentenciaSQL);
            return respuesta;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
        
    }
    
    
      
}
