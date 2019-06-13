/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import FrameWork.SmartStockDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jertek
 */
public class UsuarioDAO {
    private Connection con = null;
    private PreparedStatement stm;
    private ResultSet rs;
    private SmartStockDAO dao;
    
     public UsuarioDAO(){
        dao = new SmartStockDAO();
        try{
            con = dao.getConnetion();
        }
        
        catch(SQLException e){
            
        }
    }
     


}
