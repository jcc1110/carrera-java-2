/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atm.views;

import com.atm.controllers.Operation;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author pc4
 */
public class MainFrame {
    
    public static void main(String[] args){
    //Crear la ventana
    JFrame atmw = new JFrame("ATM");
    atmw.setSize(300, 200);
    atmw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    atmw.setVisible(true);
    
    //Creando componentes
    //Solicitando Datos de la tarjeta
      JLabel lbc = new JLabel("Card");
      JTextField txtc = new JTextField(20);
    //Solicitando el PASSWORD
      JLabel lbp = new JLabel("Pass");
      JTextField txtp = new JTextField(20);
      
      //Boton Validate
       JButton btnValidate = new JButton("Login");
       
       //Manejador del Evento
      
    }
}
