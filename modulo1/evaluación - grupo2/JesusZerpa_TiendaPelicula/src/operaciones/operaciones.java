/**
 * Clase de las Operaciones (Métodos).
 */
package operaciones;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jesus zerpa
 */
public class operaciones extends peliculas {

    ArrayList<String> array = new ArrayList();
    Scanner scan = new Scanner(System.in);
    private String cadena;
    private int pos;

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
    @Override
    public void MostrarPeliculas() {        
        for (int i=0; i<array.size();i++)
            System.out.println("#"+(i+1)+" "+array.get(i));
    }

    @Override
    public void BuscarPelicula() {
        int var=0;        
        System.out.println("Ingrese el nombre de la Película a Buscar");
        cadena=scan.nextLine();
        System.out.flush();
        for (int i=0; i<array.size();i++)
        {
            if (array.get(i).compareTo(cadena)==0)
            {
                System.out.println("La Película se encontró satisfactoriamente\n");
                var=1;
            }
        }
        if (var==0)
            System.out.println("La Película NO fue encontrada, intente nuevamente\n");        
    }

    @Override
    public void AgregarPelicula() {
        System.out.println("Escriba el nombre que desea ingresar");
        cadena=scan.nextLine();
        array.add(cadena);
        System.out.println("La Película fue agregada");
    }

    @Override
    public void ActualizarPelicula() {
        System.out.println("Escriba la posición de la película que desea modificar");
        pos=scan.nextInt();
        System.out.flush();

        System.out.println("Escriba el nuevo nombre de la Película");
        cadena=scan.nextLine();

        array.set((pos-1), cadena);

        System.out.println("La Película fue modificada");
    }

    @Override
    public void EliminarPelicula() {
        System.out.println("Escriba la posición de la película que desea eliminar");
        pos=scan.nextInt();

        array.remove(pos-1);

        System.out.println("La Película fue eliminada");
    }
    
    public void llenarArray()
    {
        array.add("Piratas del Caribe");
        array.add("Crepúsculo");
        array.add("Juegos del Hambre");
        array.add("Juegos del Hambre en llamas");
        array.add("Juegos del Hambre Sinsajo");
        array.add("El Conjuro");
        array.add("Anabella");
        array.add("13 Fantasmas");
        array.add("Rápidos y Furiosos");
        array.add("Zootopia");        
    }
 
    
}
