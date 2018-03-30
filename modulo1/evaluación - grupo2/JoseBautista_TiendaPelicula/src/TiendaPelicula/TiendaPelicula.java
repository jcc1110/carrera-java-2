package TiendaPelicula;

import leer.Leer;
/**
 * Evaluación I creando tienda de películas
 * @author Jose Bautista
 */

public class TiendaPelicula {

    public static void main(String[] args) {
		
	
    System.out.println("BIENVENIDOS A LA TIENDA DE PELÍCULAS JMBR\n--------\n"
			+ "El programa simula una tienda que vende Peliculas\n"
			+ "Varidedad de peliculas disponibles en la tienda\n"
			+ "El usuario puede:\n"
			+ "\t Listar y Buscar Peliculas\n"
                        + "\t Agregar o Modificar.\n"
                        + "\t Eliminar Pelicula.");
			

		boolean continuar = true;
                // Variables para seleccionar el
		// producto y la cantidad que se quiere comprar
		int lecturaProducto, lecturaCantidad; 

// Se instancian y cargan los productos
Producto cine1 = new Cine("En defensa propia", 50.9, 10, true, "Steven C. Miller");
Producto cine2 = new Cine("Liga de la Justicia", 45.9, 10, true, "Zack Snyder");
Producto cine3 = new Cine("Hierro 3", 60.2, 5, true, "Kim Ki Duk");
Producto cine4 = new Cine("Deep: El pulpo", 40.10, 2, true," Julio Soto Gurpide");
Producto cine5 = new Cine("Tarjeta de Navidad", 40.5, 10, true," Ernie Barbarash");
Producto cine6 = new Cine(" Un reino unido ", 50.11, 9, true,"Amma Asante");
Producto cine7 = new Cine("Aniquilación", 76.10, 10, true,"Alex Garland");
Producto cine8 = new Cine("Jumanji: En la selva", 72.11, 9, true,"Jake Kasdan");
Producto cine9 = new Cine("La forma del agua", 77.8, 10, true,"Guillermo del Toro");
Producto cine10 = new Cine("La villana ", 35.11, 0, false," Byung-gil Jung");

		// array "catalogo" para contener los productos. Su dimension
		// viene del numero de veces que se
		// instancia el contructor de Producto
		Producto catalogo[] = new Producto[Producto.getDimesionArray()];
		// objeto gestion para trabajar (mostrar y vender productos,
		// y mostrar caja)
		Gestion gestion = new Gestion();

		// Se rellena el array catalogo
		catalogo[0] = cine1;
		catalogo[1] = cine2;
		catalogo[2] = cine3;
		catalogo[3] = cine4;
                catalogo[4] = cine5;
                catalogo[5] = cine6;
                catalogo[6] = cine7;
                catalogo[7] = cine8;
                catalogo[8] = cine9;
                catalogo[9] = cine10;

    do {
        System.out.println("\n\nIntroduzca la opción que desea realizar:\n"
			+ "1. Listar Peliculas\n" + "2. Buscar Peliculas\n"
			+ "3. Agregar Pelicula\n"
			+ "SALIR --> Pulse cualquier otro numero\n");
	switch (Leer.datoInt()) {
        case 1:
            gestion.mostrarProductos(catalogo);break;
	case 2:
            System.out.println("¿Que producto desea comprar?");
            gestion.mostrarNombreProductos(catalogo);
            lecturaProducto = Leer.datoInt();
            System.out.println("¿Cuanta cantidad desea comprar?");
            lecturaCantidad = Leer.datoInt();
// Se carga el producto y la cantidad solicitada por el usuario
	gestion.comprarProducto(catalogo, lecturaProducto,lecturaCantidad);break;
	case 3:
   
	    System.out.println(gestion.mostrarCaja() + " a‚");break;
	default:
	// Se sale del programa
	continuar = false;
			}
        } while (continuar);

            System.out.println("---- Gracias por usar la aplicacion. ----");
	}
}