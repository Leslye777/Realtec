/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloBeans.InsumosBeans;
import ModeloConnection.Banco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InsumosDAO {
     Banco bd = new Banco();
    
    
    public void inserir(InsumosBeans insumos){
         bd.conecta();
        try {
            PreparedStatement pst = bd.conection.prepareStatement("SET FOREIGN_KEY_CHECKS=0;"); 
            pst = bd.conection.prepareStatement("insert into Insumos(id,nome,descricao,quantidade,preco,unMedida) values(?,?,?,?,?,?);");
            pst.setInt(1,insumos.getId());
            pst.setString(2,insumos.getNome());
            pst.setString(3,insumos.getDescricao());
            pst.setInt(4, insumos.getQuantidade());
            pst.setFloat(5,insumos.getPreco());
            pst.setString(6, insumos.getUnMedida());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Inseridos com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir");
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        bd.desconecta();
        
    }

}
