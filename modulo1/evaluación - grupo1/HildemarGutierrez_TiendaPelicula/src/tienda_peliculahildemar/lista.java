/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tienda_peliculahildemar;
import java.util.*;

/**
 *
 * @author saime
 */
public class lista {
    int i,eli;
    String arre, nak;
    int posicion;
    
    ArrayList<String> arre = new ArrayList<>();
    Scanner scan = new Scanner();

    public lista(String arreglo){
    
        this.arreglo = arre;
        this.posicion = arre.size();
        
    }

   
    public void listapelicula(){
               

            arreglo.add("troya");
            arreglo.add("titanic");
            arreglo.add("troya");
            arreglo.add("troya");
            arreglo.add("troya");
            
            for(i = 0; i < arre.size();i++){
                System.out.println(" "+arre.get(i) );
            }
        
    }
    
    public void buscarpelicula(){
        
         System.out.println("Ingerese el nombre la pelicula a buscar");
         buscar = scan.next();
         
        for(i = 0; i < arre.size();i++){
            if(arre.get(i).toString.compareTo(buscar)){
                System.out.println("Pelicula encontrada");
            }else{
                System.out.println("No se encuentra");
            }
         }
    }
    
    public void eliminar(){
        
            arreglo.add("troya");
            arreglo.add("titanic");
            arreglo.add("troya");
            arreglo.add("troya");
            arreglo.add("troya");
            
            for(i = 0; i < arre.size();i++){
                System.out.println("Seleccione la opcion de la pelicula a eliminar");
                System.out.println(" 1. "+arre.get(i) );
            }
            
            eli = scan.nextInt();
            
            arreglo.remove(eli-1);     
            
    }
    
    public void agregar(){
        
        System.out.println("Ingrese la nueva pelicula que desea agregar");
        nak = scan.next();
        
        arreglo.add(nak);

    }
    
    public void modificar(){
        
        
    }
    
}

    

    
