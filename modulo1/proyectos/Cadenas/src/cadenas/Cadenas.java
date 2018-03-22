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
        
        // Usando StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        // Concatenar las cadenas de caracteres
        stringBuilder.append("Hola").append(" ").append("mundo");
        // Agregando cadenas
        stringBuilder.insert(0, "¡");
        stringBuilder.insert(stringBuilder.length(), "!");
        // Presento la información
        System.out.println(stringBuilder);
        
        // Usando StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        // Concatenar las cadenas de caracteres
        stringBuffer.append("Hola");
        stringBuffer.append(" ");
        stringBuffer.append("mundo");
        // Agregando cadenas
        stringBuffer.insert(stringBuffer.length(), "!");
        // Presento la información
        System.out.println(stringBuffer);
    }
}
