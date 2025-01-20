package br.com.elton.pluginMinecraft.connection;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {

   public Connection getConnection(){
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/bd_minecraft?user=root&password=eltinho123";

            con = DriverManager.getConnection(url);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
       return con;
   }

}
