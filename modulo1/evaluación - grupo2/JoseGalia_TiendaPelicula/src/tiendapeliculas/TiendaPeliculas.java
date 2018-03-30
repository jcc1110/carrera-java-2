
package tiendapeliculas;
import java.util.Scanner;
import java.util.ArrayList; 


/**
 *
 * @author User
 */
public class TiendaPeliculas {

    public static void main(String[] args) {
           
        
        Scanner teclado=new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Ingrese primer valor:");
        num1=teclado.nextInt();
        System.out.print("Ingrese segundo valor:");
        num2=teclado.nextInt();
        System.out.print("Ingrese tercer valor:");
        num3=teclado.nextInt();
        if (num1>num2 && num1>num3) {
            System.out.print(num1);
        } else {
            if (num2>num3) {
            	System.out.print(num2);
            }else {
            	System.out.print(num3);
            }
        }
        System.out.println("");
        
        
        int f;
        for(f=1;f<=100;f++) {
            System.out.print(f);
            System.out.print("-");
        }
    





//variables necesarias 
        String mayus; 
        boolean esMayus; 
        
        
      //instancio la clase Persona 
      Persona p1 = new Persona (); 
      Persona p2 = new Persona("Tienda", "Peliculas", 1668); 
      Scanner scan = new Scanner(System.in); 
      
      //Presento los Datos 
        System.out.println(p2.nombre);
        System.out.println(p2.apellido);
        System.out.println(p2.cumpleaños);
        System.out.println(p2.obtenerNombreCompleto());
        System.out.println(p2.obtenerEdad());
        System.out.println("");
        
        //pregunto los datos 
        System.out.println("Indique su nombre: ");
        p1.nombre = scan.next(); 
        System.out.println("indique su apellido: ");
        p1.apellido = scan.next () ; 
        System.out.println("indique el año de su cumpleaños: ");
        p1.cumpleaños = scan.nextInt(); 
        System.out.println("¿Quieres su nombre en mayuscula? (S/N): ");
        mayus = scan.next(); 
        
        //valido la opcion 
        esMayus = ("s".equals(mayus)); 
        /*if ("S".equals(mayus)){
            esMayus = true; 
        }
        else { 
            esMayus = false; 
        } 
        */
        System.out.println("Tu nombre completo es: "+ p1.obtenerNombreCompleto(esMayus,false));
        System.out.println("Tu edad es: "+p1.obtenerEdad());    
      
        
         String Cadena; 
           Cadena = "Tus ";
           Cadena += " "; 
           Cadena += "peliculas";
           
           //presento la informaciòn 
           System.out.println(Cadena);
           System.out.println(Cadena.length());
           System.out.println(Cadena.getClass());
           System.out.println(Cadena.isEmpty());
           System.out.println(Cadena.toUpperCase());
           System.out.println(Cadena.toLowerCase());
           System.out.println("");
           
           //Usando StringBuilder 
           StringBuilder sb1 = new StringBuilder(); 
           //Concatenar las cadenas de caracteres 
           sb1.append("Escoja").append("Peliculas");
           //agragando Cadenas 
           sb1.insert(0,"!");
           sb1.insert(sb1.length(),"!");
           //presento la informacion 
           System.out.println("StringBuilder: ");
           System.out.println(sb1);
           System.out.println("");
           
        String [] nombres ={"Rapido y furioso", "HarryPotter", "Un dia mas", "BonDia", "up", "Coco", "monday", "quepasoayer", };
         String[ ] nombre = new String[10];

             nombre[0] = "Rapido y furioso";

             nombre[1] = "HarryPotter";

             nombre[2] = "Un dia mas";

             nombre[3] = "BonDia";

             nombre[4] = "Coco";
             
             nombre[5] = "monday";

             nombre[6] = "quepasoayer";

             nombre[7] = "quepasoayer 2 ";
             
             nombre[8] = "quepasoayer 3";
             
             nombre[9] = "ToyStory";
             

//////////////////////////
        
        
                                                  
        
        System.out.println("");
        
        
        ///////***********///////////
        
        
        //instancia mi clase Arraylist 
        ArrayList<String> arreglo = new ArrayList <>();
        
        //Agrego un elemento al arreglo 
        arreglo.add("Rapido y furioso 1");
        arreglo.add("HarryPotter");
        arreglo.add("BonDia ");
        arreglo.add("Coco ");
        arreglo.add("monday ");
        arreglo.add("quepasoayer ");
        arreglo.add("quepasoayer 2 ");
        arreglo.add("quepasoayer 3 ");
        arreglo.add("ToyStory ");
        
        
        //mostrando los valores 
        System.out.println("La cantidad de las peliculas son 9: "+ arreglo.size());
        System.out.println(""+ arreglo.get(0));
        System.out.println(""+ arreglo.get(1));
        System.out.println(""+ arreglo.get(2));
        System.out.println(""+ arreglo.get(3));
        System.out.println(""+ arreglo.get(4));
        System.out.println(""+ arreglo.get(5));
        System.out.println(""+ arreglo.get(6));
        System.out.println(""+ arreglo.get(7));
        System.out.println(""+ arreglo.get(8));
        System.out.println(""+ arreglo.get(9));
        System.out.println("");
        
        //mostrando el arreglo completo 
        System.out.println(arreglo);
        
        
        

    }
    }
               


    


    

