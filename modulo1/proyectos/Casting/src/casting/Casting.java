package casting;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Casting {
    public static void main(String[] args) {
        // Declarando las variables necesarias
        byte a = 12;
        Byte b = 10;
        Double c = 12.954;
        
        // Realizando el Casting primitivos y referenciales
        short aC = (short)a;
        long bC = b.longValue();
        int cC = c.intValue();
        
        // Formateo de decimales
        NumberFormat formatoDec = new DecimalFormat("#0.00");
        System.out.println(formatoDec.format(c));
        
        // Presentando los valores
        System.out.println("El valor es: " + aC);
        System.out.println("El valor es: " + bC);
        System.out.println("El valor es: " + cC);
    }
}
