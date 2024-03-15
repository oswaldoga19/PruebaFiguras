
package javsejerciciospooyuml;

public class TrianguloRectangulo {
    private int base;    // Atributo que define la base de un triángulo rectángulo
    private int altura;  // Atributo que define la altura de un triángulo rectángulo

    // Constructor de la clase TriánguloRectángulo
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método que calcula y devuelve el área de un triángulo rectángulo como la base multiplicada por la altura sobre 2
    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    // Método que calcula y devuelve el perímetro de un triángulo rectángulo como la suma de la base, la altura y la hipotenusa
    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    // Método que calcula y devuelve la hipotenusa de un triángulo rectángulo utilizando el teorema de Pitágoras
    private double calcularHipotenusa() {
        return Math.pow(Math.pow(base, 2) + Math.pow(altura, 2), 0.5);
    }

    // Método que determina el tipo de triángulo
    public void determinarTipoTriangulo() {
        if (base == altura && base == calcularHipotenusa()) {
            System.out.println("Es un triángulo equilátero.");
        } else if (base != altura && base != calcularHipotenusa() && altura != calcularHipotenusa()) {
            System.out.println("Es un triángulo escaleno.");
        } else {
            System.out.println("Es un triángulo isósceles.");
        }
    }
    
}
