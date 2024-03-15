
package javsejerciciospooyuml;

public class PruebaFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(3, 7);
        Cuadrado cuadrado = new Cuadrado(4);
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(3, 4);
        Rombo rombo = new Rombo(3,5,2);
        Trapecio trapecio = new Trapecio(5, 4, 3, 3, 2);

        System.out.println("El area del círculo es: " + circulo.calcularArea());
        System.out.println("El perímetro del círculo es: " + circulo.calcularPerimetro());

        System.out.println("El area del rectángulo es: " + rectangulo.calcularArea());
        System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());

        System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());
        System.out.println("El perímetro del cuadrado es: " + cuadrado.calcularPerimetro());

        System.out.println("El area del triángulo rectángulo es: " + trianguloRectangulo.calcularArea());
        System.out.println("El perímetro del triángulo rectángulo es: " + trianguloRectangulo.calcularPerimetro());
        trianguloRectangulo.determinarTipoTriangulo();
        
        System.out.println("El area del rombo es: " + rombo.calcularArea());
        System.out.println("El perímetro rombo es: " + rombo.calcularPerimetro());
        
        System.out.println("El area del trapecio es: " + trapecio.calcularArea());
        System.out.println("El perímetro trapecio es: " + trapecio.calcularPerimetro());
    }
    
    
}
