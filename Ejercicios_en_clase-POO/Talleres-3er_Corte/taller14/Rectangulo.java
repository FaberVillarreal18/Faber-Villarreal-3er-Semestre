public class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void calcularArea() {
        double area = ancho * alto;
        System.out.println("Área del rectángulo: " + area);
    }
}

