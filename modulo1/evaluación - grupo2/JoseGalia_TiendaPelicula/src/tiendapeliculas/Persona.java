package tiendapeliculas;

public class Persona {
//atributos 
    public String nombre; 
    public String apellido; 
    public int cumpleaños;     
    //constructor #01 
    public Persona () {}
    //constructor #02 
    public Persona (String firstname, String lastname, int birthdate){ 
        this.nombre = firstname; 
        this.apellido= lastname; 
        this.cumpleaños= birthdate; 
    }

//metodos 
public String obtenerNombreCompleto(boolean mayus, boolean minus){
String cadena = this.nombre+" "+ this.apellido;
if(mayus==true) {
cadena=cadena.toUpperCase();
}
else if (minus == true)
{
cadena = cadena.toLowerCase(); 
}
return cadena; 
}

public String obtenerNombreCompleto () 

{return this.apellido+", " + this.nombre;}

public int obtenerEdad()

{return 2018 - this.cumpleaños; }

}






