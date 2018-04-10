/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saime.main;

import com.saime.controllers.Operation;
import com.saime.models.Usuario;
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
 * @author pc11
 */
public class EntryPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operation op = new Operation();
        boolean login = false;

        

        //crear la ventana
        JFrame window = new JFrame("Cajero Automatico");
        //las medidas
        window.setSize(300,300);
        //accion al cerrarla
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //visibilidad
        window.setVisible(true);
        
         JLabel lbtar = new JLabel("Tarjeta: ");
        //creamos el campo de texto
        JTextField txttarj =  new JTextField(5);
        //creamos el label
        JLabel lbclave = new JLabel("Clave: ");
        //creamos el campo de texto
        JTextField txtclave =  new JTextField(4);
        //creamos el boton
        JButton btnin = new JButton("-> Ingresar <-");
        
        JLabel lbmessage = new JLabel();
        
        JButton btnsaldo = new JButton("-> Consulta Saldo <-");
        btnsaldo.setVisible(false);
        
        JButton btndeposito = new JButton("-> Deposito <-");
        btndeposito.setVisible(false);
        
        JButton btnretiro = new JButton("-> Retiro <-");
        btnretiro.setVisible(false);
        
        JButton btncierre = new JButton("-> Cerrar Sesion <-");
        btncierre.setVisible(false);
        
         ActionListener ale = e -> {
            //instanciamos la clase Operation
           boolean result = false;
           
           result = op.validarUsuario(txttarj.getText(),txtclave.getText());
           
           if (result){
              op.setLogin(true);
               lbmessage.setText("Usuario Valido");
               btnsaldo.setVisible(true);
               btndeposito.setVisible(true);
               btnretiro.setVisible(true);
               btncierre.setVisible(true);

               txttarj.setEnabled(false);
           }else{
               lbmessage.setText("Usuario InValido");
              op.setLogin(false);
              btnsaldo.setVisible(false);
           }
         };
         
         btnin.addActionListener(ale);
         
         ActionListener consul = e -> {
        
           double saldo;
           saldo = op.consultasaldo(txttarj.getText());
                     
           JOptionPane.showMessageDialog(btnsaldo, saldo);
         };
         
         btnsaldo.addActionListener(consul);
         
         
         ActionListener depo = e -> {
            String result, res;
            double deposito;
            boolean one;
            
           //saldo = op.consultasaldo(txttarj.getText());
            result = JOptionPane.showInputDialog("Indique el monto a depositar:");
            deposito = Double.parseDouble(result);
            
            one = op.deposito(txttarj.getText(),deposito);
            
            if(one){
               res = "Transaccion Exitosa";
             JOptionPane.showMessageDialog(btndeposito, res);
            }else{
             res = "Transaccion Fallida";
             JOptionPane.showMessageDialog(btndeposito, res);            }
         };
         
         btndeposito.addActionListener(depo);
         
          ActionListener reti = e -> {
            String result, res;
            double retiro;
            boolean one;
            
           //saldo = op.consultasaldo(txttarj.getText());
            result = JOptionPane.showInputDialog("Indique el monto a retirar:");
            retiro = Double.parseDouble(result);
            
            one = op.retiro(txttarj.getText(),retiro);
            
            if(one){
               res = "Transaccion Exitosa";
             JOptionPane.showMessageDialog(btnretiro, res);
            }else{
             res = "Transaccion Fallida";
             JOptionPane.showMessageDialog(btnretiro, res);            }
         };
         
         btnretiro.addActionListener(reti);
         
          
         
          ActionListener close = e -> {
        
        
              
               JOptionPane.showMessageDialog(btncierre, "Chao");
               op.setLogin(false);
               lbmessage.setText("");
               btnsaldo.setVisible(false);
               btndeposito.setVisible(false);
               btnretiro.setVisible(false);
               btncierre.setVisible(false);

               txttarj.setEnabled(true);
              
          
         };
         
         btncierre.addActionListener(close);
         
           // Contenedor de la vista
        Container con = window.getContentPane();
        GridLayout gl = new GridLayout(5, 2);
        con.setLayout(gl);
        
        // Añadiendo los componentes a la vista
        con.add(lbtar);
        con.add(txttarj);
        con.add(lbclave);
        con.add(txtclave);
        con.add(btnin);
        con.add(lbmessage);
        con.add(btnsaldo); 
        con.add(btndeposito);
        con.add(btnretiro);
        con.add(btncierre);

      
         
    }
    
}
