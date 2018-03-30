package tienda;
//**
/* Author Jose Romero
/* Tienda de Peliculas
/* Version 1.0.0
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Scanner;


public class Pelicula {
        Scanner scan= new Scanner(System.in);
        
        int sw;
        int opcion;      
        int opcion2;
        String agregar;
        String newgenero;
        ArrayList<String> movie = new ArrayList<>();
        ArrayList<String> type = new ArrayList<>();
        String[] pelicula = {"Tron", "Spiderman", "Avengers", "Indestructibles", "X-Men", "Ted", "Coco", "Buscando a Nemo", "Terremoto","Jumanji"};
        String[] genero = {"1-Accion", "2-Animacion", "3-Comedia", "4-Suspenso"};
        ArrayList<String> cinta = new ArrayList<>();
        
        
        String rpd;
        
        
        public void Opciones(){
           
            //Realizo el menu de opciones
            
           System.out.println("Bienvenido a la Tienda de Peliculas");
        System.out.println("1- Lista de Pelicula");
        System.out.println("2- Buscar Pelicula");
        System.out.println("3- Agregar Pelicula");
        System.out.println("4- Modificar Pelicula");
        System.out.println("5- Eliminar Pelicula");
        System.out.print("Escoja la opciòn que desea: "); 
        opcion=scan.nextInt();
            
            
        }        
        //Añado las peliculas al ArrayList
        
        public void Añadir(){
            cinta.add("1-Tron");
            cinta.add("2-Spiderman");
            cinta.add("3-Avengers");
            cinta.add("4-Indestructibles");
            cinta.add("5-X-Men");
            cinta.add("6-Ted");
            cinta.add("7-Coco");
            cinta.add("8-Buscando a Nemo");
            cinta.add("9-Terremoto");
            cinta.add("10-Jumanji");
        }
        
        //Listado de peliculas
       
        public void Listado(){
            
            System.out.println(" ");
            System.out.println("La lista de Peliculas que ofrecemos son las siguientes:");
            for (int i= 0;i < 10;i++){
            System.out.println(cinta.get(i));                           
            }
               
        }
        

        //Busqueda de Pelicula por genero
                
        public void BusquedaGenero(){
            System.out.println(" ");
            System.out.println("Generos:");
            
            for (int i= 0;i < 4;i++){
            System.out.println(genero[i]);
            }
            System.out.print("¿Que genero deseas buscar?: ");
                opcion2=scan.nextInt();
                switch (opcion2){
                    case 1:
                        System.out.println(" ");
                        System.out.println("Las peliculas de Accion son las siguientes: ");
                        for (int i=0;i < 5;i++){
                        System.out.println(cinta.get(i));
                        }
                    break;
                    case 2:
                        System.out.println(" ");
                        System.out.println("Las peliculas de Animacion son las siguientes: ");
                        for (int i=6;i < 8;i++){
                            System.out.println(cinta.get(i));
                        }
                    break;
                    case 3:
                        System.out.println(" ");
                        System.out.println("Las peliculas de Comedia son las siguientes: ");
                        System.out.println(cinta.get(5));
                    break;
                    case 4:
                        System.out.println(" ");
                        System.out.println("Las peliculas de Suspenso son las siguientes: ");
                        for (int i=8;i < 10;i++){
                            System.out.println(cinta.get(i));
                        }
                    break;
                        
                        
     }
        }
        
        //Añadir las peliculas
        
        public void Agregar(){
            
            do{
            System.out.println(" ");
            
                        
            System.out.print("¿Que pelìcula desea agregar?: ");
               agregar= scan.next();
                System.out.print("Escriba el genero de la pelicula: ");
                newgenero= scan.next();
               type.add(newgenero);
               cinta.add(agregar);
               System.out.println("Una pelicula ha sido agregada a la lista: ");
               
               for (int i= 0;i <= 10;i++){
                     System.out.println(cinta.get(i)); 
                                      }
                System.out.println(agregar);
               
            
               System.out.print("¿Desea agregar otra pelicula màs? [s/n]: ");
               rpd=scan.next();
                              
                  } while("s".equals(rpd));
                 }
        
        //Modificar las peliculas
        
        public void Modificacion() {
                    System.out.println(" ");
            ArrayList<String> cinta = new ArrayList<>();
            
                       
            
        }
        
        //Eliminar las Peliculas
        
        public void Eliminar(){
            System.out.println(" ");
            
            int kick;
            
            do {
            cinta.add("1-Tron");
            cinta.add("2-Spiderman");
            cinta.add("3-Avengers");
            cinta.add("4-Indestructibles");
            cinta.add("5-X-Men");
            cinta.add("6-Ted");
            cinta.add("7-Coco");
            cinta.add("8-Buscando a Nemo");
            cinta.add("9-Terremoto");
            cinta.add("10-Jumanji");
            System.out.println(" ");
            
            for (int i= 0;i < 10;i++){
            System.out.println(cinta.get(i));                           
            }
             System.out.println(movie);
            System.out.print("¿Que pelìcula deseas eliminar: ");
            kick=scan.nextInt();
            if (sw==0){kick= kick -1;}
            sw=1;
            System.out.println(" ");
                       
           System.out.println("Acabas de eliminar la numero" + " " + cinta.get(kick));
           cinta.remove(kick);
           System.out.print("¿Desea agregar otra pelicula màs? [s/n]: ");
               rpd=scan.next();
                              
                  } while("s".equals(rpd));
           
           
           
           
        }
}
             
        
        
        

     


    
    
        

