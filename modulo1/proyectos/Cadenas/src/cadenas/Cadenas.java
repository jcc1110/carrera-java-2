package cadenas;

public class Cadenas {
    public static void main(String[] args) {
        // Declarando mis variable de tipo String
        String cadena;
        cadena = "Hola";
        cadena += " ";
        cadena += "mundo";
        
        // Presento la información
        System.out.println(cadena);
        System.out.println(cadena.length());
        System.out.println(cadena.getClass());
        System.out.println(cadena.isEmpty());
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        System.out.println("");
        
        // Usando StringBuilder
        StringBuilder sb1 = new StringBuilder();
        // Concatenar las cadenas de caracteres
        sb1.append("Hola").append(" ").append("mundo");
        // Agregando cadenas
        sb1.insert(0, "¡");
        sb1.insert(sb1.length(), "!");
        // Presento la información
        System.out.println("StringBuilder:");
        System.out.println(sb1);
        System.out.println("");
        
        // Usando StringBuffer
        StringBuffer sb2 = new StringBuffer();
        // Concatenar las cadenas de caracteres
        sb2.append("Hola");
        sb2.append(" ");
        sb2.append("mundo");
        // Agregando cadenas
        sb2.insert(sb2.length(), "!");
        // Presento la información
        System.out.println("StringBuffer:");
        System.out.println(sb2);
    }
}
