package Views;

import Control.Controller;
import javax.swing.JOptionPane;

public class TelaDeposito extends javax.swing.JFrame {

    private Controller control;

    public TelaDeposito() {
        initComponents();
    }

    public TelaDeposito(Controller control) {
        initComponents();
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelSaldo = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        labelDeposito = new javax.swing.JLabel();
        campoValor = new Views.JNumberFormatField();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(null);

        labelSaldo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelSaldo.setForeground(new java.awt.Color(0, 51, 102));
        labelSaldo.setText("Valor do depósito:");
        jPanel1.add(labelSaldo);
        labelSaldo.setBounds(50, 200, 210, 30);

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(102, 0, 51));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar);
        btnVoltar.setBounds(550, 500, 200, 50);

        btnConfirmar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(0, 51, 102));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmar);
        btnConfirmar.setBounds(300, 500, 200, 50);

        labelDeposito.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelDeposito.setForeground(new java.awt.Color(0, 51, 102));
        labelDeposito.setText("Depósito");
        jPanel1.add(labelDeposito);
        labelDeposito.setBounds(320, 50, 200, 50);

        campoValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(campoValor);
        campoValor.setBounds(260, 200, 200, 35);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDO.png"))); // NOI18N
        jPanel1.add(labelFundo);
        labelFundo.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        double valor = this.campoValor.getValue().doubleValue();
        if (valor < 5000) {
            TelaConfirmacao tela = new TelaConfirmacao(this, true, control);
            tela.setVisible(true);
            if (tela.confirma()) {
                control.efetuaDeposito(valor);
                JOptionPane.showMessageDialog(this, "Deposito realizado com sucesso.");
                this.setVisible(false);
                new TelaBemVindoMenu(control).setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Operação cancelada.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Valor ultrapassa limite de deposito díario.");
        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        this.dispose();
        new TelaBemVindoMenu(control).setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private Views.JNumberFormatField campoValor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDeposito;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelSaldo;
    // End of variables declaration//GEN-END:variables
}
