/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author jertek
 */
public class SmartStockDAO {
    //Dados para conexão
    // Nome do Driver(link do servidor)
    private String driver =  "com.mysql.jdbc.Driver";
    
    //Dados para se conectar no server
    private String url = "jdbc:mysql://localhost:3306/smartstock";
    private String usuario = "root";
    private String senha = "";
    
    public Connection getConnetion() throws SQLException{
        Connection con = null;
        
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, senha);
        }
        catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Problema na conexão com a fonte de dados!" + e ,"Banco de dados", JOptionPane.ERROR_MESSAGE);
        }
        return con;
            
        
        
    }
    public void fecharConexao(Connection con, Statement stmt, ResultSet rs){
        
        try{
            if (stmt != null){
                stmt.close();
            }
        }
        catch (SQLException e){
            
        }
        
        try{
            if (rs != null){
                rs.close();
            }
        }
        catch (SQLException e){
        }
               
        
        try {
            con.close();
        } catch (SQLException e) {
        }
        System.out.println("Tudo desconectado!");
    }
}
