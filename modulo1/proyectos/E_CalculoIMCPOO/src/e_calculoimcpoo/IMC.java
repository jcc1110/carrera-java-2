package e_calculoimcpoo;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class IMC {
    // Atributos
    public double peso;
    public double altura;
    public double imc;
    public String estado;
    
    // Método para aplicar la fórmula
    public void calcular() {
        this.imc = this.peso / (this.altura * this.altura);
    }
    
    // Método para revisar el estado según IMC
    public void revisarEstado() {
        // Llamo a los métodos internos de la clase
        this.calcular();
        
        // Valido la condición actual del usuario
        if (this.imc < 18.5) {
            this.estado = "Bajo peso";
        } else if (this.imc >= 18.5 && this.imc <= 24.9) {
            this.estado = "Peso normal";
        } else if (this.imc >= 25.5 && this.imc <= 29.9) {
            this.estado = "Sobrepeso";
        } else if (this.imc >= 30.0 && this.imc <= 34.5) {
            this.estado = "Obesidad grado I";
        } else if (this.imc >= 35.0 && this.imc <= 39.9) {
            this.estado = "Obesidad grado II";
        } else if (this.imc >= 40.0) {
            this.estado = "Obesidad grado III";
        }
    }
    
    // Método para mensaje final
    public void diagnostico() {
        // Llamo a los métodos internos de la clase
        this.calcular();
        this.revisarEstado();
        
        // Imprimo el resultado
        NumberFormat f = new DecimalFormat("#0.0");
        System.out.println("Tu valor IMC es: " + f.format(this.imc) + " y tu estado es " + this.estado);
    }
}
