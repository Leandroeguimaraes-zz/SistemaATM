package Views;

import controller.Controller;

public class TelaSaldoExtrato extends javax.swing.JFrame {

    Controller control;
    
    public TelaSaldoExtrato() {
        initComponents();
    }
    public TelaSaldoExtrato(Controller control) {
        initComponents();
        this.control=control;
        this.labelSaldoUsuario.setText(String.valueOf(this.control.getSaldo()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelSaldo = new javax.swing.JLabel();
        btnMostarExtrato = new javax.swing.JButton();
        labelSaldoUsuario = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        labelSaldoTitulo = new javax.swing.JLabel();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setLayout(null);

        labelSaldo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelSaldo.setForeground(new java.awt.Color(0, 51, 102));
        labelSaldo.setText("Saldo:");
        jPanel1.add(labelSaldo);
        labelSaldo.setBounds(50, 200, 70, 30);

        btnMostarExtrato.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMostarExtrato.setForeground(new java.awt.Color(0, 51, 102));
        btnMostarExtrato.setText("Mostrar Extrato");
        btnMostarExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostarExtratoActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostarExtrato);
        btnMostarExtrato.setBounds(300, 500, 200, 50);

        labelSaldoUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelSaldoUsuario.setForeground(new java.awt.Color(0, 102, 153));
        labelSaldoUsuario.setText("Saldo do Usuário");
        jPanel1.add(labelSaldoUsuario);
        labelSaldoUsuario.setBounds(130, 200, 300, 30);

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

        labelSaldoTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelSaldoTitulo.setForeground(new java.awt.Color(0, 51, 102));
        labelSaldoTitulo.setText("Saldo");
        jPanel1.add(labelSaldoTitulo);
        labelSaldoTitulo.setBounds(320, 50, 270, 50);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDO.png"))); // NOI18N
        jPanel1.add(labelFundo);
        labelFundo.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        new TelaBemVindoMenu(control).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnMostarExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostarExtratoActionPerformed
        this.setVisible(false);
        new TelaExtrato(control).setVisible(true);
    }//GEN-LAST:event_btnMostarExtratoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSaldoExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSaldoExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSaldoExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSaldoExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSaldoExtrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostarExtrato;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JLabel labelSaldoTitulo;
    private javax.swing.JLabel labelSaldoUsuario;
    // End of variables declaration//GEN-END:variables
}
