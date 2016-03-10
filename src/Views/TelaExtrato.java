package Views;

import controller.Controller;
import java.util.ArrayList;

public class TelaExtrato extends javax.swing.JFrame {

    Controller control;
    
    public TelaExtrato() {
        initComponents();
    }
    public TelaExtrato(Controller control) {
        initComponents();
        this.control=control;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelExtrato = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        labeloExtratoTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoExtrato = new javax.swing.JTextArea();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(null);

        labelExtrato.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelExtrato.setForeground(new java.awt.Color(0, 51, 102));
        labelExtrato.setText("Extrato:");
        jPanel1.add(labelExtrato);
        labelExtrato.setBounds(50, 150, 100, 30);

        btnImprimir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(0, 51, 102));
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimir);
        btnImprimir.setBounds(300, 500, 200, 50);

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

        labeloExtratoTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labeloExtratoTitulo.setForeground(new java.awt.Color(0, 51, 102));
        labeloExtratoTitulo.setText("Extrato");
        jPanel1.add(labeloExtratoTitulo);
        labeloExtratoTitulo.setBounds(320, 50, 270, 50);

        campoExtrato.setColumns(20);
        campoExtrato.setRows(5);
        campoExtrato.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoExtrato.setFocusable(false);
        campoExtrato.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(campoExtrato);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 200, 700, 270);

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
        new TelaSaldoExtrato(control).setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        ArrayList<String> lista = this.control.getListaEventos();
        String quebraLinha = System.lineSeparator();
        for (int i = 0; i < lista.size(); i++) {
            this.campoExtrato.setText(lista.get(i)+quebraLinha);
            
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaExtrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextArea campoExtrato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelExtrato;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labeloExtratoTitulo;
    // End of variables declaration//GEN-END:variables
}
