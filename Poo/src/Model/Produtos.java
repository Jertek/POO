/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author jertek
 */
public class Produtos {
    String produto;
    String quantidade;
    String validade;
    String tipo;
    int idProduto;

    public Produtos() {
    }

    public Produtos(String produto, String quantidade, String validade, String tipo, int idProduto) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.validade = validade;
        this.tipo = tipo;
        this.idProduto = idProduto;
    }

    public Produtos(String produto, String quantidade, String validade, String tipo) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.validade = validade;
        this.tipo = tipo;
    }

    

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    
}
