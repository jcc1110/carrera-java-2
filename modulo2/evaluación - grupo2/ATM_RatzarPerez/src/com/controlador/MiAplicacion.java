package com.controlador;

import com.modelo.*;
import com.modelo.dao.UsuarioDao;
import com.vista.*;

/**
 * Esta clase crea las instancias de las clases ventanas y la clase Logica  estableciendo las relaciones con la clase Coordinador. 
 * @author: Ratzar Zahir Perez Lopez
 * @version: Ver.03 30/03/2018
 * @see <a href =  "http://softrain.com.ve" /> Curso básico programacion Java 8
 * Evaluación - Cajero Automático
 * </a>
 */
public class MiAplicacion {
    
    /**
     * * variable sessionIdLogin --> permite guardar 
    *el id del usuario que realizo login en el sistema
     */
    
   public static String sessionTarjeta = null;
   public static Integer sessionId=-1;
   public static String sessionMensaje = "";
   /**
    * iniciar sistema, este metodo permite implementar nuestro diseño MVC
    */
    public void iniciarSistema() {

        
/**
 * Instanciamos las clases unicas
 */
        MiOperacionesLogica miOperacionesLogica = new MiOperacionesLogica();
        MiVentanaPrincipal miVentanaPrincipal = new MiVentanaPrincipal();
        MiVentanaLogin miVentanaLogin = new MiVentanaLogin(miVentanaPrincipal, true);
        MiVentanaLog miVentanaLog = new MiVentanaLog(miVentanaPrincipal, true);
        MiControlador miControlador = new MiControlador();
        UsuarioDao miUsuarioDao = new UsuarioDao();
        ArchivoLog miArchivoLog = new ArchivoLog();
/**       
*Relacionamos las clases con el Controlador 	
*/
        miOperacionesLogica.setCoordinador(miControlador);
        miVentanaPrincipal.setCoordinador(miControlador);
        miVentanaLogin.setCoordinador(miControlador);
        miVentanaLog.setCoordinador(miControlador);
        miUsuarioDao.setCoordinador(miControlador);
        miArchivoLog.setCoordinador(miControlador);
       
/**
 * Relacionamos el Controlador con las Clases
 */
       miControlador.set_miOperacionesLogica(miOperacionesLogica); 
       miControlador.set_miVentanaPrincipal(miVentanaPrincipal); 
       miControlador.set_miVentanaLogin(miVentanaLogin); 
        miControlador.set_miVentanaLog(miVentanaLog); 
       miControlador.set_miUsuarioDao(miUsuarioDao);
       miControlador.set_miArchivoLog(miArchivoLog);
/**
 * Levantamos la ventana principal del sistema
 */       
        miVentanaPrincipal.setVisible(true);
        miVentanaLogin.setVisible(true);

    }

}
