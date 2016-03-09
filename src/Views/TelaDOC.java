package Views;

import controller.Controller;
import javax.swing.JOptionPane;

public class TelaDOC extends javax.swing.JFrame {

    private Controller control;

    public TelaDOC() {
        initComponents();
    }

    TelaDOC(Controller control) {
        this.control = control;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        campoCPF = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        labelAgencia = new javax.swing.JLabel();
        campoAgencia = new javax.swing.JTextField();
        labelConta = new javax.swing.JLabel();
        campoConta = new javax.swing.JTextField();
        labelValor = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        labelBanco = new javax.swing.JLabel();
        campoBanco = new javax.swing.JTextField();
        labelDOC = new javax.swing.JLabel();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);

        jPanel2.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel2.setLayout(null);

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(102, 0, 51));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel2.add(btnVoltar);
        btnVoltar.setBounds(550, 500, 200, 50);

        campoCPF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(campoCPF);
        campoCPF.setBounds(230, 250, 200, 30);

        labelCPF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelCPF.setForeground(new java.awt.Color(0, 51, 102));
        labelCPF.setText("CPF:");
        jPanel2.add(labelCPF);
        labelCPF.setBounds(50, 250, 180, 30);

        btnConfirmar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(0, 51, 102));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConfirmar);
        btnConfirmar.setBounds(300, 500, 200, 50);

        labelAgencia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelAgencia.setForeground(new java.awt.Color(0, 51, 102));
        labelAgencia.setText("Agência:");
        jPanel2.add(labelAgencia);
        labelAgencia.setBounds(50, 300, 180, 30);

        campoAgencia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(campoAgencia);
        campoAgencia.setBounds(230, 300, 200, 30);

        labelConta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelConta.setForeground(new java.awt.Color(0, 51, 102));
        labelConta.setText("Conta Corrente:");
        jPanel2.add(labelConta);
        labelConta.setBounds(50, 350, 180, 30);

        campoConta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(campoConta);
        campoConta.setBounds(230, 350, 200, 30);

        labelValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelValor.setForeground(new java.awt.Color(0, 51, 102));
        labelValor.setText("Valor:");
        jPanel2.add(labelValor);
        labelValor.setBounds(50, 400, 180, 30);

        campoValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(campoValor);
        campoValor.setBounds(230, 400, 200, 30);

        labelBanco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelBanco.setForeground(new java.awt.Color(0, 51, 102));
        labelBanco.setText("Banco:");
        jPanel2.add(labelBanco);
        labelBanco.setBounds(50, 200, 180, 30);

        campoBanco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(campoBanco);
        campoBanco.setBounds(230, 200, 200, 30);

        labelDOC.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelDOC.setForeground(new java.awt.Color(0, 51, 102));
        labelDOC.setText("DOC");
        jPanel2.add(labelDOC);
        labelDOC.setBounds(320, 50, 200, 50);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDO.png"))); // NOI18N
        jPanel2.add(labelFundo);
        labelFundo.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        new TelaTransferencia(this.control).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        double valor = Double.parseDouble(this.campoValor.getText());
        if (valor < 5000) {
            if (control.existeContaECpf(this.campoBanco.getText(), this.campoAgencia.getText(), this.campoConta.getText(), this.campoCPF.getText())) {
                TelaConfirmacao tela = new TelaConfirmacao(this, true, control.getSenha());
                tela.setVisible(true);
                if (tela.confirma()) {
                    if (this.control.efetuaTransferenciaDOC(valor)) {
                        JOptionPane.showMessageDialog(this, "Transferencia realizada com sucesso.");
                        this.setVisible(false);
                        new TelaBemVindoMenu(this.control).setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Saldo insuficiente.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Operação cancelada.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Conta inexistente.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Valor ultrapassa limite de DOC.");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDOC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDOC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDOC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDOC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDOC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoAgencia;
    private javax.swing.JTextField campoBanco;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoConta;
    private javax.swing.JTextField campoValor;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAgencia;
    private javax.swing.JLabel labelBanco;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelConta;
    private javax.swing.JLabel labelDOC;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelValor;
    // End of variables declaration//GEN-END:variables
}
