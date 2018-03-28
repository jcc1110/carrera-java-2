package claseabstracta;

public class Rectangulo extends FiguraGeometrica {

    @Override
    public double calcularArea(double base, double altura) {
        double resultado = (base * altura) / 2;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo");
    }
}
