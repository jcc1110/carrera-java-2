package com.views;
import com.controllers.Operation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
/**
 * Interfaz gráfica
 * @author Jose Romero
 * @version 1.0.0
 */
public class MainFrame{
    
   public static void main(String[] args) {
        // Creando mi primera ventana
        Operation op= new Operation();
        
        JFrame ca = new JFrame("Cajero Automatico");
        ca.setSize(400, 300);
        ca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ca.setVisible(true);
        
        Container cp= ca.getContentPane();
    
        FlowLayout fl = new FlowLayout();
        BorderLayout bl= new BorderLayout();
        cp.setLayout(fl);
        
        
        
        JLabel etiqueta1= new JLabel("Tarjeta");
        JTextField texto1= new JTextField(20);
        JLabel etiqueta2= new JLabel ("Clave");
        JTextField texto2= new JTextField(20);
        JButton boton= new JButton("Ingresar");
        
        
        JButton consultar= new JButton("Consultar");
        consultar.setVisible(false);
        JButton depositar= new JButton("Depositar");
        depositar.setVisible(false);
        JButton retirar= new JButton("Retirar");
        retirar.setVisible(false);
        JButton cambiarclave= new JButton("Cambiar Clave");
        cambiarclave.setVisible(false);
        JLabel etiqueta3= new JLabel("Bievenido!");
        etiqueta3.setVisible(false);
        
        cp.add(etiqueta1);
        cp.add(texto1);
        cp.add(etiqueta2);
        cp.add(texto2);
        cp.add(boton);
        
            cp.add(etiqueta3);
            cp.add(consultar);
            cp.add(depositar);
            cp.add(retirar);
            cp.add(cambiarclave);
        
        //Accion de ingresar
        ActionListener al= e -> {
            
            String valor = texto1.getText();
            String valor1= texto2.getText();
            System.out.println("Usted ha sido autenticado con la tarjeta n° "+ valor);
            
            
            
            op.validarUsuario(valor1, valor1);
            boolean datos= op.validarUsuario(valor1, valor1);
            if (datos == true){
              
            etiqueta3.setVisible(true);
            consultar.setVisible(true);
            depositar.setVisible(true);
            retirar.setVisible(true);
            cambiarclave.setVisible(true);            
            }else {
                ActionListener inc= er -> {
            String mensaje;
            mensaje = ("Su tarjeta o clave es incorrecto");        
            JOptionPane.showMessageDialog(boton, mensaje);
                        
        };
        boton.addActionListener(inc);
            }
            
            
            
                                   
        };        
        boton.addActionListener(al);
        
        //Accion de consultar
        ActionListener al1= e -> {
            String mensaje;
            
            String valor = texto1.getText(); 
            mensaje = ("Su saldo es: " + op.consultar(valor));        
            JOptionPane.showMessageDialog(boton, mensaje);
                        
        };
        consultar.addActionListener(al1);
        
        //Accion de depositar
        ActionListener al2= f ->{
            
            
            String valorRetiro = texto1.getText();
            int monto = JOptionPane.showConfirmDialog(null, "Indique el monto");
            
        };
        depositar.addActionListener(al2);
                
        
    }
    
}
