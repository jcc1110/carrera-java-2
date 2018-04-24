package com.vista;

import com.controlador.MiAplicacion;
import com.controlador.MiControlador;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
//import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

/**
 * Esta clase representa la ventana inicial de la aplicación 
 * se comunica con el modelo mediante la clase coordinador 
 * 
 * @author: Ratzar Zahir Perez Lopez
 * @version: Ver.03 30/03/2018
 * @see <a href =  "http://softrain.com.ve" /> Curso básico programacion Java 8
 * Evaluación - Cajero Automático
 * </a>
 * 
 */

public class MiVentanaPrincipal extends JFrame implements ActionListener {

//Declaracion de las Variables de Clase
    private Dimension tamPantalla;
    private Rectangle pantalla;
    private JMenuItem menuItemSaldo;
    private JMenuItem menuItemDeposito;
    private JMenuItem menuItemRetiro;
    private JMenuItem menuItemCambioClave;
    private JMenuItem menuItemSalir;
    private JMenuItem menuItemVerLogDelSistema;
    private JMenu menuBanco;
    private JMenu menuSalir;
    private JMenu menuVerLogdelSistema;
    private JMenuBar menuBarra;
    private Container miVentanaPanel;

//Variable para almacenar el nombre del Controlador de la clase
    private MiControlador miControlador;

//Constructor de la Clase
    public MiVentanaPrincipal() {
        super("Hola Ratzar");

//configurando propiedades de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");
        setSize(650, 350);
        setLocationRelativeTo(null);
        tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        pantalla = new Rectangle(tamPantalla);
        setBounds(pantalla);
        setResizable(false);
        setUndecorated(true);
        miVentanaPanel = getContentPane();
        miVentanaPanel.setBackground(new java.awt.Color(75, 1, 6));
        setLayout(null);

//configuracion personalizada para las cajas de dialogo JOptionPane        
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("ARIAL", Font.PLAIN, 20)));
//	 UIManager.put("OptionPane.messageForeground", Color.blue); 
//         UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("ARIAL", Font.PLAIN, 35))); 
//	 UIManager.put("OptionPane.background", Color.RED); 
//	 UIManager.put("Panel.background", Color.yellow); 
////	 JOptionPane.showMessageDialog(null, "Giovane"); }

//crear item del menu
        menuItemSaldo = new JMenuItem("Consultar Saldo");
        menuItemDeposito = new JMenuItem("Realizar Depósito");
        menuItemRetiro = new JMenuItem("Realizar Retiro");
        menuItemCambioClave = new JMenuItem("Realizar Cambio Clave");
        menuItemVerLogDelSistema = new JMenuItem("Ver Log del Sistema", new ImageIcon(getClass().getResource("/com/imagenes/search.gif")));
        menuItemSalir = new JMenuItem("Salir del Sistema", new ImageIcon(getClass().getResource("/com/imagenes/exit.gif")));

// definir fuente de eventos
        menuItemSaldo.addActionListener(this);
        menuItemDeposito.addActionListener(this);
        menuItemRetiro.addActionListener(this);
        menuItemCambioClave.addActionListener(this);
        menuItemSalir.addActionListener(this);
        menuItemVerLogDelSistema.addActionListener(this);

//crear menu
        menuBanco = new JMenu("Cajero Automático");
        menuVerLogdelSistema = new JMenu("Ver Log del Sistema");
        menuSalir = new JMenu("Salir");

        menuSalir.setFont(menuSalir.getFont().deriveFont((float) 16));
        menuBanco.setFont(menuBanco.getFont().deriveFont((float) 16));
        menuVerLogdelSistema.setFont(menuVerLogdelSistema.getFont().deriveFont((float) 16));

// incrluir item al menu
        menuBanco.add(menuItemSaldo);
        menuBanco.addSeparator();
        menuBanco.add(menuItemDeposito);
        menuBanco.add(menuItemRetiro);
        menuBanco.addSeparator();
        menuBanco.add(menuItemCambioClave);
        menuBanco.add(menuItemCambioClave);
        menuVerLogdelSistema.add(menuItemVerLogDelSistema);
        menuSalir.add(menuItemSalir);

//crear barra de menu
        menuBarra = new JMenuBar();
        menuBarra.setPreferredSize(new java.awt.Dimension(62, 30));

//incluimos el menu dentro de la barra de menu
        menuBarra.add(menuBanco);
        menuBarra.add(menuVerLogdelSistema);
        menuBarra.add(menuSalir);

//incluimos la barra de menu dentro de mi ventana 
        setJMenuBar(menuBarra);

    }

// Clase Principal
//    public static void main(String[] arg) {
//        MiVentanaPrincipal x = new MiVentanaPrincipal();
//        x.setVisible(true);
//    }
//Implementacion Clase Abastrabta interfaz    
//███████████████████████████████████████████████
    @Override
    public void actionPerformed(ActionEvent e) {
        double num = 0;
        boolean ok = false;
        boolean aprobado = false;
        String valorRetorno = "";

//▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄
//Evento del menuItemSalir
        if (e.getSource() == menuItemSalir) {
            JOptionPane.showMessageDialog(null, "Saliendo del Sistema...\n Hasta luego.", "Mensaje", JOptionPane.WARNING_MESSAGE);
            miControlador.actualizarArchivoLogTxt("El Usuario id: " + MiAplicacion.sessionId + " Salio del Sistema");
            System.exit(0);
        }
//▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄        
        if (e.getSource() == menuItemDeposito) {
            aprobado = false;
            ok = false;
//ventana para solicitar al usuario ingresar un dato
            String respuesta = null;
            String mensaje = "Error: valor ingresado no es valido.\n\n No esta permitido ingresar: \n\t Caracteres especiales \n\t Signo +/- \n\t Mas de dos digitos en la parte decimal.";
            respuesta = JOptionPane.showInputDialog(null,
                    "Ingrese el monto a depositar ",
                    "Deposito",
                    JOptionPane.QUESTION_MESSAGE);
//             JOptionPane.showMessageDialog(null, mensaje, respuesta, JOptionPane.ERROR_MESSAGE);

            if ((respuesta != null) && (respuesta != "")) { //se pulso un boton distinto de CANCELAR en el showInputDialog

//validar dato ingresado
                ok = miControlador.validarNumeroDecimal(respuesta);
//dato invalido
                if (ok == false) {
                    JOptionPane.showMessageDialog(null, mensaje, "Dato invalido", JOptionPane.ERROR_MESSAGE);
                }
//dato valido
                if (ok == true) {
                    Double num1 = Double.parseDouble(respuesta);
                    aprobado = miControlador.realizarDeposito(num1);

                    if (aprobado) {
                        JOptionPane.showMessageDialog(null, "Deposito realizado con exito.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        miControlador.actualizarArchivoLogTxt("El Usuario id: " + MiAplicacion.sessionId + " Realizo un Deposito con Exito");
                    } else {
                        JOptionPane.showMessageDialog(null, "Fallo operacion de Deposito. ", "Mensaje", JOptionPane.ERROR_MESSAGE);
                    }
                }

            }
        }
//▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄        
        if (e.getSource() == menuItemRetiro) {
            double ingresos1 = 0.0;
            double egresos1 = 0.0;
            double disponibilidad1 = 0.0;
            aprobado = false;
            Integer usuarioId = MiAplicacion.sessionId;
            ok = false;
//ventana para solicitar al usuario ingresar un dato
            String respuesta = null;
            String mensaje = "Error: valor ingresado no es valido.\n\n No esta permitido ingresar: \n\t Caracteres especiales \n\t Signo +/- \n\t Mas de dos digitos en la parte decimal.";
            respuesta = JOptionPane.showInputDialog(null,
                    "Ingrese el monto a retirar ",
                    "Retiro",
                    JOptionPane.QUESTION_MESSAGE);
            if (respuesta != null && respuesta != "") { //se pulso un boton distinto de CANCELAR en el showInputDialog	
//validar dato ingresado
                ok = miControlador.validarNumeroDecimal(respuesta);

//verificar que el monto a retirar no seha mayor al disponible
                if (ok == true) {
                    ingresos1 = miControlador.consultarMovimientosUsuario(usuarioId, "I");
                    egresos1 = miControlador.consultarMovimientosUsuario(usuarioId, "E");
                    disponibilidad1 = ingresos1 - egresos1;
                }
                if (disponibilidad1 > Double.parseDouble(respuesta)) {

                    if (ok == false) {
                        JOptionPane.showMessageDialog(null, mensaje, "Dato invalido", JOptionPane.ERROR_MESSAGE);
                    }
                    //dato valido
                    if (ok == true) {
                        Double num1 = Double.parseDouble(respuesta);
                        aprobado = miControlador.realizarRetiro(num1);

                        if (aprobado) {
                            JOptionPane.showMessageDialog(null, "Retiro realizado con exito.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            miControlador.actualizarArchivoLogTxt("El Usuario id: " + MiAplicacion.sessionId + " Realizo un Retiro con Exito");
                        } else {
                            JOptionPane.showMessageDialog(null, "Fallo operacion de Retiro. ", "Mensaje", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Saldo insufuciente para realizar esta operación.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
//▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄        
        if (e.getSource() == menuItemCambioClave) {
            aprobado = false;
            Integer usuarioId = MiAplicacion.sessionId;
            ok = false;
//ventana para solicitar al usuario ingresar un dato
            String respuesta = null;
            String mensaje = "Error: valor ingresado no es valido. \n\n Solo se acentan digitos del 1 al 9 \n La clave no puede tener mas de 5 digitos. ";
            respuesta = JOptionPane.showInputDialog(null,
                    "Ingrese la nueva clave ",
                    "Cambio Clave",
                    JOptionPane.QUESTION_MESSAGE);
            if (respuesta != null && respuesta != "") { //se pulso un boton distinto de CANCELAR en el showInputDialog	
//validar dato ingresado
                ok = miControlador.validarClaveIngresada(respuesta);

                if (ok == false) {
                    JOptionPane.showMessageDialog(null, mensaje, "Dato invalido", JOptionPane.ERROR_MESSAGE);
                }

                if (ok == true) {
                    Integer num2 = Integer.parseInt(respuesta);
                    aprobado = miControlador.realizarCambioClave(num2);

                    if (aprobado) {
                        JOptionPane.showMessageDialog(null, "Cambio de clave  realizado con exito.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        miControlador.actualizarArchivoLogTxt("El Usuario id: " + MiAplicacion.sessionId + " Realizo un Cambio de Clave con Exito");
                    } else {
                        JOptionPane.showMessageDialog(null, "Fallo operacion de Cambio de clave. ", "Mensaje", JOptionPane.ERROR_MESSAGE);
                    }
                }

            }
        }
//▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄        
//Evento del menuItemSalir
        if (e.getSource() == menuItemSaldo) {

            Double saldoCuenta1 = miControlador.consultarSaldoCuenta();

            JOptionPane.showMessageDialog(null,
                    MiAplicacion.sessionMensaje + "\n" + "Saldo de la cuenta: " + saldoCuenta1,
                    "Consulta de Saldo",
                    JOptionPane.INFORMATION_MESSAGE);
            miControlador.actualizarArchivoLogTxt("El Usuario id: " + MiAplicacion.sessionId + " Realizo una Consulta de Saldo con Exito");
        }

//▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄        
//Evento del menuItemSalir
        if (e.getSource() == menuItemVerLogDelSistema) {

//            MiVentanaLog miVentanaLog = new MiVentanaLog();
             miControlador.abrirVentanaLog();
//
//            miVentanaLog.leerArchivoTxt();
//            miVentanaLog.setVisible(true);

        }

        //▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄
    }// fin  public void actionPerformed(ActionEvent e) {

//███████████████████████████████████████████████
    //metodo para asignar el Controlador de esta clase
    //relaciona la clasecon el coordinador
    public void setCoordinador(MiControlador miControlador) {
        this.miControlador = miControlador;
    }

}
