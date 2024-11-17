public class CalculadoraPrecio {
    public double calcularPrecioConDescuento(Producto producto) {
        return producto.getPrecioBase() - (producto.getPrecioBase() * producto.getDescuento() / 100);
    }
}

