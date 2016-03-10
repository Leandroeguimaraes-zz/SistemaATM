package Views;

import controller.Controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class TelaInfoBoleto extends javax.swing.JFrame {

    private Controller control;

    public TelaInfoBoleto() {
        initComponents();
    }

    TelaInfoBoleto(Controller control) {
        initComponents();
        this.control = control;
        this.labelNumeroBoleto.setText(this.control.getBoleto().getCodigo());
        this.labelValor.setText(String.valueOf(this.control.getBoleto().getValor()));
        this.labelBancoDestinatario.setText(this.control.getBoleto().getConta().getBanco());
        this.labelAgenciaDestinatario.setText(this.control.getBoleto().getConta().getAgencia());
        this.labelContaDestinatario.setText(this.control.getBoleto().getConta().getConta());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        this.labelDataVencimento.setText(sdf.format(this.control.getBoleto().getData()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labelBoleto = new javax.swing.JLabel();
        labelNumeroBoleto = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        labelBancoDestinatario = new javax.swing.JLabel();
        labelAgenciaDestinatario = new javax.swing.JLabel();
        labelContaDestinatario = new javax.swing.JLabel();
        labelDataVencimento = new javax.swing.JLabel();
        labelNumbolet = new javax.swing.JLabel();
        labelVal = new javax.swing.JLabel();
        labelDest = new javax.swing.JLabel();
        labelDataVenc = new javax.swing.JLabel();
        labelValPago = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);

        jPanel2.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel2.setLayout(null);

        labelBoleto.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelBoleto.setForeground(new java.awt.Color(0, 51, 102));
        labelBoleto.setText("Boleto");
        jPanel2.add(labelBoleto);
        labelBoleto.setBounds(320, 50, 200, 50);

        labelNumeroBoleto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelNumeroBoleto.setForeground(new java.awt.Color(0, 102, 153));
        labelNumeroBoleto.setText("numero boleto");
        jPanel2.add(labelNumeroBoleto);
        labelNumeroBoleto.setBounds(300, 200, 210, 30);

        labelValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelValor.setForeground(new java.awt.Color(0, 102, 153));
        labelValor.setText("valor do boleto");
        jPanel2.add(labelValor);
        labelValor.setBounds(300, 250, 210, 30);

        labelBancoDestinatario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelBancoDestinatario.setForeground(new java.awt.Color(0, 102, 153));
        labelBancoDestinatario.setText("banco");
        jPanel2.add(labelBancoDestinatario);
        labelBancoDestinatario.setBounds(300, 300, 100, 30);

        labelAgenciaDestinatario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelAgenciaDestinatario.setForeground(new java.awt.Color(0, 102, 153));
        labelAgenciaDestinatario.setText("agencia");
        jPanel2.add(labelAgenciaDestinatario);
        labelAgenciaDestinatario.setBounds(400, 300, 100, 30);

        labelContaDestinatario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelContaDestinatario.setForeground(new java.awt.Color(0, 102, 153));
        labelContaDestinatario.setText("conta");
        jPanel2.add(labelContaDestinatario);
        labelContaDestinatario.setBounds(500, 300, 100, 30);

        labelDataVencimento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelDataVencimento.setForeground(new java.awt.Color(0, 102, 153));
        labelDataVencimento.setText("data de vencimento do boleto");
        jPanel2.add(labelDataVencimento);
        labelDataVencimento.setBounds(300, 350, 370, 30);

        labelNumbolet.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelNumbolet.setForeground(new java.awt.Color(0, 51, 102));
        labelNumbolet.setText("Número do boleto:");
        jPanel2.add(labelNumbolet);
        labelNumbolet.setBounds(50, 200, 210, 30);

        labelVal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelVal.setForeground(new java.awt.Color(0, 51, 102));
        labelVal.setText("Valor do boleto:");
        jPanel2.add(labelVal);
        labelVal.setBounds(50, 250, 210, 30);

        labelDest.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelDest.setForeground(new java.awt.Color(0, 51, 102));
        labelDest.setText("Destinatário:");
        jPanel2.add(labelDest);
        labelDest.setBounds(50, 300, 210, 30);

        labelDataVenc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelDataVenc.setForeground(new java.awt.Color(0, 51, 102));
        labelDataVenc.setText("Data de vencimento:");
        jPanel2.add(labelDataVenc);
        labelDataVenc.setBounds(50, 350, 250, 30);

        labelValPago.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelValPago.setForeground(new java.awt.Color(0, 51, 102));
        labelValPago.setText("Valor a ser pago:");
        jPanel2.add(labelValPago);
        labelValPago.setBounds(50, 400, 210, 30);

        campoValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        campoValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoValorKeyTyped(evt);
            }
        });
        jPanel2.add(campoValor);
        campoValor.setBounds(300, 405, 200, 30);

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
        new TelaBemVindoMenu(control).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        TelaConfirmacao tela = new TelaConfirmacao(this, true, control);
        tela.setVisible(true);
        Date dataAtual = new Date();
        if (this.control.diasEntre(dataAtual, this.control.getBoleto().getData()) < 0) {
            if (Double.valueOf(this.campoValor.getText())==this.control.getBoleto().getValor()) {
                if (tela.confirma()) {
                    if (control.efetuaPagamento()) {
                        JOptionPane.showMessageDialog(this, "Pagamento realizado com sucesso.");
                        this.setVisible(false);
                        new TelaBemVindoMenu(control).setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Saldo insuficiente.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Operação cancelada.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Valor diferente do valor do boleto.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Boleto vencido.");
        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void campoValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoValorKeyTyped
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_campoValorKeyTyped

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
            java.util.logging.Logger.getLogger(TelaInfoBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInfoBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInfoBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInfoBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaInfoBoleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoValor;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAgenciaDestinatario;
    private javax.swing.JLabel labelBancoDestinatario;
    private javax.swing.JLabel labelBoleto;
    private javax.swing.JLabel labelContaDestinatario;
    private javax.swing.JLabel labelDataVenc;
    private javax.swing.JLabel labelDataVencimento;
    private javax.swing.JLabel labelDest;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelNumbolet;
    private javax.swing.JLabel labelNumeroBoleto;
    private javax.swing.JLabel labelVal;
    private javax.swing.JLabel labelValPago;
    private javax.swing.JLabel labelValor;
    // End of variables declaration//GEN-END:variables
}
