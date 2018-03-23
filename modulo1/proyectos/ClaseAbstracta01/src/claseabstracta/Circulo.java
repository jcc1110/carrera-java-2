package claseabstracta;

public class Circulo extends FiguraGeometrica {

    @Override
    public double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo");
    }
}
