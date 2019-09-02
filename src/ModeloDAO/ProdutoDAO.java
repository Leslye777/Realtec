/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloBeans.ProdutoBeans;
import ModeloConnection.Banco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ModeloBeans.ConsultaBeans;
/**
 *
 * @author leslye
 */
public class ProdutoDAO {
    Banco bd = new Banco();
    
    
    public void inserir(ProdutoBeans produto){
         bd.conecta();
        try {
            PreparedStatement pst = bd.conection.prepareStatement("SET FOREIGN_KEY_CHECKS=0;"); 
            pst = bd.conection.prepareStatement("insert into Produto(id,nome,DtValidade,UnMedida) values(?,?,?,?);");
            pst.setInt(1,produto.getId());
            pst.setString(2,produto.getNome());
            pst.setInt(3,produto.getValidade());
            pst.setString(4, produto.getMedida());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Inseridos com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir");
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        bd.desconecta();
        
    }
    
    public ConsultaBeans BuscaProduto(ConsultaBeans mod){
        bd.conecta();
        bd.executaSQL("select * from Produto where id="+mod.getPesquisa()+";");
        
        try {
            bd.rst.first();
            mod.setId(bd.rst.getInt("id"));
            mod.setNome(bd.rst.getString("nome"));
            mod.setDtValidade(bd.rst.getInt("DtValidade"));
            mod.setUnMedida(bd.rst.getString("UnMedida"));
            bd.executaSQL("select sum(quantidade * preco) as total from Insumos where id = "+mod.getPesquisa()+";");
            bd.rst.first();
            mod.setPreco(bd.rst.getFloat("total"));
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Não encontrado");
        }
        
        return mod;
    }
    
}
    
