
package com.controlador;

import com.modelo.ArchivoLog;
import com.modelo.MiOperacionesLogica;
import com.modelo.dao.UsuarioDao;
import com.vista.MiVentanaLog;
import com.vista.MiVentanaLogin;
import com.vista.MiVentanaPrincipal;

/**
 * Esta clase es la parte del MVC que define la lógica de administración del sistema, establece la conexión entre la vista y el modelo.
 * 
 * @author: Ratzar Zahir Perez Lopez
 * @version: Ver.03 30/03/2018
 * @see <a href =  "http://softrain.com.ve" /> Curso básico programacion Java 8
 * Evaluación - Cajero Automático
 * </a>
 * 
 */

public class MiControlador {
//Declaracion de variables de la clase

    private MiOperacionesLogica miOperacionesLogica;
    private MiVentanaPrincipal miVentanaPrincipal;
    private MiVentanaLogin miVentanaLogin;
    private UsuarioDao miUsuarioDao;
    private ArchivoLog miArchivoLog;
    private MiVentanaLog miVentanaLog;

/**
 * //Metodo que Relaciona el Controlador con la Clase MiOperacionesLogica 
 * 
 * @param miOperacionesLogica 
 */    

    void set_miOperacionesLogica(MiOperacionesLogica miOperacionesLogica) {
        this.miOperacionesLogica = miOperacionesLogica;
    }

    /**
     * //Metodo que Relaciona el Controlador con la Clase MiVentanaPrincipal 
     * @param miVentanaPrincipal 
     */


    void set_miVentanaPrincipal(MiVentanaPrincipal miVentanaPrincipal) {
        this.miVentanaPrincipal = miVentanaPrincipal;
    }
    
    /**
     * //Metodo que Relaciona el Controlador con la Clase MiVentanaLogin 
     * 
     * @param miVentanaLogin 
     */


    void set_miVentanaLogin(MiVentanaLogin miVentanaLogin) {
        this.miVentanaLogin = miVentanaLogin;
    }
    
    /**
     * //Metodo que Relaciona el Controlador con la Clase MiVentanaLog  
     * @param miVentanaLog 
     */
  
    void set_miVentanaLog(MiVentanaLog miVentanaLog) {
        this.miVentanaLog = miVentanaLog;
    }
    
    /**
     * //Metodo que Relaciona el Controlador con la Clase miUsuarioDao     
     * @param miUsuarioDao 
     */


    void set_miUsuarioDao(UsuarioDao miUsuarioDao) {
        this.miUsuarioDao = miUsuarioDao;
    }

    /**
     * //Metodo que Relaciona el Controlador con la Clase miArchivoLog     
     * @param miArchivoLog 
     */

      void set_miArchivoLog(ArchivoLog miArchivoLog) {
       this.miArchivoLog = miArchivoLog;
    }
      
      
      
      
/**
 * Metodos para manejar operaciones
 * 
 */
      

    /**
     * el metodo validarNumeroDecimal valida: si el valor pasado al metodo es un
     * numero decimal que no tenga mas de dos digitos en la parte decimal que no
     * tenga el signo + ó -
     *
     * @param respuesta
     * @return
     */
    public boolean validarNumeroDecimal(String respuesta) {
//        miOperacionesLogica.validarNumeroDecimal(respuesta);
        return miOperacionesLogica.validarNumeroDecimal(respuesta);

    }

    ;
    
    
/**
 * el metodo validarDatosUsuarioLogin permite validar los datos ingresados en la ventana login
 * @param tarjeta1
 * @param clave1
 * @return 
 */
    public boolean validarDatosUsuarioLogin(String tarjeta1, String clave1) {
        boolean tarjetaExiste = false;
        boolean clave1Existe = false;
        boolean datosCorrectos = false;

//       tarjetaExiste = miUsuarioDao.tarjetaConsultarExiste(tarjeta1);
        datosCorrectos = miUsuarioDao.validarDatosLogin(tarjeta1, clave1);

        return datosCorrectos;

    }

    
    public void cerrarVentanaLogin() {
        //miVentanaLogin.setVisible(true);
        miVentanaLogin.dispose();
    }

    public Double consultarSaldoCuenta() {
        return miUsuarioDao.consultarSaldo();

    }

    public boolean realizarDeposito(Double num1) {

        return miUsuarioDao.insertarDeposito(num1);

    }

    public boolean realizarRetiro(Double num1) {
        return miUsuarioDao.insertarRetiro(num1);
    }

    public double consultarMovimientosUsuario(Integer usuarioId, String i) {
        return miUsuarioDao.consultarMovimientosUsuario(usuarioId, i);
    }

    public boolean realizarCambioClave(Integer num2) {
        return miUsuarioDao.actualizarClave(num2);
    }

    public boolean validarClaveIngresada(String respuesta) {
        return miOperacionesLogica.validarClaveUIngresada(respuesta);
    }

    public void actualizarArchivoLogTxt(String mensaj) {
        miArchivoLog.crearLog(mensaj);
    }

//    void set_miVentanaLogin(MiVentanaLog miVentanaLog) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public void abrirVentanaLog() {
          miVentanaLog.leerArchivoTxt();
          miVentanaLog.setVisible(true);
    }


  

}
