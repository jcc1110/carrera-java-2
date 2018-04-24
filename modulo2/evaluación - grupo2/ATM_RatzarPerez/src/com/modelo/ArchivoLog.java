package com.modelo;

import com.controlador.MiControlador;
import java.io.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * RATZAR OJO: el archivo log.txt se crea en la carpeta raiz de mi proyecto si
 * voy al menu de Netbeans: herramientas-->archivos y luego a la carpeta
 * principal de mi proyecto vere que esta el archivo log.txt
 */
public class ArchivoLog {

    String nombreArchivo = "log.txt";
    FileWriter archivo; //nuestro archivo log
    private MiControlador miControlador;

    //OJOJOJO al metodo crearLog de mi clase archivo log le debo pasar como argumento el texto que quiero introducir en el archivo.
    public void crearLog(String textoIntroducirAlArchivo) {

//Pregunta el archivo existe, caso contrario crea uno con el nombre log.txt
        try {
            if (new File(nombreArchivo).exists() == false) {

                archivo = new FileWriter(new File(nombreArchivo), false);

            }
            archivo = new FileWriter(new File(nombreArchivo), true);
            Calendar fechaActual = Calendar.getInstance(); //Para poder utilizar el paquete calendar     
            //Empieza a escribir en el archivo
            archivo.write((String.valueOf(fechaActual.get(Calendar.DAY_OF_MONTH))
                    + "/" + String.valueOf(fechaActual.get(Calendar.MONTH) + 1)
                    + "/" + String.valueOf(fechaActual.get(Calendar.YEAR))
                    + ";" + String.valueOf(fechaActual.get(Calendar.HOUR_OF_DAY))
                    + ":" + String.valueOf(fechaActual.get(Calendar.MINUTE))
                    + ":" + String.valueOf(fechaActual.get(Calendar.SECOND))) + ";" + textoIntroducirAlArchivo + "\r\n");
            archivo.close(); //Se cierra el archivo
        } catch (IOException ex) {
            Logger.getLogger(ArchivoLog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//Fin del metodo crearLog
    
    
    
//metodo para realacionar clases de MVC
    public void setCoordinador(MiControlador miControlador) {
        this.miControlador = miControlador;
    }

}
