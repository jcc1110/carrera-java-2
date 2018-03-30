/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jelitzamena_tiendapelicula;

import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class Peliculas {
    //atributos
String titulo;
String nombpeli;
String Peliculas;
int opcion;
int pos;
int posicion = 1; 
int jm; 

 
Scanner scan = new Scanner(System.in);

    //Constructor
    public Peliculas(String titulo, String Peliculas, int opcion) {
        this.Peliculas = Peliculas;
        this.opcion = opcion;
    }
    ArrayList<String> Pelicula = new ArrayList<>();
   
    Peliculas() {
        this.posicion = Pelicula.size();
    }
    public void Peliculas() {
    Pelicula.add ("Loving");
    Pelicula.add ("Titanic");
    Pelicula.add ("El Padrino");
    Pelicula.add ("Gladiator");
    Pelicula.add ("El rey león");
    Pelicula.add ("El caballero oscuro");
    Pelicula.add ("Cadena perpetua");
    Pelicula.add ("Toy Story");
    Pelicula.add ("Crimen organizado");
    Pelicula.add ("Secretos y mentiras");
    }
    public void getimprimir(){
    for (int i = 0; i < Pelicula.size(); i++) {
    System.out.println((i+1) + " - " +Pelicula.get(i));
       }
       System.out.println("\n");
   }
       
    public void getBuscar()
    {
      
        System.out.println("Ingrese el nombre de la pelicula que desea buscar: ");
        titulo = scan.nextLine();
            
        for (int i = 0; i < Pelicula.size(); i++)
        { 
            if(titulo.compareTo(Pelicula.get(i))==0)
            {
              System.out.println("La Pelicula si esta disponible");
              jm = 1;
            } 
        }
         if(jm == 0)
           System.out.println("Película NO esta disponible");
    }

    public void Agregar() {
    System.out.println("Ingrese la Pelicula que desea agregar ");
    nombpeli = scan.nextLine();
    Pelicula.add(nombpeli);    
    }
    
    public void Modificar(){
       System.out.flush();
       System.out.println("Ingrese el Título de la Película que desea modificar: ");
       titulo = scan.nextLine();
       System.out.println("Ingrese la Posición de la Película a modificar: ");
       pos = scan.nextInt();
       Pelicula.set((pos-1), titulo);
    }
    
    public void Eliminar() {
    System.out.println("Ingrese la Pelicula que desea eliminar ");
    nombpeli = scan.nextLine();
    Pelicula.remove(nombpeli);    
    }

   
   
    }





      

