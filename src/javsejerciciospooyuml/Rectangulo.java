
package javsejerciciospooyuml;

public class Rectangulo {
    private int base;    // Atributo que define la base de un rectángulo
    private int altura;  // Atributo que define la altura de un rectángulo

    // Constructor de la clase Rectángulo
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método que calcula y devuelve el área de un rectángulo como la multiplicación de la base por la altura
    public double calcularArea() {
        return base * altura;
    }

    // Método que calcula y devuelve el perímetro de un rectángulo como (2 * base) + (2 * altura)
    public double calcularPerimetro() {
        return 2 * base + 2 * altura;
    }
}
