/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vista;

import com.controlador.MiAplicacion;
import com.controlador.MiControlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 * Esta clase representa la ventana que permite al usuario realizar login para tener acceso al sistema
 * 
 * @author: Ratzar Zahir Perez Lopez
 * @version: Ver.03 30/03/2018
 * @see <a href =  "http://softrain.com.ve" /> Curso básico programacion Java 8
 * Evaluación - Cajero Automático
 * </a>
 * 
 */
public class MiVentanaLogin extends JDialog implements ActionListener {

// Variables declaration - do not modify                     
    private javax.swing.JButton botonAceptar;

    private javax.swing.JLabel imagen;
    private javax.swing.JLabel labelClave;
    private javax.swing.JPasswordField campoClave;

    private javax.swing.JLabel labelNroTarjeta;
    private javax.swing.JTextField campoNroTarjeta;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JLabel tituloLogin;

//Variable para almacenar el nombre del Controlador de la clase
    private MiControlador miControlador;

//    private Coordinador miCoordinador;
    // End of variables declaration  
    /**
     * Creates new form VentanaLogin
     */
    public MiVentanaLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Control de Acceso al Sistema");
        setSize(275, 330);
        setLocationRelativeTo(null);
        setResizable(false);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                Object[] options = {"Continuar", "Salir del Sistema"};
                int n = JOptionPane.showOptionDialog(null,
                        "Que desea hacer ?", "Confirmación", JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE, null, options, options[0]);

                if (n == JOptionPane.YES_OPTION) {
                } else if (n == JOptionPane.NO_OPTION) {
                    System.exit(0);//Cerrar todo el sistema
                }
            }
        });

    }

    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        tituloLogin = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        labelNroTarjeta = new javax.swing.JLabel();
        labelClave = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        campoNroTarjeta = new JTextField(20);
        campoClave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelLogin.setBackground(new java.awt.Color(204, 204, 204));
        panelLogin.setLayout(null);

        tituloLogin.setFont(new java.awt.Font("Comic Sans MS", 0, 25)); // NOI18N
        tituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLogin.setText("Validar Usuario");
        tituloLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelLogin.add(tituloLogin);
        tituloLogin.setBounds(10, 0, 250, 50);

        imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/candado2.png"))); // NOI18N
        imagen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelLogin.add(imagen);
        imagen.setBounds(10, 50, 250, 135);

        labelNroTarjeta.setText("Numero de Tarjeta");
        panelLogin.add(labelNroTarjeta);
        labelNroTarjeta.setBounds(10, 190, 200, 20);

        campoNroTarjeta.setBounds(150, 190, 100, 20);
        panelLogin.add(campoNroTarjeta);

        labelClave.setText("Clave");
        panelLogin.add(labelClave);
        labelClave.setBounds(10, 220, 70, 14);
        labelClave.setVisible(true);

        campoClave.setBounds(150, 220, 100, 20);
        campoClave.setVisible(true);
        panelLogin.add(campoClave);

        botonAceptar.setText("Aceptar");
        panelLogin.add(botonAceptar);
        botonAceptar.setBounds(150, 260, 110, 30);
        botonAceptar.addActionListener(this);

        getContentPane().add(panelLogin);
        panelLogin.setBounds(0, 0, 270, 300);

        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonAceptar) {
            boolean ok = false;
            String tarjeta1 = campoNroTarjeta.getText().trim();
            String clave1 = campoClave.getText().trim();

            ok = miControlador.validarDatosUsuarioLogin(tarjeta1, clave1);
            if (ok == false) {
//                JOptionPane.showMessageDialog(null, "UsuarioDao validar --> usuario existe = "+ok);
            miControlador.actualizarArchivoLogTxt("Se realizo un intento fallido de entrar al sistema");
                JOptionPane.showMessageDialog(null, "Datos invalidos", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (ok ==true){
                miControlador.actualizarArchivoLogTxt("El Usuario id: "+MiAplicacion.sessionId+" login: VALIDO");
                miControlador.cerrarVentanaLogin();
            }

        }
    }

    //metodo para asignar el Controlador de esta clase
    //relaciona la clasecon el coordinador
    public void setCoordinador(MiControlador miControlador) {
        this.miControlador = miControlador;
    }

}
