/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualização;

/**
 *
 * @author leslye
 */
public class Home_Page extends javax.swing.JFrame {

    /**
     * Creates new form Home_Page
     */
    public Home_Page() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1Consultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1CadastrarProduto1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1Consultar.setText("Consultar");
        jButton1Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Consultar);
        jButton1Consultar.setBounds(270, 130, 110, 40);

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Produtos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 40, 110, 30);

        jButton1CadastrarProduto1.setText("Cadastrar");
        jButton1CadastrarProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CadastrarProduto1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1CadastrarProduto1);
        jButton1CadastrarProduto1.setBounds(100, 130, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/285845348d6a2c6.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-6, -7, 620, 320);

        setSize(new java.awt.Dimension(546, 334));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ConsultarActionPerformed
        Consulta tela = new Consulta();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton1ConsultarActionPerformed

    private void jButton1CadastrarProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CadastrarProduto1ActionPerformed
        CadastroProdutos tela = new CadastroProdutos();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton1CadastrarProduto1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1CadastrarProduto1;
    private javax.swing.JButton jButton1Consultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
