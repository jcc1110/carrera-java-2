/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saime.views;
import com.saime.controllers.Operation;
import com.saime.models.DataAccess;
import javax.swing.JOptionPane;
/**
 *
 * @author pc3
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MaimFrame
     */
    public MainFrame() {
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

        LblUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        TxtFDeUsuario = new javax.swing.JTextField();
        TxtFDePassword = new javax.swing.JTextField();
        BttonIngresar = new javax.swing.JButton();
        BtnConsultarSaldo = new javax.swing.JButton();
        BttnDeposito = new javax.swing.JButton();
        BttnRetiro = new javax.swing.JButton();
        BttnCambioClave = new javax.swing.JButton();
        Lblmonto = new javax.swing.JLabel();
        TxtFDeMonto = new javax.swing.JTextField();
        LblClave = new javax.swing.JLabel();
        TxtFDeClave = new javax.swing.JTextField();
        BttnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblUsuario.setText("Usuario");

        lblPassword.setText("Password");

        TxtFDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFDeUsuarioActionPerformed(evt);
            }
        });

        BttonIngresar.setText("Ingresar");
        BttonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttonIngresarActionPerformed(evt);
            }
        });

        BtnConsultarSaldo.setText("Consultar Saldo");
        BtnConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarSaldoActionPerformed(evt);
            }
        });

        BttnDeposito.setText("Deposito");
        BttnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnDepositoActionPerformed(evt);
            }
        });

        BttnRetiro.setText("Retiro");

        BttnCambioClave.setText("Cambio Clave");

        Lblmonto.setText("Monto");

        LblClave.setText("Clave");

        BttnCerrarSesion.setText("Cerrar Sesión");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(BtnConsultarSaldo)
                .addGap(49, 49, 49)
                .addComponent(BttnDeposito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(BttnRetiro)
                .addGap(50, 50, 50)
                .addComponent(BttnCambioClave)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BttonIngresar)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BttnCerrarSesion)
                        .addGap(152, 152, 152))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtFDePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtFDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblClave)
                            .addComponent(Lblmonto))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtFDeClave, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(TxtFDeMonto))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblUsuario)
                    .addComponent(TxtFDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(BttonIngresar)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(TxtFDePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnConsultarSaldo)
                    .addComponent(BttnDeposito)
                    .addComponent(BttnRetiro)
                    .addComponent(BttnCambioClave))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lblmonto)
                    .addComponent(TxtFDeMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(BttnCerrarSesion)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblClave)
                    .addComponent(TxtFDeClave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BttonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttonIngresarActionPerformed
          // Instancias necesarias
        Operation pa = new Operation();
        String tarjeta = TxtFDeUsuario.getText();
        String password = TxtFDePassword.getText();

        pa.setTarjeta(tarjeta);
        pa.setPassword(password);
        
        // Validando los datos
        if (pa.ingresar(pa)) {
            JOptionPane.showMessageDialog(BttonIngresar, "Usuario valido");
        } else {
            JOptionPane.showMessageDialog(BttonIngresar, "Usuario invalido");
}   
    }//GEN-LAST:event_BttonIngresarActionPerformed

    private void TxtFDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFDeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFDeUsuarioActionPerformed

    private void BtnConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarSaldoActionPerformed
        //Instancias necesarias
        Operation pa = new Operation();
        String tarjeta = TxtFDeUsuario.getText();
        String password = TxtFDePassword.getText();

        pa.setTarjeta(tarjeta);
        pa.setPassword(password);
        DataAccess connectToDB = null;
        if (pa.consultaSaldo(connectToDB, tarjeta)){}
        else {
            JOptionPane.showMessageDialog(BtnConsultarSaldo, "Su saldo es: " +  pa.getBalance());
        }
        
    }//GEN-LAST:event_BtnConsultarSaldoActionPerformed

    private void BttnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnDepositoActionPerformed
        Operation pa = new Operation();
        String tarjeta = TxtFDeUsuario.getText();
        String password = TxtFDePassword.getText();

        pa.setTarjeta(tarjeta);
        pa.setPassword(password);
        if (TxtFDeMonto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe escribir en el Campor <Valor>");
        }
        else {
            DataAccess connectToDB = null;
            pa.deposito(connectToDB, tarjeta);
            JOptionPane.showMessageDialog(TxtFDeUsuario.getText() + "Deposito de la tarjeta: " + " por un monto de: " + TxtFDeMonto.getText());
            TxtFDeMonto.setText(tarjeta);
        }
        
    }//GEN-LAST:event_BttnDepositoActionPerformed
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsultarSaldo;
    private javax.swing.JButton BttnCambioClave;
    private javax.swing.JButton BttnCerrarSesion;
    private javax.swing.JButton BttnDeposito;
    private javax.swing.JButton BttnRetiro;
    private javax.swing.JButton BttonIngresar;
    private javax.swing.JLabel LblClave;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JLabel Lblmonto;
    private javax.swing.JTextField TxtFDeClave;
    private javax.swing.JTextField TxtFDeMonto;
    private javax.swing.JTextField TxtFDePassword;
    private javax.swing.JTextField TxtFDeUsuario;
    private javax.swing.JLabel lblPassword;
    // End of variables declaration//GEN-END:variables
}
