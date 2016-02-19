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
public class TelaSaque extends javax.swing.JFrame {

    private Usuario usuario;

    /**
     * Creates new form TelaSaque
     */
    public TelaSaque() {
        initComponents();
    }

    TelaSaque(Usuario usuario) {
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
        btn10 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        btn100 = new javax.swing.JButton();
        btn200 = new javax.swing.JButton();
        btnOutros = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        labelSaque = new javax.swing.JLabel();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);

        jPanel2.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel2.setLayout(null);

        btn10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn10.setForeground(new java.awt.Color(0, 51, 102));
        btn10.setText("10 R$");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        jPanel2.add(btn10);
        btn10.setBounds(50, 200, 200, 50);

        btn20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn20.setForeground(new java.awt.Color(0, 51, 102));
        btn20.setText("20 R$");
        jPanel2.add(btn20);
        btn20.setBounds(50, 275, 200, 50);

        btn50.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn50.setForeground(new java.awt.Color(0, 51, 102));
        btn50.setText("50 R$");
        jPanel2.add(btn50);
        btn50.setBounds(50, 350, 200, 50);

        btn100.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn100.setForeground(new java.awt.Color(0, 51, 102));
        btn100.setText("100 R$");
        jPanel2.add(btn100);
        btn100.setBounds(300, 200, 200, 50);

        btn200.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn200.setForeground(new java.awt.Color(0, 51, 102));
        btn200.setText("200 R$");
        jPanel2.add(btn200);
        btn200.setBounds(300, 275, 200, 50);

        btnOutros.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnOutros.setForeground(new java.awt.Color(0, 51, 102));
        btnOutros.setText("Outro Valor");
        btnOutros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutrosActionPerformed(evt);
            }
        });
        jPanel2.add(btnOutros);
        btnOutros.setBounds(300, 350, 200, 50);

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

        labelSaque.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelSaque.setForeground(new java.awt.Color(0, 51, 102));
        labelSaque.setText("Saque");
        jPanel2.add(labelSaque);
        labelSaque.setBounds(320, 50, 200, 50);

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

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn10ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        new TelaBemVindoMenu(usuario).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnOutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutrosActionPerformed
        this.setVisible(false);
        new TelaSaqueOutros(usuario).setVisible(true);
    }//GEN-LAST:event_btnOutrosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSaque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn200;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btnOutros;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelSaque;
    // End of variables declaration//GEN-END:variables
}
