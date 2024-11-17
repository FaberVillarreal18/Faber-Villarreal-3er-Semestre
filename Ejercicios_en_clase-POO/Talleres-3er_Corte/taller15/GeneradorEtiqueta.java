public class GeneradorEtiqueta {
    public void generarEtiqueta(Producto producto, CalculadoraPrecio calculadora) {
        double precioFinal = calculadora.calcularPrecioConDescuento(producto);
        System.out.println("Etiqueta del Producto:");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio Final: " + precioFinal);
    }
}

