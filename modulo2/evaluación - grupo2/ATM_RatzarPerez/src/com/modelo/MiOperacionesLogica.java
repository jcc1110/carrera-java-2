package com.modelo;

import com.controlador.MiControlador;

/**
 * Esta clase permite realizar las operaciones asociadas a la lógica  desde ella realizamos las validaciones.
 * @author: Ratzar Zahir Perez Lopez
 * @version: Ver.03 30/03/2018
 * @see <a href =  "http://softrain.com.ve" /> Curso básico programacion Java 8
 * Evaluación - Cajero Automático
 * </a>
 * 
 */

public class MiOperacionesLogica {

//Variable para almacenar el nombre del Controlador de la clase
    private MiControlador miControlador;

//*************
    /**
     * el metodo validarNumeroDecimal valida: si el valor pasado al metodo es un
     * numero decimal que no tenga mas de dos digitos en la parte decimal que no
     * tenga el signo + ó -
     *
     * @param respuesta
     * @return
     */
    public boolean validarNumeroDecimal(String respuesta) {
        boolean numeroValido = true;
        try {
            Double num = Double.parseDouble(respuesta);
            // indexOf devuelve un numero negativo si no encuentra nada  // INDICE EMPIEZA EN 0
            if (respuesta.indexOf("-") >= 0) {
                numeroValido = false;
            }; //obtener la posición de la primera ocurrencia de la letra //OJO INDICE EMPIEZA EN 0 // devuelve un numero negativo si no encuentra nada
            if (respuesta.indexOf("+") >= 0) {
                numeroValido = false;
            }; //obtener la posición de la primera ocurrencia de la letra //OJO INDICE EMPIEZA EN 0 // devuelve un numero negativo si no encuentra nada
            if (respuesta.indexOf(".") >= 0) {
                Integer pos1 = respuesta.indexOf(".");//optengo el indice de la posicion donde esta el punto 
                String pos3 = respuesta.substring(pos1 + 1);//estraer un substring desde una posición determinada hasta el final del string 
                Integer pos4 = pos3.length(); //cantidad de caracteres/digitos despues del punto
                if (pos4 > 2) {
                    numeroValido = false;
                }

            };
        } catch (NumberFormatException fe) {
            numeroValido = false;
//                JOptionPane.showMessageDialog(null, "Error el numero ingresado no es valido");
        } catch (NullPointerException fe) {
            numeroValido = false;
        }
        return numeroValido;
    }
    //metodo para asignar el Controlador de esta clase
    //relaciona la clasecon el coordinador

    public void setCoordinador(MiControlador miControlador) {
        this.miControlador = miControlador;
    }

    public boolean validarClaveUIngresada(String respuesta) {

        boolean numeroValido = true;
        try {
            Integer num = Integer.parseInt(respuesta);
            if (num <= 0 || num > 99999) {
                numeroValido = false;

            }

        } catch (NumberFormatException fe) {
            numeroValido = false;
//                JOptionPane.showMessageDialog(null, "Error el numero ingresado no es valido");
        } catch (NullPointerException fe) {
            numeroValido = false;
        }
        return numeroValido;
    }

}
