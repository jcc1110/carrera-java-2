/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercajero;

/**
 *
 * @author Jorge
 */
class auxi {

    public static boolean isNum(String a){//metodo para validar si es un numero        
 
        try{
            int b = Integer.parseInt(a);
            return true;//si se puede convertir a numero devuelve verdadero
        }
        catch(NumberFormatException e){
            return false;//si no se puede convertir a numero devuelve falso
        }        
    }
 
}