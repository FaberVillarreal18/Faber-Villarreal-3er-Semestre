public class PruebaFigura {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 3);
        Figura triangulo = new Triangulo(4, 6);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}
