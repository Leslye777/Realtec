/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBeans;

/**
 *
 * @author leslye
 */
public class InsumosBeans {
    private int id;
    private String descricao;
    private String nome;
    private int quantidade;
    private float preco;
    private String unMedida;

    public void setUnMedida(String unMedida) {
        this.unMedida = unMedida;
    }

    public String getUnMedida() {
        return unMedida;
    }
    
    

    public void setId(int id) {
        this.id = id;
    }



    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



    public int getId() {
        return id;
    }

   

    public float getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }
    
    
   
    
    
}
