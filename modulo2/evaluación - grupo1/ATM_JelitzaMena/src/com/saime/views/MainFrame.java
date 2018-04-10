package com.saime.views;
import com.saime.controllers.Operation;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Jelitza Mena
 * @version 1.0.0
 */
    
public class MainFrame {
    
    public static void main(String[] args) {
       String nl = System.getProperty("line.separator");
        Operation op = new Operation();
        boolean LogOn = false;
        
        /**
         * Crear La Ventana
         */
        JFrame window = new JFrame("Cajero Automatico");
        
        window.setSize(400,250);
        window.setLocation(150, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        /**
         * Creamos una etiqueta de tarjeta
         */
        JLabel lbtar = new JLabel("Tarjeta: ");
        /**
         * Creamos el campo de texto para la tarjeta
         */
        JTextField txttarj =  new JTextField(5);
        /**
         * Creamos La etiqueta de Clave
         */
        JLabel lbclave = new JLabel("Clave: ");
        /**
         * Creamos el campo de texto para la clave
         */
        JTextField txtclave =  new JTextField(4);
        /**
         * Creamos el boton de LogOn
         */
        JButton btnLogOn = new JButton("Log On");
        btnLogOn.setBackground(Color.GRAY);
        JLabel lbmessage = new JLabel();
        /**
         * Creamos el boton de Consulta de Saldo
         */
        JButton btnsaldo = new JButton("Consultar Saldo");
        btnsaldo.setBackground(Color.ORANGE);
        btnsaldo.setVisible(false);
        /**
         * Creamos el boton de Retiro
         */
        JButton btnretiro = new JButton("Retiro");
        btnretiro.setBackground(Color.RED);
        btnretiro.setVisible(false);
        /**
         * Creamos el boton de Deposito
         */
        JButton btndeposito = new JButton("Deposito");
        btndeposito.setBackground(Color.GREEN);
        btndeposito.setVisible(false);
        /**
         * Creamos el boton de Cambio de Clave
         */      
        JButton btncambioclave = new JButton("Cambio de Clave");
        btncambioclave.setBackground(Color.CYAN);
        btncambioclave.setVisible(false);
        /**
         * Creamos el boton de LogOff
         */
        JButton btnLogOff = new JButton("Cerrar Sesion");
        btnLogOff.setBackground(Color.PINK);
        btnLogOff.setVisible(true);
        
            /**
             * Validamos El usuario
             */
        ActionListener vali = e -> {
            /**
             * instanciamos la clase Validar usuario
             */
           boolean result = false;
           result = op.ValidarUsuario(txttarj.getText(),txtclave.getText());
            /**
             * Validamos Usuario y mostramos mensajes
             */
           if (result){
              op.setLogOn(true);
               lbmessage.setText("Usuario Valido");
               btnsaldo.setVisible(true);
               btndeposito.setVisible(true);
               btnretiro.setVisible(true);
               btncambioclave.setVisible(true);
               txttarj.setEnabled(false);
           }else{
               lbmessage.setText("Usuario InValido");
              op.setLogOn(false);
              btnsaldo.setVisible(false);
            }
         };
        btnLogOn.addActionListener(vali);
         
            /**
             * Operacion de Consulta de Saldo
             */
        ActionListener consul = e -> {
        
           double saldo;
           saldo = op.ConsultaSaldo(txttarj.getText());
                     
           JOptionPane.showMessageDialog(btnsaldo, saldo);
         };
         
         btnsaldo.addActionListener(consul);
           
            /**
             * Operacion de Deposito
             */
        ActionListener depo = e -> {
            String result, res;
            double deposito;
            boolean one;
            
            result = JOptionPane.showInputDialog("Indique el monto a depositar:");
            deposito = Double.parseDouble(result);
            
            one = op.Deposito(txttarj.getText(),deposito);
            /**
             * Condicion para validar que el monto sea mayor a cero
             */
            if (deposito > 0){
                /**
                 * Condicion que valida si la transaccion fue o no exitosa
                 */
                if(one){
               res = "Transaccion Exitosa";
             JOptionPane.showMessageDialog(btndeposito, res);
            }
            }else{
             
             res = "Transaccion Fallida"
                 + nl + "El Monto debe ser Mayor a Cero";
             JOptionPane.showMessageDialog(btndeposito, res);            }
         };
         
         btndeposito.addActionListener(depo);
         
            /**
             * Operacion de Retiro
             */
          ActionListener reti = e -> {
            String result, res;
            double retiro;
            boolean one;
            double saldo;
            
            
            result = JOptionPane.showInputDialog("Indique el monto a retirar:");
            retiro = Double.parseDouble(result);
            
            saldo = op.ConsultaSaldo(txttarj.getText());
            one = op.Retiro(txttarj.getText(),retiro);
            /**
             * Condicion que valida que el monto sea mayor a cero
             */  
            if (retiro > 0) {
                /**
                 * Condicion que valida si el monto es menor al saldo actual
                 */
                
                /**
                 * Condicion que valida si la transaccion fue o no exitosa
                 */
                    if(one){
               res = "Transaccion Exitosa";
             JOptionPane.showMessageDialog(btnretiro, res);
            }else if (retiro > saldo ) {
             res = "Transaccion Fallida"
                + nl + "Saldo Insuficiente";
             JOptionPane.showMessageDialog(btnretiro, res);            }
            } else{
              res = "Transaccion Fallida"
                + nl + "El monto debe ser Mayor a Cero";
             JOptionPane.showMessageDialog(btnretiro, res);    
              }  
            };
         
            btnretiro.addActionListener(reti);
         
            /**
             * Operacion de Cierre de Sesion
             */
         ActionListener cierre = e -> {
         
             JOptionPane.showMessageDialog(btnLogOff, "HA FINALIZADO LA SESION CORRECTAMENTE"
                                                        + " GRACIAS POR PREFERIRNOS"
                                                               + " HASTA LUEGO");
               op.setLogOn (false);
               lbmessage.setText("");
               btnsaldo.setVisible(false);
               btndeposito.setVisible(false);
               btnretiro.setVisible(false);
               btnLogOff.setVisible(false);

               txttarj.setEnabled(true);
              
          
         };
         
         btnLogOff.addActionListener(cierre);
         
           /**
            * Contenedor de la vista
            */ 
        Container con = window.getContentPane();
        GridLayout gl = new GridLayout(5, 2);
        con.setLayout(gl);
        
        /**
         * Añadiendo los componentes a la vista
         */ 
        con.add(lbtar);
        con.add(txttarj);
        con.add(lbclave);
        con.add(txtclave);
        con.add(btnLogOn);
        con.add(lbmessage);
        con.add(btnsaldo); 
        con.add(btndeposito);
        con.add(btnretiro);
        con.add(btnLogOff);
}    
}
