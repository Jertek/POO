/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.ProdutoDAO;
import Model.Produtos;
import View.JFHome;
import View.JFProdutos;
import View.ProdutosTM;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/**
 *
 * @author jertek
 */
public class ControleProd implements ActionListener, ListSelectionListener{

    private JFHome home;
    
    
    private ProdutoDAO prodDao = new ProdutoDAO();
    
    private char flagInsAltCons = 'C'; // I --> Incluir  A--> Alterar - C-->Consulta;
    
    private ProdutosTM tabModel;

    public ControleProd(JFHome home) throws SQLException {
        this.home = home;
        inicializaTableModel();
        listarTodos();
        adicionarListeners();
    }
    
    public ControleProd() {
    }   
            
    private void inicializaTableModel() throws SQLException {
        
        tabModel = new ProdutosTM();
        home.getTb_prod_home().setModel(tabModel);
        
        //frmVinhos.getTbVinho().getSelectionModel().addListSelectionListener(this);  
    }
    
     private void adicionarListeners() {
      home.getTb_prod_home().getSelectionModel().addListSelectionListener(this);
    }
    
    
    private void listarTodos() {
        try {
            tabModel.limpar();
            tabModel.setProd(prodDao.ListaProdutos());
        } catch (SQLException ex) {
            Logger.getLogger(ControleProd.class.getName()).log(Level.SEVERE, null, ex);
        }
        //habilita botoes Alterar e Excluir
       // home.getBtAlterar().setEnabled(true);
        //home.getBtExcluir().setEnabled(true);
    }
    
    
    public void excluirProd() {
      
        if((tabModel.getProd(home.getTb_prod_home().getSelectedRow()) != null ) ){
            int op = JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Exclusão", JOptionPane.YES_NO_OPTION);
        
            if (op==0){
                try{
                    prodDao.Excluir( tabModel.getProd(home.getTb_prod_home().getSelectedRow()));
                }catch (SQLException e){
                }
                JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!", "Exclusão", JOptionPane.INFORMATION_MESSAGE);
                listarTodos();
               
           }
        }
    }
           
          
    @Override
    public void actionPerformed(ActionEvent acao) {
        
         if(acao.getActionCommand().equals("Incluir")){
            incluirVinho();
        } else if (acao.getActionCommand().equals("Alterar")){
            alterarVinho();
        } else if (acao.getActionCommand().equals("Excluir")){
            excluirProd();        
        } else if (acao.getActionCommand().equals("Pesquisar")){
            pesquisarprod();
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        try {
            Produtos prod = tabModel.getProd(home.getTb_prod_home().getSelectedRow());
            
        }catch (IndexOutOfBoundsException e) {
        }
    }

    private void incluirVinho() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void alterarVinho() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void pesquisarprod() {
        
        Produtos prod;
        try{
            String produto = JOptionPane.showInputDialog("Digite o nome do produto");
            prod = prodDao.localizarProduto(produto);
            
            dadosprod(prod);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"nao tem" +e);
        }
    
    }
    
    private void dadosprod(Produtos prod) {
        if(prod.getIdProduto() != 0){
        JOptionPane.showMessageDialog(null, "Produto:"+prod.getProduto()+"\n"
                                            +"Quantidade"+prod.getQuantidade()+"\n"
                                            +"Validade"+prod.getValidade()+"\n"
                                            +"Tipo"+prod.getTipo()+"\n");
        }else{
            JOptionPane.showMessageDialog(null,"Produto não encontrado");
        }
        
        
       
    }
    
}
