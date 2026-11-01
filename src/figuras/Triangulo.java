package figuras;

public class Triangulo implements Figura {

    private double altura;
    private double base;

    public Triangulo() {}

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return (this.base*this.altura)/2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public String toString() {
        return "A área do triângulo é: " + calcularArea();
    }
}
