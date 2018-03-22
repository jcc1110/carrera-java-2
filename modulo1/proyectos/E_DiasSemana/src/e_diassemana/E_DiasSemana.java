package e_diassemana;

public class E_DiasSemana {
    public static void main(String[] args) {
        // Declarando variable entera para almacenar el número del día
        int dia;
        
        // Creando una instancia de la clase Scanner
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        // Creando una estructura iterativa "do-while"
        do {
            System.out.print("Introduzca el número de un día de la semana: ");        
            dia = scan.nextInt();        
        } while(dia < 1 || dia > 7);        
        
        // Creando una estructura de control "Switch"
        switch (dia) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miércoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sábado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("No es ningún dia");
                break;
        }
    }
}
