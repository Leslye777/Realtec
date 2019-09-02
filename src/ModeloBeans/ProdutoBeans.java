/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBeans;

public class ProdutoBeans {
    private int id;
    private String nome;
    private int Validade;
    private String medida;

    public void setId(int id) {
        this.id = id;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public int getId() {
        return id;
    }

    public String getMedida() {
        return medida;
    }

    public String getNome() {
        return nome;
    }

    public int getValidade() {
        return Validade;
    }

    public void setValidade(int Validade) {
        this.Validade = Validade;
    }
    
    
    
}
