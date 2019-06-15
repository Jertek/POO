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
import java.util.ArrayList;

/**
 *
 * @author jertek
 */
public class ProdutoDAO {
    private Connection con = null;
    private PreparedStatement stm;
    private ResultSet rs;
    private SmartStockDAO dao;
    
    //construtor para conexão BD
     public ProdutoDAO()
    {
        dao = new SmartStockDAO();
        try{
            con = dao.getConnetion();
        }
        
        catch(SQLException e){
            
    }
    
        
    
    }
    
    public int Inserir (Usuario produto) throws SQLException{
        
        String sql = " Insert into produto (Nome, Apelido , Telefone, Endereco, Email, Senha) values (?,?,?,?,?,?)";
        
        stm = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        stm.setString(1, produto.getNome());
        stm.setString(2, produto.getApelido());
        stm.setString(3, produto.getTelefone());
        stm.setString(4, produto.getEndereco());
        
        
        
        
        stm.executeUpdate();
        
        rs = stm.getGeneratedKeys();
        
        //atualiza o atributo codigo (autoincremento) do objeto instanciado
        if(rs.next()){
            produto.setId(rs.getInt(1));
        }
        
        return produto.getId();
    }
    
    public void Alterar (Usuario produto) throws SQLException{
        String sql = "Update usuario set nome=?, Apelido=?,Telefone = ?, Endereco=?, Email=?, Senha = ?, id =?   where codigo=?";
        
        stm = con.prepareStatement(sql);
        
        stm.setString(1, produto.getNome());
        stm.setString(2, produto.getApelido());
        stm.setString(3, produto.getTelefone());
        stm.setString(4, produto.getEndereco());
        
        
        stm.executeUpdate();
    }
    
    public void Excluir (Usuario usuario) throws SQLException{
        
        String sql = "Delete from usuario where codigo = ?";
        stm = con.prepareStatement(sql);
        stm.setInt(1,usuario.getId());
        stm.executeUpdate();
    }
    
    public Usuario localizarUsuario(String locUsuario) throws SQLException{
        
        String sql = "Select * from usuario where Nome = ? ";
        
        stm = con.prepareStatement(sql);
        stm.setString(1,locUsuario);
        rs = stm.executeQuery();
        
        Usuario usuario = new Usuario(rs.getString(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getString(5),
                                    rs.getString(6),
                                    rs.getInt(7));
        return usuario;
    }
    
    
            
    public Usuario Login(String usuario, String senha) throws SQLException{
       
       Usuario user = new Usuario();
        
        String sql = "Select * From usuario where Apelido = ? AND Senha = ? " ;
         stm = con.prepareStatement(sql);
                
        stm.setString(1, usuario);
        stm.setString(2, senha);
        
        rs = stm.executeQuery();
               
        while(rs.next()){
             user = new Usuario(rs.getString(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getString(5),
                                    rs.getString(6),
                                    rs.getInt(7));
        }
        return user;
    }
    
     


}
