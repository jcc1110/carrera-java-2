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
        int resultado = 0;
        boolean mensaje = true;
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
            case 1: // Sumar
                resultado = op.sumar();
                break;
            case 2: // Restar
                resultado = op.restar();
                break;
            case 3: // Multiplicar
                resultado = op.multiplicar();
                break;
            case 4: // Dividir
                try {
                    resultado = op.dividir();
                } catch(DivisionZeroException dze) {
                    System.out.println(dze.getMessage());
                    mensaje = false;
                } catch(Exception ex) {
                    System.out.println(ex.getMessage());
                    mensaje = false;
                }
                break;
            default:
                mensaje = false;
                break;
        }
        
        // Muestro el resultado
        if (mensaje) {
            System.out.println("El resultado de su operación es: " + resultado);
        } else {
            System.out.println("Opción no válida");
        }
    }    
}
