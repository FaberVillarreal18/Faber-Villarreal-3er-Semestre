public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("Área del círculo: " + area);
    }
}

