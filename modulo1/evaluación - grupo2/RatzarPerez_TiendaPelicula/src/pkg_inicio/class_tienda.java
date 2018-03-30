/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_inicio;

import java.util.ArrayList;
import java.util.Iterator;
import pkg_Interfaces.interfaz_tienda;

/**
 *
 * @author Ratzar
 */

//implementa la interfaz tienda
public class class_tienda implements interfaz_tienda{
//    class_pelicula p = new class_pelicula();
    ArrayList<class_pelicula> arraypelicula = new ArrayList();
    /**
     *
     */
    
    
    //clase constructor
    public class_tienda() {
          String inventarioInicialVideos[] = {"Hombres de Honor", "Cuestion de Honor"
                                              ,"WhiPlash","Perfume de Mujer"
                                              ,"Hacker","Job"
                                              ,"El Libertador","Sucre"
                                              ,"Tiburon Parte 1","Tiburon Parte 2"
                                             };
          for (int i = 0; i < 10; i++) {
            
            class_pelicula auxiliar = new class_pelicula();
            auxiliar.setVarPeliculaCodigo(i);
            auxiliar.setVarPeliculaNombre(inventarioInicialVideos[i]);
            auxiliar.setVarPeliculaStock(i*5);
            boolean add = arraypelicula.add(auxiliar);
        }
       
    }

    @Override
    public void pelicula_menu() {
        System.out.println("\t╔══════════════════════════════════════════════╗\n"
                +"\t║\t Tienda de Videos R&Z,C.A.                                        ║\n"
                +"\t║\t Dirección: Zona Industrial de Valencia Edo. Carabobo.            ║\n"
                +"\t║\t Contacto: videosRZ@rz.com | 0241-556631                          ║\n"
                +"\t╠══════════════════════════════════════════════╣\n"
                +"\t║\t                                                                  ║\n"
                +"\t║\t                     MENU PRINCIPAL                               ║\n"
                +"\t║\t                                                                  ║\n"
                +"\t║\t 1) Mostrar listado de videos disponibles                         ║\n"
                +"\t║\t 2) Buscar videos por código                                      ║\n"
                +"\t║\t 3) Agregar nuevo video al inventario                             ║\n"
                +"\t║\t 4) Modificar datos de un video                                   ║\n"
                +"\t║\t 5) Eliminar video del inventario                                 ║\n"
                +"\t║\t 0) Salir del sistema                                             ║\n"
                +"\t║\t                                                                  ║\n"
                +"\t╚══════════════════════════════════════════════╝\n"
        );
    }
    
    @Override 
    public void pelicula_listar() {
//        int size = arraypelicula.size();
//        System.out.println("tamaño array " + size);
//        for (int i = 0; i < size; i++) {
//            System.out.println(" valor array ["+i+"]"+arraypelicula.get(i).getVarPeliculaCodigo());
//        }
        Iterator <class_pelicula> it=arraypelicula.iterator();
        System.out.println("\t\t CODIGO |  STOCK  |           NOMBRE PELICULA ");
        System.out.println("\t\t ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
            while(it.hasNext())
            {
//                System.out.println(it.next().getVarPeliculaCodigo());
                class_pelicula auxiliar2 = new class_pelicula();
                auxiliar2 = it.next();
//                System.out.println("CODIGO | STOCK \t | NOMBRE PELICULA \n "
                 System.out.println("\t\t   "+auxiliar2.getVarPeliculaCodigo()
                        +"\t   "+auxiliar2.getVarPeliculaStock()
                        +"\t   "+auxiliar2.getVarPeliculaNombre()
                        );
//                System.out.println("Stock : "+ auxiliar2.getVarPeliculaStock());
//                System.out.println("Stock : "+ auxiliar2.getVarPeliculaNombre());
               System.out.println("\t\t ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
            }
    }

    @Override
    public void pelicula_buscar() {
        System.out.println("OPCION EN CONSTRUCCION....");
        
    }

    @Override
    public void pelicula_agregar() {
        System.out.println("OPCION EN CONSTRUCCION....");
        
//        for (int i = 0; i < 10; i++) {
//            
//            class_pelicula auxiliar = new class_pelicula();
//            auxiliar.setVarPeliculaCodigo(i);
//            auxiliar.setVarPeliculaStock(i*10);
//            boolean add = arraypelicula.add(auxiliar);
//        }
//       
        
    }

    @Override
    public void pelicula_modificar() {
        System.out.println("OPCION EN CONSTRUCCION....");
    }

    @Override
    public void pelicula_eliminar() {
        System.out.println("OPCION EN CONSTRUCCION....");
    }

   
    
}
