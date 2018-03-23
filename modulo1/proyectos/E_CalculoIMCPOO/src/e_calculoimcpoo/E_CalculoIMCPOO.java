package e_calculoimcpoo;

import java.util.Scanner;

public class E_CalculoIMCPOO {
    public static void main(String[] args) {
        // Instancia de las clases necesarias
        IMC imc = new IMC();
        Scanner scan = new Scanner(System.in);
        
        // Solicito los datos al usuario
        System.out.print("Indique su peso: ");
        imc.peso = scan.nextDouble();
        
        // Solicito los datos al usuario
        System.out.print("Indique su altura: ");
        imc.altura = scan.nextDouble();
        
        // Llamada a los métodos
        imc.diagnostico();
    }    
}
