/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgevezgapeliculas;

import java.util.Scanner;

/**
 *
 * @author SISTEMAS
 */
public class Jorgevezgapeliculas {

    /**
     * @param args the command line arguments
     */

       
        static Scanner teclado;
 
static String cedulaverificacion;
static String[] estadocliente= new String[10];
 
static int posicionclienteencontrado;
 
 
static String []alquiler= new String [10];
 
// info clientes
 
static String cedulacliente[]=new String[10];
static String nombrecliente[]=new String[10];
static String direccioncliente[]=new String[10];
static String celcliente[]= new String [10];
static String email[]= new String [10];
 
//peliculas 
static String  peliculas[]= {"needfor sped","el origen","avatar","batman","interestelar",
					"la maldicion","la torre oscura","rapidos y furiosos","el orfanato","el señor de los anillos"};
 
// alquilar peliculas
static  String cargapeliculas[]=new String [10];
static String cantidadP[]=new String [10];
 
 
static int contadorcliente=0;
 
 
 
 
 
 
 
 
public static void main(String[] args) {
 
	System.out.println("Bienvenidos a"+"\n"+
					"\n La tienda de Alquiler “La gran película”"+"\n");
 
 
	teclado= new Scanner(System.in);
	int opcion;
	do{
		System.out.println("Digite una opcion "+
				"\n 1- Registro de usuario"+
				"\n 2- Alquiler"+
				"\n 3- devolucion"+
				"\n 4- salir"+"\n."+"\n.");
 
		opcion=teclado.nextInt();
 
		switch (opcion){
 
			case 1:
				registroUsuario();
				break;
			case 2:
					alquiler();
				break;
			case 3:
				devulucion();
				break;
 
			default:
				break;
		}
	}while (opcion!=4);
	System.out.println("Gracias por utilizar nuetro programa"+
						"\n Feliz Dia ");
 
}
 
static void registroUsuario(){
 
 
	System.out.println("Ingrese la cedula");
	cedulacliente[contadorcliente]=teclado.next();
 
	System.out.println("Ingrese nombre");
	nombrecliente[contadorcliente]=teclado.next();
 
	System.out.println("Ingrese direccion");
	direccioncliente[contadorcliente]=teclado.next();
 
	System.out.println("Ingrese celular");
	celcliente[contadorcliente]=teclado.next();
 
	System.out.println("Ingrese email");
	email[contadorcliente]=teclado.next();
 
	confirmacliente();
 
}
 
static void alquiler(){
	System.out.println("Ingrese la cedula del cliente");
	cedulaverificacion=teclado.next();
 
 
//        cedulaverificacion=JOptionPane.showInputDialog("Ingrese la cedula del cliente");
	existecliente(cedulaverificacion);
 
 
	buscarcliente(cedulaverificacion);
 
	// peliculas();
 
}
static void devulucion(){
 
}
 
 
//-------------------------------------------------------------------------------//
 
 
 
public static void confirmacliente()
{
	System.out.println("confirmar cliente si o no ");
	estadocliente[contadorcliente]=teclado.next();
 
 
	if(estadocliente[contadorcliente].equals("si"))
	{
		System.out.println("usuario creado exitosamente");
 
		contadorcliente++;
	}
	else
	{
		System.out.println("usuario cancelado");
 
	}
}
 
public static void buscarcliente(String cedulaverificacion)
{
	boolean existe=existecliente(cedulaverificacion);
	if(existe)
	{
		System.out.println(
 
			nombrecliente[posicionclienteencontrado]+"\n.");
;
			peliculas();
			System.out.println("\n.");
			pedirpelicula();
			System.out.println("\n.");
 
	}
	else
	{
		System.out.println("El cliente ingresado no se encuentra datos erroneos");
	}
}
public static boolean existecliente(String cedulaverificacion)
{
	boolean existe=false;
	int cont=0;
	posicionclienteencontrado=-1;
	while(!existe&&cont<contadorcliente)
	{
		if(cedulacliente[cont].equals(cedulaverificacion)){
		existe=true;
		posicionclienteencontrado=cont;
		}
		cont++;
	}
	return existe;
}
 
public static void peliculas(){
 
	System.out.println("Estas son las peliculas que tenemos disponibles "+"\n.");
 
	System.out.println("1- "+peliculas[0]+
		"\n 2- "+peliculas[1]+
		"\n 3- "+peliculas[2]+
		"\n 4- "+peliculas[3]+
		"\n 5- "+peliculas[4]+
		"\n 6- "+peliculas[5]+
		"\n 7- "+peliculas[6]+
		"\n 8- "+peliculas[7]+
		"\n 9- "+peliculas[8]+
		"\n 10- "+peliculas[9]+"\n");
 
}
 
public static void pedirpelicula(){
	int opcion  = 0;
	String confirmar;
 
 
	do{
		System.out.println("ingrese el numero de la pelicula que quiere alquilar"+
                             "\n Digite 0 para terminar");
 
        opcion=teclado.nextInt();
 
        switch (opcion){
            case 1:
                System.out.println(peliculas[0]);
 
            break;
            case 2:
                System.out.println(peliculas[1]);
            break;
            case 3:
                System.out.println(peliculas[2]);
            break;
            case 4:
                System.out.println(peliculas[3]);
            break;
            case 5:
                System.out.println(peliculas[4]);
            break;
            case 6:
                System.out.println(peliculas[5]);
            break;
            case 7:
                System.out.println(peliculas[6]);
            break;
            case 8:
                System.out.println(peliculas[7]);
            break;
            case 9:
                System.out.println(peliculas[8]);
            break;
            case 10:
                System.out.println(peliculas[9]);
            break;
        }
 
        System.out.println("confirmar si o no"+"\n.");
		confirmar=teclado.next();
		if (confirmar.equals("si")){
			System.out.println("\n."+"\n"+"pelicula alquilada satisfactoriamente"+"\n.");
		}else{
			System.out.println("\n."+"pelicula cancelada");
		}
 
    }while((opcion!=0));
 
    }
}
        // TODO code application logic here
    

