/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualização;

import ModeloBeans.ProdutoBeans;
import ModeloDAO.ProdutoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author leslye
 */
public class CadastroProdutos extends javax.swing.JFrame {

    /**
     * Creates new form CadastroProdutos
     */
    
    public CadastroProdutos() {
        initComponents();
    }
    
    ProdutoDAO produtoDAO = new ProdutoDAO();
    ProdutoBeans produtoBeans = new ProdutoBeans();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1Codigo = new javax.swing.JTextField();
        jTextField1NomeProduto = new javax.swing.JTextField();
        jComboBox1UnidadeMedida = new javax.swing.JComboBox<>();
        jSpinner1PrazodeValidade = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Código");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 200, 180, 60);

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Prazo de validade");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 120, 160, 20);

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(1, 1, 1));
        jLabel5.setText("Produtos");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 20, 90, 26);

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 238, 238));
        jLabel6.setText("Nome");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 70, 120, 26);

        jTextField1Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1CodigoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1Codigo);
        jTextField1Codigo.setBounds(230, 220, 170, 29);

        jTextField1NomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1NomeProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1NomeProduto);
        jTextField1NomeProduto.setBounds(230, 70, 170, 29);

        jComboBox1UnidadeMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kg", "Saca", "Unidade" }));
        getContentPane().add(jComboBox1UnidadeMedida);
        jComboBox1UnidadeMedida.setBounds(230, 170, 86, 29);
        getContentPane().add(jSpinner1PrazodeValidade);
        jSpinner1PrazodeValidade.setBounds(230, 120, 45, 30);

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Unidade de medida");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 150, 180, 60);

        jButton1.setText("Cadastar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 221, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/285845348d6a2c6.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-6, -7, 620, 320);

        setSize(new java.awt.Dimension(613, 312));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1NomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1NomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1NomeProdutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            produtoBeans.setId(Integer.parseInt(jTextField1Codigo.getText()));
            produtoBeans.setMedida(jComboBox1UnidadeMedida.getSelectedItem().toString());
            produtoBeans.setNome(jTextField1NomeProduto.getText());
            produtoBeans.setValidade((int) jSpinner1PrazodeValidade.getValue());
            produtoDAO.inserir(produtoBeans);
            CadastroInsumos tela = new CadastroInsumos();
            tela.id=produtoBeans.getId();
            tela.setVisible(true);
            dispose();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Dados incorretos\n"+e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1CodigoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1UnidadeMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jSpinner1PrazodeValidade;
    private javax.swing.JTextField jTextField1Codigo;
    private javax.swing.JTextField jTextField1NomeProduto;
    // End of variables declaration//GEN-END:variables
}
