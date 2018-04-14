package com.view;

import com.Controller.Operacion;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ingreso 
{

    public static void main(String[] args) {
        
        //Creo la ventana
        JFrame V = new JFrame();
        V.setSize(400, 100);
        V.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        V.setVisible(true);
        
        //creando componentes
        JLabel lblNumTarj = new JLabel(" Numero Tarjeta ");
        JTextField txtNumTarjeta = new JTextField(5);
        JLabel lblPassword = new JLabel(" Contraseña ");
        JTextField txtPassword = new JTextField(5);
        JButton btnEntrar = new JButton("Entrar");
        
        
        //Manejo de eventos
        ActionListener ac = e -> 
        {
            
        // Instancias necesarias
            Operacion pa = new Operacion();
            String tarjeta = txtNumTarjeta.getText();
            String clave = txtPassword.getText();
            
        // Validando los datos
            if (pa.ValidarUsuario(tarjeta, clave)) {
                JOptionPane.showMessageDialog(btnEntrar, "Usuario valido");
                
               ManejoCuenta mc = new ManejoCuenta();
               mc.setVisible(true);
                
            } 
            else 
            {
                JOptionPane.showMessageDialog(btnEntrar, "Usuario invalido");
            }
        };
        btnEntrar.addActionListener(ac);
        
        
        
        
        
        //creo Container
        Container con = V.getContentPane();
        GridLayout Gl = new GridLayout(3, 2);
        con.setLayout(Gl);
        
        con.add(lblNumTarj);
        con.add(txtNumTarjeta);
        con.add(lblPassword);
        con.add(txtPassword);
        con.add(btnEntrar);
        
        //Manejo de evento
    }
    
}
