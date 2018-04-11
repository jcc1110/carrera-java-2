package com.saime.structures;

/**
 * Excepción para la división entre cero
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public class DivisionZeroException extends Exception {
    /**
     * Constructor de la clase padre
     * @param message Mensaje de la excepción
     */
    public DivisionZeroException(String message) {
        super(message);
    }
}