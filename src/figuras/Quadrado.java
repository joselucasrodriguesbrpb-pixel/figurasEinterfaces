package figuras;

public class Quadrado implements Figura {
    private double lado;

    public Quadrado() {}

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado*this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return this.lado;
    }

    @Override
    public String toString() {
        return "A área do quadrado é: " + calcularArea();
    }
}
