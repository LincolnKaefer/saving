
package com.saving.tela;

import com.saving.DAO.PreparaSql;
import com.saving.Retorno;
import static com.saving.tela.TelaLogin.usuario;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Tela extends javax.swing.JFrame {

    public  Tela() {
        initComponents();
            
        
        jlCabecalho.setText("logado como "+usuario);
        txtCotacao.requestFocus();
        
    }
      @SuppressWarnings("unchecked")
      
      
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCotacao = new javax.swing.JTextField();
        txtFornecedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVInicial = new javax.swing.JTextField();
        txtVFinal = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbSaving = new javax.swing.JLabel();
        btnRelatorio = new javax.swing.JButton();
        jlCabecalho = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Saving Cotações");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 51));
        setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        setIconImages(null);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setToolTipText("");
        jPanel1.setName("Saving Cotações"); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cotação");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Fornecedor");

        txtCotacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCotacao.setForeground(new java.awt.Color(0, 0, 0));
        txtCotacao.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCotacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCotacao.setCaretColor(new java.awt.Color(0, 0, 0));
        txtCotacao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCotacao.setMinimumSize(new java.awt.Dimension(64, 15));
        txtCotacao.setPreferredSize(new java.awt.Dimension(100, 20));
        txtCotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCotacaoActionPerformed(evt);
            }
        });

        txtFornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        txtFornecedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFornecedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtFornecedor.setMinimumSize(new java.awt.Dimension(64, 20));
        txtFornecedor.setPreferredSize(new java.awt.Dimension(100, 20));
        txtFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFornecedorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Valor Inicial");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Valor Final");

        txtVInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtVInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtVInicial.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtVInicial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtVInicial.setMinimumSize(new java.awt.Dimension(100, 20));
        txtVInicial.setPreferredSize(new java.awt.Dimension(100, 20));
        txtVInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVInicialActionPerformed(evt);
            }
        });

        txtVFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtVFinal.setForeground(new java.awt.Color(0, 0, 0));
        txtVFinal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtVFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtVFinal.setMinimumSize(new java.awt.Dimension(100, 20));
        txtVFinal.setPreferredSize(new java.awt.Dimension(100, 20));
        txtVFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVFinalActionPerformed(evt);
            }
        });
        txtVFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVFinalKeyReleased(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 51, 0));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        btnSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvarKeyPressed(evt);
            }
        });

        jBLimpar.setBackground(new java.awt.Color(255, 255, 255));
        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBLimpar.setForeground(new java.awt.Color(0, 51, 0));
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });
        jBLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBLimparKeyPressed(evt);
            }
        });

        lbSaving.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbSaving.setForeground(new java.awt.Color(0, 102, 51));
        lbSaving.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSaving.setAlignmentX(0.5F);
        lbSaving.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbSaving.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbSavingKeyReleased(evt);
            }
        });

        btnRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRelatorio.setText("Relatorio");
        btnRelatorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbSaving, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(26, 26, 26))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(3, 3, 3)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(8, 8, 8))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtVFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCotacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtVInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBLimpar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txtCotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtVInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtVFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addComponent(lbSaving, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(jBLimpar))
                .addGap(18, 18, 18)
                .addComponent(jLabel7))
        );

        jlCabecalho.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jlCabecalho.setForeground(new java.awt.Color(51, 51, 51));
        jlCabecalho.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCabecalho.setMaximumSize(new java.awt.Dimension(200, 20));
        jlCabecalho.setMinimumSize(new java.awt.Dimension(200, 20));
        jlCabecalho.setPreferredSize(new java.awt.Dimension(200, 20));
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbSavingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbSavingKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbSavingKeyReleased

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        // TODO add your handling code here:
        txtFornecedor.setText("");
        txtCotacao.setText("");
        txtVInicial.setText("");
        txtVFinal.setText("");
        lbSaving.setText("");

    }//GEN-LAST:event_jBLimparActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        int cotacao = Integer.parseInt(txtCotacao.getText());
        String fornecedor = txtFornecedor.getText();
        Double vInicial = Double.parseDouble(txtVInicial.getText());
        Double vFinal = Double.parseDouble(txtVFinal.getText());

        Retorno salvar = new Retorno();
        salvar.salvar(cotacao, fornecedor, vInicial, vFinal);
        
        

        System.out.println("Classe tela");
        System.out.println(cotacao);
        System.out.println(fornecedor);
        System.out.println(vInicial);
        System.out.println(vFinal);


        try {
            PreparaSql.conectar();
                    
                     
        } catch (SQLException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }

        txtFornecedor.setText("");
        txtCotacao.setText("");
        txtVInicial.setText("");
        txtVFinal.setText("");
        lbSaving.setText("");
        
        
        txtCotacao.requestFocus();
              
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtVFinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVFinalKeyReleased
        // TODO add your handling code here:
        Double vInicial = Double.parseDouble(txtVInicial.getText());
        Double vFinal = Double.parseDouble(txtVFinal.getText());
        Retorno saving = new Retorno();
        saving.saving(vInicial, vFinal);
        if(vFinal==null){
            lbSaving.setText("");

        }else{
            lbSaving.setText("Saving: R$ " +String.valueOf(saving.saving(vInicial, vFinal)));
        }

    }//GEN-LAST:event_txtVFinalKeyReleased

    private void txtVFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVFinalActionPerformed

    private void txtVInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVInicialActionPerformed

    private void txtFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFornecedorActionPerformed

    private void txtCotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCotacaoActionPerformed
        // TODO add your handaling code here:
    }//GEN-LAST:event_txtCotacaoActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        // TODO add your handling code here:
        this.dispose();
        RelatorioSaving rS = new RelatorioSaving();
        rS.setVisible(true);
        
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            btnSalvarActionPerformed(null);
        }
    }//GEN-LAST:event_btnSalvarKeyPressed

    private void jBLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBLimparKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jBLimparKeyPressed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }
    
    
    

  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlCabecalho;
    private javax.swing.JLabel lbSaving;
    private javax.swing.JTextField txtCotacao;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtVFinal;
    private javax.swing.JTextField txtVInicial;
    // End of variables declaration//GEN-END:variables

   

}




