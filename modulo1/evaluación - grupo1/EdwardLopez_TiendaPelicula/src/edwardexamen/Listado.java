/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edwardexamen;
import java.util.*;
/**
 *
 * @author Edward_Jr
 */
public class Listado  extends Acciones{
    protected ArrayList<String> lista = new ArrayList<>();
    protected Scanner scan = new Scanner(System.in);
    private String titulo;
    protected int pos;
    
    public void Peliculas()
    {
        System.out.println("\n");
        lista.add("El Padrino");
        lista.add("Gladiador");
        lista.add("El Conde de Montecristo");
        lista.add("El Padrino 2");
        lista.add("Evangelion");
        lista.add("V de Venganza");
        lista.add("El Último Samurai");
        lista.add("Troya");
        lista.add("Enemigo Público");
        lista.add("El Padrino 3");
        
    }
  
    //Agregar Películas
    @Override
    public void Agregar()
    {
        System.out.println("Ingrese el título de la película a agregar");
        titulo = scan.nextLine();
        lista.add(titulo);
    }
    @Override
    public void Modificar()
    {
        System.out.flush();
        
        System.out.println("Ingrese el Título de la Película: ");
        titulo = scan.nextLine(); 
        System.out.println("Ingrese la Posición de la Película a modificar: ");
        pos = scan.nextInt();
        lista.set((pos-1), titulo);     
        System.out.println("Película modificada.");
  
    }
    @Override
    public void Eliminar()
    {
        System.out.println("Ingrese la Posicion de la Película que desea eliminar: ");
        pos = scan.nextInt();
        
        lista.remove(pos-1);
    }

    @Override
    public void Listar() {
        for(int i = 0 ; i < lista.size() ; i++)
        {
            
            System.out.println((i+1) + " - " +lista.get(i));
        } 
        System.out.println("\n");
    }

    @Override
    public void Buscar() {
        System.out.println("Ingrese el título de la película que desea consultar: ");
        titulo = scan.nextLine();
     
        int flg = 0;
        for (int i = 0; i < lista.size(); i++)
        { 
        
         if(titulo.compareTo(lista.get(i))== 0)
            {
              System.out.println("Película disponible");
              flg = 1;
            } 
    
        }
         if(flg == 0)
           System.out.println("Película NO encontrada \n");
    }
      
}
