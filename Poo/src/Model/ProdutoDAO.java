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
     
      public ArrayList<Produtos> ListaProdutos () throws SQLException{
       
        ArrayList<Produtos> prod = new ArrayList<Produtos>();
        
        String sql = "Select * From produto";
        
        stm = con.prepareStatement(sql);
        rs = stm.executeQuery();
        
        while(rs.next()){
             prod.add(new Produtos(rs.getString(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getString(4),
                                Integer.parseInt(rs.getString(5))));
        }
        return prod;
    }   
    
    
    
    public int Inserir (Produtos produto) throws SQLException{
        
        String sql = " Insert into produto (produto, quantidade , validade, tipo) values (?,?,?,?)";
        
        stm = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        stm.setString(1, produto.getProduto());
        stm.setString(2, produto.getQuantidade());
        stm.setString(3, produto.getValidade());
        stm.setString(4, produto.getTipo());
                 
               
        stm.executeUpdate();
        
        rs = stm.getGeneratedKeys();
        
        //atualiza o atributo codigo (autoincremento) do objeto instanciado
        if(rs.next()){
            produto.setIdProduto(rs.getInt(1));
        }
        
        return produto.getIdProduto();
    }
    
    public void Alterar (Produtos produto) throws SQLException{
        String sql = "Update produto set Produto=?, Quantidade=?, Validade = ?, Tipo=?";
         
        stm = con.prepareStatement(sql);
        stm.setString(1, produto.getProduto());
        stm.setString(2, produto.getQuantidade());
        stm.setString(3, produto.getValidade());
        stm.setString(4, produto.getTipo());
                       
        
        stm.executeUpdate();
    }
    
    public void Excluir (Produtos prod) throws SQLException{
        
        String sql = "Delete from produto where Idproduto = ?";
        stm = con.prepareStatement(sql);
        stm.setInt(1,prod.getIdProduto());
        stm.executeUpdate();
    }
    
    public Produtos localizarProduto(String locProduto) throws SQLException{
        
        String sql = "Select * from produto where Produto = ? ";
        
        stm = con.prepareStatement(sql);
        stm.setString(1,locProduto);
        rs = stm.executeQuery();
        
        Produtos prod = new Produtos();
        while(rs.next()){
         prod = new Produtos(rs.getString(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getInt(1));
                               
          }
        return prod;
    }
    
}
