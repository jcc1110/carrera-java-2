/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package michellefericelli_tpeliculas;
import java.util.*;
/**
 *version 1.0.0
 * @author Michelle
 */
public class Operaciones extends Peliculas {

    ArrayList<String> array = new ArrayList();
    Array a = new Array();
    Scanner scan = new Scanner(System.in);
    String posicion;
    private int i;

    public Operaciones() {
        a.CargarPeliculas();
    }
    

    @Override
    public void listarPeliculas(ArrayList pelis) {
        System.out.println("\n");
        for(int i=0; i<pelis.size(); i++){
            System.out.println(pelis.get(i).toString());
        }
        System.out.println("\n");
    }

    @Override
    public void BuscarPeliculas(ArrayList pelis) {
        boolean encontrado=false;
        String nombre;
        System.out.println("\nIngrese la Película a buscar");
        nombre= scan.nextLine();

        System.out.println("\n");
        for(int i= 0; i< pelis.size(); i++){
            if (pelis.get(i).toString().compareTo(nombre)==0)
            {
                System.out.println("Pelicula encontrada");
                encontrado = true;
            }
	}
        if (!encontrado)
                System.out.println("Pelicula no encontrada");
        System.out.println("\n");
    }

    @Override
    public void ModificarPeliculas(ArrayList pelis) {
        
        System.out.println("\n");
        System.out.println("Indique la pelicula que desea modificar");
        nombre = scan.next();
        System.out.println("Indique la posición que desea modificar");
        posicion = scan.next();
        array.set(posicion(i), nombre);
        System.out.println("La pelicula a sido modificada");
        System.out.println("\n");
        }
        
     

    @Override
    public void EliminarePeliculas(ArrayList pelis) {

            System.out.println("\n");
            System.out.println("Indique la pelicula que desea eliminar");
            nombre = scan.next();
            pelis.remove(i);
            System.out.println("Pelicula eliminada");
            System.out.println("\n");
    }

    @Override
    public void AgregarPeliculas(ArrayList pelis) {
        
        System.out.println("\n");
        System.out.println("Indique la pelicula que desea agregar");
        nombre = scan.next();
        pelis.add(i);
        System.out.println("Indique la posición en la que la desea agregar");
        posicion = scan.next();
        array.set(posicion(i), nombre);
        System.out.println("Pelicula agregada");
        System.out.println("\n");
    }

    private int posicion(int i) {
        return 0;  
    }
    }



