public class PruebaSistemaFiguras {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(5);  // Crear un círculo con radio 5
        Figura figura2 = new Rectangulo(4, 6);  // Crear un rectángulo con largo 4 y ancho 6

        System.out.println("Área del círculo: " + figura1.calcularArea());  // Calculamos área del círculo
        System.out.println("Área del rectángulo: " + figura2.calcularArea());  // Calculamos área del rectángulo
    }
}

