
package com.views;

import com.controllers.Operation;
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
 * @author Carlos
 */
public class MainFrame {
    public static void main(String[] args) {
       String nl = System.getProperty("line.separator");
        Operation op = new Operation();
        boolean Acceso;
        Acceso = false;
        
        //Crear las Ventanas
      
        JFrame window = new JFrame("Cajero ATM CACP");
        
        window.setSize(350,250);
        window.setLocation(150, 150);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        
        
        
         // se crea una etiqueta de tarjeta
         
        JLabel lbtar = new JLabel("Tarjeta: ");
        //se crea el campo en done se introducira eñ texto para la tarjeta
       
        JTextField txttarj =  new JTextField(5);
        
        // se crea una etiqueta de tarjeta
        
        JLabel lbclave = new JLabel("Clave: ");
       
        //se crea el campo en done se introducira eñ texto para la clave
        
        JTextField txtclave =  new JTextField(4);
        
         //Creamos el boton de Acceso
        
        JButton btnAcceso = new JButton("Acceso");
        btnAcceso.setBackground(Color.GRAY);
        JLabel lbmessage = new JLabel();
       
        //Creamos el boton de Consulta de Saldo
        
        JButton btnsaldo = new JButton("Consulta de  Saldo");
        btnsaldo.setBackground(Color.RED);
        btnsaldo.setVisible(false);
        
         //Creamos el boton de Retiro de Saldo
        
        JButton btnretiro = new JButton("Retiro de Saldo");
        btnretiro.setBackground(Color.BLUE);
        btnretiro.setVisible(false);
        
        //Creamos el boton de Deposito o Abono de Saldo
       
        JButton btndeposito = new JButton("De"
                + "posito");
        btndeposito.setBackground(Color.ORANGE);
        btndeposito.setVisible(false);
        
         //Creamos el boton de cambio de clave
             
        JButton btncambioclave = new JButton("Cambio de Clave");
        btncambioclave.setBackground(Color.GREEN);
        btncambioclave.setVisible(false);
        
         //Creamos el boton de Cerrar Sesión
         
        JButton btnLogOff = new JButton("Cerrar Sesion");
        btnAcceso.setBackground(Color.LIGHT_GRAY);
        btnAcceso.setVisible(true);
        
            // validar el usuario
            
        ActionListener vali = e -> {
           
            //instanciamos la clase Validar usuario
            
           boolean result = false;
           result = op.ValidarUsuario(txttarj.getText(),txtclave.getText());
           
             //Se realiza la Validamos Usuario y mostramos mensajes
             
           if (result){
              op.setLogOn(true);
               lbmessage.setText(" El Usuario es Valido" +  " :-)");
               btnsaldo.setVisible(true);
               btndeposito.setVisible(true);
               btnretiro.setVisible(true);
               btncambioclave.setVisible(true);
               txttarj.setEnabled(false);
           }else{
               lbmessage.setText("El Usuario Ingresado es Invalido" + " :-(");
              op.setLogOn(false);
              btnsaldo.setVisible(false);
            }
         };
        btnAcceso.addActionListener(vali);
         
           //Operacion de Consulta de Saldo
           
        ActionListener consul = e -> {
        
           double saldo;
           saldo = op.ConsultaSaldo(txttarj.getText());
                     
           JOptionPane.showMessageDialog(btnsaldo, saldo);
         };
         
         btnsaldo.addActionListener(consul);
           
             //Operacion de Deposito
            
         ActionListener depo = e -> {
            String result, res;
            double deposito;
            boolean one;
            
            result = JOptionPane.showInputDialog("Indique el monto a depositar:");
            deposito = Double.parseDouble(result);
            
            one = op.Deposito(txttarj.getText(),deposito);
            
            
             //Condicion para validar que el monto sea mayor a cero
           
            if (deposito > 0){
                
                
               // Condicion que valida si la transaccion fue o no exitosa
                
                if(one){
               res = "Transaccion Exitosa"  + "Tienes mas dinero"  + " :-(";
             JOptionPane.showMessageDialog(btndeposito, res);
            }
            }else{
             
             res = "Transaccion Fallida"
                 + nl + "El Monto debe ser Mayor a Cero";
             JOptionPane.showMessageDialog(btndeposito, res);            }
         };
         
         btndeposito.addActionListener(depo);
         
           // Operacion de Retiro
            
          ActionListener reti = e -> {
            String result, res;
            double retiro;
            boolean one;
            double saldo;
            
            
            result = JOptionPane.showInputDialog("Indique el monto a retirar:");
            retiro = Double.parseDouble(result);
            
            saldo = op.ConsultaSaldo(txttarj.getText());
            one = op.Retiro(txttarj.getText(),retiro);
            
            
           //Condicion que valida que el monto sea mayor a cero
             
            if (retiro > 0) {
                // Condicion que valida si el monto es menor al saldo actual
                
                
                // Condicion que valida si la transaccion fue o no exitosa
             
                    if(one){
               res = "Transaccion Exitosa"  +  "Tienes menos dinero" + " :-)";
             JOptionPane.showMessageDialog(btnretiro, res);
            }else if (retiro > saldo ) {
             res = "Transaccion Fallida"
                + nl + "Fondos Insuficiente " + " Tas PELANDO " + " :´(";
             JOptionPane.showMessageDialog(btnretiro, res);            }
            } else{
              res = "Transaccion Fallida"
                + nl + "El monto debe ser Mayor a Cero" + " :´(";
             JOptionPane.showMessageDialog(btnretiro, res);    
              }  
            };
         
            btnretiro.addActionListener(reti);
         
            //Operacion de Cierre de Sesion
            
         ActionListener cierre = e -> {
         
             JOptionPane.showMessageDialog(btnLogOff, "HA FINALIZADO LA SESION CORRECTAMENTE" + " :D");
                                                       
               op.setLogOn (false);
               lbmessage.setText("");
               btnsaldo.setVisible(false);
               btndeposito.setVisible(false);
               btnretiro.setVisible(false);
               btnLogOff.setVisible(false);
               btncambioclave.setVisible(false);

               txttarj.setEnabled(true);
              
          
         };
         
         btnLogOff.addActionListener(cierre);
         
           // Contenedor de la vista
            
        Container con = window.getContentPane();
        GridLayout gl = new GridLayout(7, 3);
        con.setLayout(gl);
        
        // Añadiendo los componentes a la vista
        
        
        con.add(lbtar);
        con.add(txttarj);
        con.add(lbclave);
        con.add(txtclave);
        con.add(btnAcceso);
        con.add(btncambioclave);
        con.add(lbmessage);
        con.add(btnsaldo); 
        con.add(btndeposito);
        con.add(btnretiro);
        con.add(btnLogOff);
}    
}
