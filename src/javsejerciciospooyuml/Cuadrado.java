
package javsejerciciospooyuml;


public class Cuadrado {
    
    private int lado; // Atributo que define el lado de un cuadrado

    // Constructor de la clase Cuadrado
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    // Método que calcula y devuelve el área de un cuadrado como el lado elevado al cuadrado
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    // Método que calcula y devuelve el perímetro de un cuadrado como cuatro veces su lado
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
