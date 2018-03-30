/**
 * @author Andrés Gordillo
 * Clase donde se realizan todas las Operaciones: Listar, Buscar, Agregar, Modificar y Eliminar
 */
package operaciones;
import java.util.*;

import interfaces.IOperaciones;

public class operaciones extends clases.Peliculas implements IOperaciones {
    
    private String cadena;                              //Atributo utilizado para obtener los valores de Cadena por Consola
    private Integer pos;                                //Atributo utilizado para obtener los valores enteros por Consola
    Scanner lectura = new Scanner(System.in);   //Definición y Creación de la Instancia de la Clase Scanner

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }   
    
    
    @Override
    public void listarPeliculas(ArrayList array) throws clases.excepciones {
        System.out.println("\n-------------------------------------------");
        System.out.println("Listando el Total de Películas");
        try{
            for (int i=0; i<array.size();i++)
                System.out.println((i+1)+") "+array.get(i).toString());
            System.out.println("-------------------------------------------\n");
        }
        catch(Exception e){
            throw new clases.excepciones("Ha ocurrido un error Listando las Películas, consulte con Anthony!!\n"+e.getMessage());
        }
    }

    @Override
    public void BuscarPelicula(ArrayList array) throws clases.excepciones {
        int sw=0;

        try{
            System.out.println("\n-------------------------------------------");
            System.out.println("Ingrese la Película a Buscar");
            cadena=lectura.nextLine();
            System.out.println("\nBuscando la Película");
            for (int i=0; i<array.size();i++)
            {
                if (array.get(i).toString().compareTo(cadena)==0)
                {
                    System.out.println("La Película fue encontrada\n");
                    sw=1;
                }
            }
            if (sw==0)
                System.out.println("La Película NO fue encontrada");            
            System.out.println("-------------------------------------------\n");
        }
        catch(Exception e){
            throw new clases.excepciones("Ha ocurrido un error Buscando la Película, consulte con Anthony!!\n"+e.getMessage());
        }
        
    }

    @Override
    public void AgregarPelicula(ArrayList array) throws clases.excepciones {
        try{
            System.out.println("\n-------------------------------------------");
            System.out.println("Escriba el nombre de la Película que desea ingresar");
            cadena=lectura.nextLine();

            System.out.println("\nAgregando la Película, espere.....");
            array.add(cadena);
            System.out.println("La Película fue agregada satisfactoriamente!!");
            System.out.println("-------------------------------------------\n");
        }
        catch(Exception e){
            throw new clases.excepciones("Ha ocurrido un error Insertando la Película, consulte con Anthony!!\n"+e.getMessage());
        }
    }

    @Override
    public void ModificarPelicula(ArrayList array) throws clases.excepciones {
        //HAY UN PROBLEMA DE VOLCADO DE MEMORIA!!, LO LÓGICO ES SOLICITAR LA POSICIÓN EN 1ER LUGAR Y LUEGO EL NOMBRE PERO DE ESE MODO NO FUNCIONA!!
        //LO RESOLVÍ (PARCHE O PQC, JEJEJE) DE ESTE MODO

        try{
            //INTENTÉ CON FFLUSH PERO NO FUNCIONÓ!!!
            System.out.flush();

            System.out.println("\n-------------------------------------------");
            System.out.println("Escriba el nuevo nombre de la Película");
            cadena=lectura.nextLine();

            System.out.println("\nEscriba la posición de la película que desea modificar");
            pos=lectura.nextInt();
            //pos = lectura.nextInt();


            array.set((pos-1), cadena);

            System.out.println("La Película fue modificada satisfactoriamente!!");
            System.out.println("-------------------------------------------\n");
        }
        catch(Exception e){
            throw new clases.excepciones("Ha ocurrido un error Modificando la Película, consulte con Anthony!!\n"+e.getMessage());
        }
    }

    @Override
    public void EliminarPelicula(ArrayList array) throws clases.excepciones {
        try{
            System.out.println("\n-------------------------------------------");
            System.out.println("Escriba la posición de la película que desea eliminar");
            pos=lectura.nextInt();

            array.remove(pos-1);

            System.out.println("La Película fue eliminada satisfactoriamente!!");
            System.out.println("-------------------------------------------\n");
        }
        catch(Exception e){
            throw new clases.excepciones("Ha ocurrido un error Modificando la Película, consulte con Anthony!!\n"+e.getMessage());
        }
    }
    
}
