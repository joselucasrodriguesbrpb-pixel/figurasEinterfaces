package figuras;

import java.util.ArrayList;

public class CalculadoraDeAreas {

    public static void main(String[] args) {
        ArrayList <Figura> figuras = new ArrayList< >();
        figuras.add(new Quadrado(2));
        figuras.add(new Triangulo(3, 2));
        figuras.add(new Triangulo(6, 4));
        figuras.add(new Quadrado(4));
        double areaTotal = 0.0;
        for (Figura f: figuras){
            System.out.println(f.calcularArea());
            areaTotal += f.calcularArea();
        }
        System.out.printf("Área total: %.1f\n", areaTotal);
    }

}