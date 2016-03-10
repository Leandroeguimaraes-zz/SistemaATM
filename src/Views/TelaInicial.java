package Views;

import controller.Controller;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {

    Controller control = new Controller();

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        btnLimpar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        campoAgencia = new javax.swing.JTextField();
        campoConta = new javax.swing.JTextField();
        labelAgencia = new javax.swing.JLabel();
        labelConta = new javax.swing.JLabel();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        painelPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        painelPrincipal.setPreferredSize(new java.awt.Dimension(800, 600));
        painelPrincipal.setLayout(null);

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(0, 51, 102));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnLimpar);
        btnLimpar.setBounds(300, 500, 200, 50);
        btnLimpar.getAccessibleContext().setAccessibleName("");

        btnConfirmar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(0, 51, 102));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnConfirmar);
        btnConfirmar.setBounds(50, 500, 200, 50);
        btnConfirmar.getAccessibleContext().setAccessibleName("");

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSair.setForeground(new java.awt.Color(102, 0, 51));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnSair);
        btnSair.setBounds(550, 500, 200, 50);
        btnSair.getAccessibleContext().setAccessibleName("");

        campoAgencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoAgenciaKeyTyped(evt);
            }
        });
        painelPrincipal.add(campoAgencia);
        campoAgencia.setBounds(250, 350, 300, 30);

        campoConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoContaKeyTyped(evt);
            }
        });
        painelPrincipal.add(campoConta);
        campoConta.setBounds(250, 400, 300, 30);

        labelAgencia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelAgencia.setForeground(new java.awt.Color(0, 51, 102));
        labelAgencia.setText("Agência:");
        painelPrincipal.add(labelAgencia);
        labelAgencia.setBounds(100, 350, 100, 30);

        labelConta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelConta.setForeground(new java.awt.Color(0, 51, 102));
        labelConta.setText("Conta:");
        painelPrincipal.add(labelConta);
        labelConta.setBounds(100, 400, 100, 30);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDOBOASVINDAS.png"))); // NOI18N
        painelPrincipal.add(labelFundo);
        labelFundo.setBounds(0, 0, 800, 600);

        getContentPane().add(painelPrincipal);
        painelPrincipal.setBounds(0, 0, 910, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.campoConta.setText("");
        this.campoAgencia.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        int a = JOptionPane.showConfirmDialog(painelPrincipal, "Tem certeza que quer sair?");
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        if (control.existeConta(campoAgencia.getText(), campoConta.getText())) {
            TelaConfirmacao tela = new TelaConfirmacao(this, true, control);
            tela.setVisible(true);
            if (tela.confirma()) {
                ImageIcon iP = new ImageIcon(getClass().getResource("/Imagens/acessoPermitido.png"));
                JOptionPane.showMessageDialog(campoConta, iP, "Acesso Permitido!", JOptionPane.PLAIN_MESSAGE);
                this.setVisible(false);
                new TelaBemVindoMenu(control).setVisible(true);
                dispose();
            } else {
                ImageIcon iN = new ImageIcon(getClass().getResource("/Imagens/acessoNegado.png"));
                JOptionPane.showMessageDialog(campoConta, iN, "Senha incorreta.", JOptionPane.PLAIN_MESSAGE);
                campoConta.setText("");
                campoAgencia.setText("");
            }
        } else {
            ImageIcon iN = new ImageIcon(getClass().getResource("/Imagens/acessoNegado.png"));
            JOptionPane.showMessageDialog(campoConta, iN, "Conta inexistente.", JOptionPane.PLAIN_MESSAGE);
            campoConta.setText("");
            campoAgencia.setText("");
        }


    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void campoAgenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoAgenciaKeyTyped
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch) || this.campoAgencia.getText().length() >= 4) {
            evt.consume();
        }

    }//GEN-LAST:event_campoAgenciaKeyTyped

    private void campoContaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoContaKeyTyped
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch) || this.campoConta.getText().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_campoContaKeyTyped

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
    private javax.swing.JLabel labelAgencia;
    private javax.swing.JLabel labelConta;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
