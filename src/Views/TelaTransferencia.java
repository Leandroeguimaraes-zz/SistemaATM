package Views;//GEN-FIRST:event_btnDOCActionPerformed
//GEN-LAST:event_btnDOCActionPerformed
import controller.Controller;

public class TelaTransferencia extends javax.swing.JFrame {

    private Controller control;

    public TelaTransferencia() {
        initComponents();
    }

    TelaTransferencia(Controller control) {
        this.control = control;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnBancoBanco = new javax.swing.JButton();
        btnDOC = new javax.swing.JButton();
        btnTED = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        labelTransferencia = new javax.swing.JLabel();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);

        jPanel2.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel2.setLayout(null);

        btnBancoBanco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBancoBanco.setForeground(new java.awt.Color(0, 51, 102));
        btnBancoBanco.setText("Para ATM5");
        btnBancoBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBancoBancoActionPerformed(evt);
            }
        });
        jPanel2.add(btnBancoBanco);
        btnBancoBanco.setBounds(50, 200, 200, 50);

        btnDOC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDOC.setForeground(new java.awt.Color(0, 51, 102));
        btnDOC.setText("DOC");
        btnDOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDOCActionPerformed(evt);
            }
        });
        jPanel2.add(btnDOC);
        btnDOC.setBounds(50, 275, 200, 50);

        btnTED.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnTED.setForeground(new java.awt.Color(0, 51, 102));
        btnTED.setText("TED");
        btnTED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTEDActionPerformed(evt);
            }
        });
        jPanel2.add(btnTED);
        btnTED.setBounds(50, 350, 200, 50);

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

        labelTransferencia.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelTransferencia.setForeground(new java.awt.Color(0, 51, 102));
        labelTransferencia.setText("Transferência");
        jPanel2.add(labelTransferencia);
        labelTransferencia.setBounds(320, 50, 290, 50);

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
    }// </editor-fold>                        

    private void btnBancoBancoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.setVisible(false);
        new TelaParaATM5(control).setVisible(true);
    }                                             

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        this.setVisible(false);
        new TelaBemVindoMenu(control).setVisible(true);
        dispose();
    }                                         

    private void btnDOCActionPerformed(java.awt.event.ActionEvent evt) {                                       
        this.setVisible(false);
        new TelaDOC(control).setVisible(true);
    }                                      

    private void btnTEDActionPerformed(java.awt.event.ActionEvent evt) {                                       
        this.setVisible(false);
        new TelaTED(control).setVisible(true);
    }                                      


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
            java.util.logging.Logger.getLogger(TelaTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTransferencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnBancoBanco;
    private javax.swing.JButton btnDOC;
    private javax.swing.JButton btnTED;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelTransferencia;
    // End of variables declaration                   
}
