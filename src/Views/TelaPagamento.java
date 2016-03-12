package Views;

import Control.Controller;
import javax.swing.JOptionPane;

public class TelaPagamento extends javax.swing.JFrame {

    private Controller control;

    public TelaPagamento() {
        initComponents();
    }

    TelaPagamento(Controller control) {
        initComponents();
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        campoCodigoBarras = new javax.swing.JTextField();
        labelCodigoBarras = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        labelPagamento = new javax.swing.JLabel();
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

        campoCodigoBarras.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        campoCodigoBarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCodigoBarrasKeyTyped(evt);
            }
        });
        jPanel2.add(campoCodigoBarras);
        campoCodigoBarras.setBounds(250, 200, 490, 35);

        labelCodigoBarras.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelCodigoBarras.setForeground(new java.awt.Color(0, 51, 102));
        labelCodigoBarras.setText("Código de Barras:");
        jPanel2.add(labelCodigoBarras);
        labelCodigoBarras.setBounds(50, 200, 200, 30);

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

        labelPagamento.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelPagamento.setForeground(new java.awt.Color(0, 51, 102));
        labelPagamento.setText("Pagamento");
        jPanel2.add(labelPagamento);
        labelPagamento.setBounds(320, 50, 200, 50);

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
        if (this.control.existeBoleto(this.campoCodigoBarras.getText()) && this.campoCodigoBarras.getText().length()<=20){
            this.setVisible(false);
            new TelaInfoBoleto(control).setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Codigo invalido.");
        }
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void campoCodigoBarrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCodigoBarrasKeyTyped
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch) || this.campoCodigoBarras.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_campoCodigoBarrasKeyTyped

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
            java.util.logging.Logger.getLogger(TelaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoCodigoBarras;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigoBarras;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelPagamento;
    // End of variables declaration//GEN-END:variables
}
