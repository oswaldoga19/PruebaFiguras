
package javsejerciciospooyuml;

public class Rombo {
    int dgonalMayor; // Atributo que define la diagonal mayor de un rombo
    int dgonalMenor; // Atributo que define la diagonal menor de un rombo
    int lado; // Atributo que define la longitud de un lado de un rombo

    // Constructor de la clase Rombo
    public Rombo(int dgonalMayor, int dgonalMenor, int lado) {
        this.dgonalMayor = dgonalMayor;
        this.dgonalMenor = dgonalMenor;
        this.lado = lado;
    }

    // Método que calcula y devuelve el área de un rombo
    public double calcularArea() {
        return (dgonalMayor * dgonalMenor) / 2.0;
    }

    // Método que calcula y devuelve el perímetro de un rombo
    public double calcularPerimetro() {
        return 4 * lado;
    }   
}
