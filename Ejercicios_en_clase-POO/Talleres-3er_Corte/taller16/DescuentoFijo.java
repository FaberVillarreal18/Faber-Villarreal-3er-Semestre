public class DescuentoFijo extends Descuento {
    private double descuentoFijo;  // El monto fijo de descuento

    public DescuentoFijo(double descuentoFijo) {
        this.descuentoFijo = descuentoFijo;
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {
        return precioOriginal - descuentoFijo;
    }
}

