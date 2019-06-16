/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Produtos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jertek
 */
public class ProdutosTM extends AbstractTableModel{

    private ArrayList<Produtos> prod_linhas;
    private String[] colunas = new String[]{"Produto", "Quantidade", "Validade", "Tipo" };
    
    public ProdutosTM(){
        prod_linhas = new ArrayList<Produtos>();
        
    };

    public ProdutosTM(ArrayList<Produtos> prod_linhas) {
        prod_linhas = new ArrayList<Produtos>(prod_linhas);
    }
      
    
    @Override
    public int getRowCount() {
        return  prod_linhas.size();
    }

    @Override
    public int getColumnCount() {
        return  colunas.length;
    }

    
    
     @Override 
    public String getColumnName(int coluna){
        return colunas[coluna];
    }
    
    @Override
    public Object getValueAt(int linha, int coluna) { 
     
        switch(coluna){
            case 0:
                return prod_linhas.get(linha).getProduto();
            case 1:
               return prod_linhas.get(linha).getQuantidade();
            case 2:
                return prod_linhas.get(linha).getValidade();
            case 3:
                return prod_linhas.get(linha).getTipo();
            
        }
        return null;       
    }
    
    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch(coluna){
            case 0:
                prod_linhas.get(linha).setProduto((String)valor);
                break;
            case 1:
                prod_linhas.get(linha).setQuantidade((String)valor);
                break;
            case 2:
                prod_linhas.get(linha).setValidade((String)valor);
                break;
            case 3:
                prod_linhas.get(linha).setTipo((String)valor);
                break;
            
        } 
        fireTableRowsUpdated(linha, linha);
    }
    
    public void addVinho(Produtos p){       
        prod_linhas.add(p);
        fireTableDataChanged();
    }
    
    public void remove(int indiceLinha){
        prod_linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }
    
    public Produtos getProd(int indiceLinha){
        return prod_linhas.get(indiceLinha);
    }
            
    
    public List<Produtos> getProdL(){
        return prod_linhas;
    }
    
    
    public void setProd(List<Produtos> prod){
        
        int tamanhoAntigo = this.getRowCount();
        
        //adiciona os registros
        prod_linhas.addAll(prod);
        fireTableRowsInserted(tamanhoAntigo, this.getRowCount() - 1);
    }
    
    public void limpar(){
        prod_linhas.clear();
        fireTableDataChanged();
    }
    
    //verifica se a table model está vazia
    public boolean isEmpty(){
        return prod_linhas.isEmpty();
    }
}
     
    
    

    
