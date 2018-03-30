/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_inicio;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Ratzar
 */
public class menuInicio {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n; n = 99;
        boolean bandera=false;

        class_tienda t = new class_tienda();
        Scanner sc = new Scanner(System.in);
       
        
        
     t.pelicula_menu(); 
     do{
         bandera=false;
          try{
                 System.out.print("Introduce el numero de la opción seleccionar [0..5]: ");
                 n = sc.nextInt();
                 if((n>=0) & (n<=5)){bandera=false;}else{bandera=true;};
          }catch(InputMismatchException e){
                        sc.nextLine();
                        n=-1;
                       System.out.println("Debe introducir un número entero entre 0 y 5 !");
                       bandera=true;
          }
        
           if(!((n>=0) & (n<=5))&(bandera==false)) {
              System.out.println("Debe introducir un número entero entre 0 y 5 !");
         }
           
         
            switch (n) {
                case 1:
                    t.pelicula_listar();
                    break;
                case 2:
                    t.pelicula_buscar();
                    break;
                case 3:
                    t.pelicula_agregar();
                    break;
                case 4:
                    t.pelicula_modificar();
                    break;
                case 5:
                    t.pelicula_eliminar();
                    break;    
            }//fin switch
           
            t.pelicula_menu(); 
            
      }while(n!=0);
 
    }

}
