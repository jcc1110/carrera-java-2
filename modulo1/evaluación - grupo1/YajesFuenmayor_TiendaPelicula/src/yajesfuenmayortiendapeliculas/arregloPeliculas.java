/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yajesfuenmayortiendapeliculas;
import java.util.*;
/**
 *
 * @author Yajes Fuenmayor
 * @version 1.0
 */
public class arregloPeliculas extends abstractasPeliculas implements interfacesPeliculas{
    
    String valor;
    int  np;

/**
 * * Instancia de un arreglo
 */
    ArrayList<String> peliculas = new ArrayList<>();

/**
 * * Instancia del scan 
 */
    
    Scanner scan = new Scanner(System.in);

    /**
     *Creacion de la lista de peliculas 
     */
    public void peliculas (){
        peliculas.add("Iron Man");
        peliculas.add("The Incredible Hulk");
        peliculas.add("Capitán América: Civil War");
        peliculas.add("Thor: Ragnarok");
        peliculas.add("Pantera Negra");
        peliculas.add("Avengers: Infinity War");
        peliculas.add("Guardianes de la Galaxia");
        peliculas.add("Ant-Man and The Wasp");
        peliculas.add("Batman vs Superman");
        peliculas.add("La Mujer Maravilla");
    }
    
    public void Imprimir(){
        for (int i = 0; i < peliculas.size(); i++)
        {
            System.out.println((i+1)+") "+peliculas.get(i));
        }
    }

    /**
     *Sobrecarga del método Buscar - Usando método Abstracto
     */
    @Override
    public void Buscar() {
        System.out.println("\nIngrese la pelicula a buscar: ");
        valor = scan.nextLine();
        int var =0;
        
        for (int i = 0; i < peliculas.size(); i++)
        {
            if (peliculas.get(i).compareTo(valor)==0)
            {
                System.out.println("Pelicula encontrada");
                var=1;
            }            
        }
        if (var==0)
            System.out.println("Pelicula No encontrada");               
    }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
    /**
     *Sobrecarga del método Agregar 
     */
    @Override
    public void Agregar() {
        
        System.out.println("\nAgregar pelicula: ");
        valor = scan.nextLine();
        
        //Adiciono la pelicula 
        peliculas.add(0,valor);
        
        System.out.println("La nueva pelicula insertada es:\n");

        for (int i = 0; i < peliculas.size(); i++)
        {
            System.out.println(peliculas.get(i));    
        }
              
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *Sobrecarga del método Modificar - Usando Interfaces 
     */
    @Override
    public void Modificar() {
        
        System.out.flush();
  
        System.out.println("Nombre de la nueva Película:? ");
        valor = scan.nextLine();
              
        System.out.println("Que elemento desea modificar:? ");
        np = scan.nextInt();

        
        peliculas.set((np-1), valor);
       
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *Sobrecarga del método Eliminar - Usando Interfaces 
     */
    
    @Override
    public void Eliminar() {
        
        System.out.println("\n: Que posición desea eliminar? ");
        np = scan.nextInt();
        
        String remove = peliculas.remove(np-1);
        System.out.println(remove + " : Fue eliminada");

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
      
    
}
