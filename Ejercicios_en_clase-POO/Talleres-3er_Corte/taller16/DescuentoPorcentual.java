public class DescuentoPorcentual extends Descuento {
    private double porcentaje;  // El porcentaje de descuento

    public DescuentoPorcentual(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {
        return precioOriginal - (precioOriginal * porcentaje / 100);
    }
}
