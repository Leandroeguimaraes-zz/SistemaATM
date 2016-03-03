/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import model.Usuario;

/**
 *
 * @author Lucas Thimoteo
 */
public class TelaParaATM5 extends javax.swing.JFrame {

    private Usuario usuario;

    /**
     * Creates new form TelaSaque
     */
    public TelaParaATM5() {
        initComponents();
    }

    TelaParaATM5(Usuario usuario) {
        this.usuario = usuario;
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
        lavbelParaATM5 = new javax.swing.JLabel();
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
        campoCPF.setBounds(230, 200, 200, 30);

        labelCPF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelCPF.setForeground(new java.awt.Color(0, 51, 102));
        labelCPF.setText("CPF:");
        jPanel2.add(labelCPF);
        labelCPF.setBounds(50, 200, 210, 30);

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
        labelAgencia.setBounds(50, 250, 210, 30);

        campoAgencia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(campoAgencia);
        campoAgencia.setBounds(230, 250, 200, 30);

        labelConta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelConta.setForeground(new java.awt.Color(0, 51, 102));
        labelConta.setText("Conta Corrente:");
        jPanel2.add(labelConta);
        labelConta.setBounds(50, 300, 210, 30);

        campoConta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(campoConta);
        campoConta.setBounds(230, 300, 200, 30);

        labelValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelValor.setForeground(new java.awt.Color(0, 51, 102));
        labelValor.setText("Valor:");
        jPanel2.add(labelValor);
        labelValor.setBounds(50, 350, 210, 30);

        campoValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(campoValor);
        campoValor.setBounds(230, 350, 200, 30);

        lavbelParaATM5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lavbelParaATM5.setForeground(new java.awt.Color(0, 51, 102));
        lavbelParaATM5.setText("Para ATM5");
        jPanel2.add(lavbelParaATM5);
        lavbelParaATM5.setBounds(320, 50, 200, 50);

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
        new TelaTransferencia(usuario).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaParaATM5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaParaATM5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaParaATM5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaParaATM5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaParaATM5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoAgencia;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoConta;
    private javax.swing.JTextField campoValor;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAgencia;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelConta;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelValor;
    private javax.swing.JLabel lavbelParaATM5;
    // End of variables declaration//GEN-END:variables
}