package javsejerciciospooyuml;

public class Trapecio {
    int baseMayor; // Atributo que define la base mayor de un trapecio
    int baseMenor; // Atributo que define la base menor de un trapecio
    int altura; // Atributo que define la altura de un trapecio
    int lado1; // Atributo que define un lado del trapecio
    int lado2; // Atributo que define otro lado del trapecio

    // Constructor de la clase Trapecio
    public Trapecio(int baseMayor, int baseMenor, int altura, int lado1, int lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Método que calcula el área de un trapecio
    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2.0;
    }

    // Método que calcula el perímetro de un trapecio
    public double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }    
}
