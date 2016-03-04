/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.swing.JOptionPane;
import model.Conta;
import model.Usuario;
import model.dao.ContaDAO;
import model.dao.UsuarioDAO;

/**
 *
 * @author Lucas Thimoteo
 */
public class TelaInfoBoleto extends javax.swing.JFrame {

    private Conta conta;

    /**
     * Creates new form TelaSaque
     */
    public TelaInfoBoleto() {
        initComponents();
    }

    TelaInfoBoleto(Conta conta) {
        initComponents();
        this.conta = conta;
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
        btnConfirmar = new javax.swing.JButton();
        labelVal = new javax.swing.JLabel();
        labelDest = new javax.swing.JLabel();
        labelDataVenc = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        labelDestinatario = new javax.swing.JLabel();
        labelDataVencimento = new javax.swing.JLabel();
        labelDestinatario1 = new javax.swing.JLabel();
        labelDestinatario2 = new javax.swing.JLabel();
        labelNumbolet = new javax.swing.JLabel();
        labelNumeroBoleto = new javax.swing.JLabel();
        labelBoleto = new javax.swing.JLabel();
        labelValPago = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
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

        labelValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelValor.setForeground(new java.awt.Color(0, 102, 153));
        labelValor.setText("valor do boleto");
        jPanel2.add(labelValor);
        labelValor.setBounds(300, 250, 210, 30);

        labelDestinatario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelDestinatario.setForeground(new java.awt.Color(0, 102, 153));
        labelDestinatario.setText("agencia");
        jPanel2.add(labelDestinatario);
        labelDestinatario.setBounds(400, 300, 100, 30);

        labelDataVencimento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelDataVencimento.setForeground(new java.awt.Color(0, 102, 153));
        labelDataVencimento.setText("data de vencimento do boleto");
        jPanel2.add(labelDataVencimento);
        labelDataVencimento.setBounds(300, 350, 370, 30);

        labelDestinatario1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelDestinatario1.setForeground(new java.awt.Color(0, 102, 153));
        labelDestinatario1.setText("conta");
        jPanel2.add(labelDestinatario1);
        labelDestinatario1.setBounds(500, 300, 100, 30);

        labelDestinatario2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelDestinatario2.setForeground(new java.awt.Color(0, 102, 153));
        labelDestinatario2.setText("banco");
        jPanel2.add(labelDestinatario2);
        labelDestinatario2.setBounds(300, 300, 100, 30);

        labelNumbolet.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelNumbolet.setForeground(new java.awt.Color(0, 51, 102));
        labelNumbolet.setText("Número do boleto:");
        jPanel2.add(labelNumbolet);
        labelNumbolet.setBounds(50, 200, 210, 30);

        labelNumeroBoleto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelNumeroBoleto.setForeground(new java.awt.Color(0, 102, 153));
        labelNumeroBoleto.setText("numero boleto");
        jPanel2.add(labelNumeroBoleto);
        labelNumeroBoleto.setBounds(300, 200, 210, 30);

        labelBoleto.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelBoleto.setForeground(new java.awt.Color(0, 51, 102));
        labelBoleto.setText("Boleto");
        jPanel2.add(labelBoleto);
        labelBoleto.setBounds(320, 50, 200, 50);

        labelValPago.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelValPago.setForeground(new java.awt.Color(0, 51, 102));
        labelValPago.setText("Valor a ser pago:");
        jPanel2.add(labelValPago);
        labelValPago.setBounds(50, 400, 210, 30);

        campoValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(campoValor);
        campoValor.setBounds(300, 405, 200, 30);

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
        new TelaBemVindoMenu(conta).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        TelaConfirmacao tela = new TelaConfirmacao(this,true,conta);
        tela.setVisible(true);
        //
        //
        //
        //rotina para verificar se conta existe
        //
        //
        //
        //
        if (tela.confirma()){
            double saldo =conta.getSaldo();
            int valor=Integer.parseInt(labelValor.getText());
            if (saldo >= valor){
                if (valor < 5000){
                   conta.setSaldo(saldo-valor);
                   ContaDAO contDAO = new ContaDAO();
                   contDAO.salvar(conta);
                   JOptionPane.showMessageDialog(this, "Pagamento realizado com sucesso.");
                   //
                   //
                   //
                   // rotina para salvar os dados na conta destinataria
                   //
                   //
                   //
                }else{
                    JOptionPane.showMessageDialog(this, "Valor ultrapassa limite de DOC");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Valor a ser pago inferior ao do boleto.");
            }
        }else{
            JOptionPane.showMessageDialog(this,"Operação cancelada.");
        }
        this.setVisible(false);
        new TelaBemVindoMenu(conta).setVisible(true);
        dispose();
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
    private javax.swing.JLabel labelBoleto;
    private javax.swing.JLabel labelDataVenc;
    private javax.swing.JLabel labelDataVencimento;
    private javax.swing.JLabel labelDest;
    private javax.swing.JLabel labelDestinatario;
    private javax.swing.JLabel labelDestinatario1;
    private javax.swing.JLabel labelDestinatario2;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelNumbolet;
    private javax.swing.JLabel labelNumeroBoleto;
    private javax.swing.JLabel labelVal;
    private javax.swing.JLabel labelValPago;
    private javax.swing.JLabel labelValor;
    // End of variables declaration//GEN-END:variables
}
