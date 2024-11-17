public class PruebaFigura {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(3.5);
        Figura figura2 = new Rectangulo(4, 5);

        figura1.calcularArea(); // Llama al método calcularArea de Circulo
        figura2.calcularArea(); // Llama al método calcularArea de Rectangulo
    }
}

