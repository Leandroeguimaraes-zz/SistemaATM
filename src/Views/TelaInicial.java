/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import controller.ValidacaoUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class TelaInicial extends javax.swing.JFrame {

    ValidacaoUsuario vu = new ValidacaoUsuario();
    
    public TelaInicial() {
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

        painelTelaInicial = new javax.swing.JPanel();
        btnLimpar = new javax.swing.JButton();
        campoSenha = new javax.swing.JPasswordField();
        btnConfirmar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        campoAgencia = new javax.swing.JTextField();
        campoConta = new javax.swing.JTextField();
        labelAgencia = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        labelConta = new javax.swing.JLabel();
        fundoTelaInicial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(820, 650));
        getContentPane().setLayout(null);

        painelTelaInicial.setBackground(new java.awt.Color(204, 204, 204));
        painelTelaInicial.setPreferredSize(new java.awt.Dimension(800, 600));
        painelTelaInicial.setLayout(null);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        painelTelaInicial.add(btnLimpar);
        btnLimpar.setBounds(520, 480, 90, 23);
        painelTelaInicial.add(campoSenha);
        campoSenha.setBounds(300, 420, 310, 30);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        painelTelaInicial.add(btnConfirmar);
        btnConfirmar.setBounds(270, 480, 100, 23);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        painelTelaInicial.add(btnSair);
        btnSair.setBounds(400, 480, 100, 23);

        campoAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAgenciaActionPerformed(evt);
            }
        });
        painelTelaInicial.add(campoAgencia);
        campoAgencia.setBounds(300, 340, 310, 30);

        campoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoContaActionPerformed(evt);
            }
        });
        painelTelaInicial.add(campoConta);
        campoConta.setBounds(300, 380, 310, 30);

        labelAgencia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelAgencia.setText("Agência:");
        painelTelaInicial.add(labelAgencia);
        labelAgencia.setBounds(230, 340, 70, 30);

        labelSenha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelSenha.setText("Senha:");
        painelTelaInicial.add(labelSenha);
        labelSenha.setBounds(240, 420, 50, 30);

        labelConta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelConta.setText("Conta:");
        painelTelaInicial.add(labelConta);
        labelConta.setBounds(240, 380, 50, 30);

        fundoTelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDOBOASVINDASresize.png"))); // NOI18N
        painelTelaInicial.add(fundoTelaInicial);
        fundoTelaInicial.setBounds(0, 0, 800, 600);

        getContentPane().add(painelTelaInicial);
        painelTelaInicial.setBounds(0, 0, 910, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoContaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.campoConta.setText("");
        this.campoSenha.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int a =JOptionPane.showConfirmDialog(painelTelaInicial, "Tem certeza que quer sair");
        if(a==0)
            this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            if(vu.validaLogin(campoAgencia.getText(),campoConta.getText(), campoSenha.getText())){
                System.out.println("CHECK");
                new Login();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(campoConta, "Acesso negado");
            campoConta.setText("");
            campoSenha.setText("");
            campoAgencia.setText("");
        }
    
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void campoAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAgenciaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JTextField campoAgencia;
    private javax.swing.JTextField campoConta;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel fundoTelaInicial;
    private javax.swing.JLabel labelAgencia;
    private javax.swing.JLabel labelConta;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPanel painelTelaInicial;
    // End of variables declaration//GEN-END:variables
}
