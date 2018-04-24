/**
 * Esta clase define el inicio de la aplicacion
 * En el desarrollo de este sistema se implementa 
 * Se aplica el MVC permitiendo independizar 
 * la lógica y la parte visual del sistema 
 * usando para eso un controlador que administra 
 * los procesos sirviendo como puente entre estos.
 * Para la BD se usa MySql
 * 
 * 
 * @author: Ratzar Zahir Perez Lopez
 * @version: Ver.03 30/03/2018
 * @see <a href =  "http://softrain.com.ve" /> Curso básico programacion Java 8
 * Evaluación - Cajero Automático
 * </a>
 */
 

package com.controlador;


/**
 * Esta clase contiene el método main que ejecuta la aplicación
 */

public class MiPrincipal {
    public static void main(String[] args) {
        MiAplicacion miAplicacion = new MiAplicacion();
        miAplicacion.iniciarSistema();
        
    }
}
