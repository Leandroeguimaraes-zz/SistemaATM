/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Control.Controller;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Lucas Thimoteo
 */
public class TelaSaldoExtrato extends javax.swing.JFrame {

    /**
     * Creates new form TelaSaldoExtrato
     */
    Controller control;
    
    public TelaSaldoExtrato() {
        initComponents();
    }
    public TelaSaldoExtrato(Controller control) {
        initComponents();
        this.control=control;
        DecimalFormat df = new DecimalFormat("###,##0.00");
        this.labelSaldoUsuario.setText("R$ "+String.valueOf(df.format(this.control.getSaldo())));
        ArrayList<String> lista = this.control.getListaEventos(30);
        String quebraLinha = System.lineSeparator();
        for (int i = 0; i < lista.size(); i++) {
            this.campoExtrato.setText(this.campoExtrato.getText() +lista.get(i)+quebraLinha);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoTempo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelSaldo = new javax.swing.JLabel();
        labelSaldoUsuario = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        labelSaldoTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoExtrato = new javax.swing.JTextArea();
        labelExtrato = new javax.swing.JLabel();
        radio30 = new javax.swing.JRadioButton();
        radio60 = new javax.swing.JRadioButton();
        radio90 = new javax.swing.JRadioButton();
        radioTudo = new javax.swing.JRadioButton();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        labelSaldo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelSaldo.setForeground(new java.awt.Color(0, 51, 102));
        labelSaldo.setText("Saldo:");
        jPanel1.add(labelSaldo);
        labelSaldo.setBounds(50, 200, 70, 30);

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

        jScrollPane1.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N

        campoExtrato.setColumns(20);
        campoExtrato.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        campoExtrato.setRows(5);
        campoExtrato.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoExtrato.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(campoExtrato);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 290, 700, 190);

        labelExtrato.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelExtrato.setForeground(new java.awt.Color(0, 51, 102));
        labelExtrato.setText("Extrato:");
        jPanel1.add(labelExtrato);
        labelExtrato.setBounds(50, 240, 100, 30);

        radio30.setBackground(new java.awt.Color(255, 255, 255));
        grupoTempo.add(radio30);
        radio30.setSelected(true);
        radio30.setText("30 dias");
        radio30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio30ActionPerformed(evt);
            }
        });
        jPanel1.add(radio30);
        radio30.setBounds(150, 240, 100, 30);

        radio60.setBackground(new java.awt.Color(255, 255, 255));
        grupoTempo.add(radio60);
        radio60.setText("60 dias");
        radio60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio60ActionPerformed(evt);
            }
        });
        jPanel1.add(radio60);
        radio60.setBounds(250, 240, 100, 30);

        radio90.setBackground(new java.awt.Color(255, 255, 255));
        grupoTempo.add(radio90);
        radio90.setText("90 dias");
        radio90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio90ActionPerformed(evt);
            }
        });
        jPanel1.add(radio90);
        radio90.setBounds(350, 240, 100, 30);

        radioTudo.setBackground(new java.awt.Color(255, 255, 255));
        grupoTempo.add(radioTudo);
        radioTudo.setText("Tudo");
        radioTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTudoActionPerformed(evt);
            }
        });
        jPanel1.add(radioTudo);
        radioTudo.setBounds(450, 240, 100, 30);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDO.png"))); // NOI18N
        jPanel1.add(labelFundo);
        labelFundo.setBounds(0, 0, 800, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        
        new TelaBemVindoMenu(control).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void radio30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio30ActionPerformed
        this.campoExtrato.setText("");
        radio30.setSelected(true);
        this.labelSaldoUsuario.setText("R$ "+String.valueOf(this.control.getSaldo()));
        ArrayList<String> lista = this.control.getListaEventos(30);
        String quebraLinha = System.lineSeparator();
        for (int i = 0; i < lista.size(); i++) {
            this.campoExtrato.setText(this.campoExtrato.getText() +lista.get(i)+quebraLinha);
            
        }
    }//GEN-LAST:event_radio30ActionPerformed

    private void radio60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio60ActionPerformed
        this.campoExtrato.setText("");
        radio60.setSelected(true);
        this.labelSaldoUsuario.setText("R$ "+String.valueOf(this.control.getSaldo()));
        ArrayList<String> lista = this.control.getListaEventos(60);
        String quebraLinha = System.lineSeparator();
        for (int i = 0; i < lista.size(); i++) {
            this.campoExtrato.setText(this.campoExtrato.getText() +lista.get(i)+quebraLinha);
            
        }
    }//GEN-LAST:event_radio60ActionPerformed

    private void radio90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio90ActionPerformed
        this.campoExtrato.setText("");
        radio90.setSelected(true);
        this.labelSaldoUsuario.setText("R$ "+String.valueOf(this.control.getSaldo()));
        ArrayList<String> lista = this.control.getListaEventos(90);
        String quebraLinha = System.lineSeparator();
        for (int i = 0; i < lista.size(); i++) {
            this.campoExtrato.setText(this.campoExtrato.getText() +lista.get(i)+quebraLinha);
            
        }
    }//GEN-LAST:event_radio90ActionPerformed

    private void radioTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTudoActionPerformed
        this.campoExtrato.setText("");
        radioTudo.setSelected(true);
        this.labelSaldoUsuario.setText("R$ "+String.valueOf(this.control.getSaldo()));
        ArrayList<String> lista = this.control.getListaEventos(0);
        String quebraLinha = System.lineSeparator();
        for (int i = 0; i < lista.size(); i++) {
            this.campoExtrato.setText(this.campoExtrato.getText() +lista.get(i)+quebraLinha);
            
        }
    }//GEN-LAST:event_radioTudoActionPerformed

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
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextArea campoExtrato;
    private javax.swing.ButtonGroup grupoTempo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelExtrato;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JLabel labelSaldoTitulo;
    private javax.swing.JLabel labelSaldoUsuario;
    private javax.swing.JRadioButton radio30;
    private javax.swing.JRadioButton radio60;
    private javax.swing.JRadioButton radio90;
    private javax.swing.JRadioButton radioTudo;
    // End of variables declaration//GEN-END:variables
}
