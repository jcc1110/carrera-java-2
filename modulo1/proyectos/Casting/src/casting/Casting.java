package casting;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Casting {
    public static void main(String[] args) {
        // Declarando las variables necesarias
        byte a = 12;
        Byte b = 10;
        Double c = 12.9458957;
        
        // Realizando el Casting primitivos y referenciales
        Short aC = (short)a;
        Long bC = b.longValue();
        Integer cC = c.intValue();
        
        // Formateo de decimales
        NumberFormat formatoDec = new DecimalFormat("#0.00");
        System.out.println("Formateando los decimales: " + formatoDec.format(c));
        
        // Presentando los valores
        System.out.println("El valor short es: " + aC + " - " + aC.getClass());
        System.out.println("El valor long es: " + bC + " - " + bC.getClass());
        System.out.println("El valor int es: " + cC + " - " + cC.getClass());
    }
}
