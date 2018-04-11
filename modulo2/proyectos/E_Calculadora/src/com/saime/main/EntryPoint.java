package com.saime.main;
import com.saime.models.Operation;
import com.saime.structures.DivisionZeroException;
import java.util.Scanner;

/**
 * Clase principal
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public class EntryPoint {
    /**
     * Método de entrada de la aplicación
     * @param args comandos iniciales
     */
    public static void main(String[] args) {
        // Instancia de las clases necesarias
        int result = 0;
        boolean message = true;
        Scanner scan = new Scanner(System.in);
        Operation op = new Operation();
        
        // Mostrar un menú de opciones
        System.out.println("Bienvenida a la Calculadora AH");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        
        // Solicito la opción a trabajar
        System.out.print("Opción: ");
        op.setOperator(scan.nextInt());
        
        // Solicito el valor uno
        System.out.print("Indique el valor uno: ");
        op.setOne(scan.nextInt());
        
        // Solicito el valor dos
        System.out.print("Indique el valor dos: ");
        op.setTwo(scan.nextInt());
        
        // Evaluamos el operador
        switch(op.getOperator()) {
            // Sumar
            case 1: result = op.sumar(); break;
            // Restar
            case 2: result = op.restar(); break;
            // Multiplicar
            case 3: result = op.multiplicar(); break;
            // Dividir
            case 4: 
                try {
                    result = op.dividir();
                } catch(DivisionZeroException dze) {
                    System.out.println(dze.getMessage());
                    message = false;
                } catch(Exception ex) {
                    System.out.println(ex.getMessage());
                    message = false;
                }
                break;
            // Caso por defecto en caso de no sea ningún valor
            default: message = false; break;
        }
        
        // Muestro el resultado de la operación
        if (message) {
            System.out.println("El resultado de su operación es: " + result);
        } else {
            System.out.println("Opción no válida");
        }
    }    
}
