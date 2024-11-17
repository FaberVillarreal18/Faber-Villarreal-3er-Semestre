public class PruebaSistemaDescuentos {
    public static void main(String[] args) {
        double precioOriginal = 100.0;  // Precio original del producto

        // Aplicar descuento porcentual (15%)
        Descuento descuentoPorcentual = new DescuentoPorcentual(15);
        double precioConDescuentoPorcentual = descuentoPorcentual.aplicarDescuento(precioOriginal);
        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Descuento porcentual: 15%");
        System.out.println("Precio con descuento: " + precioConDescuentoPorcentual);

        // Aplicar descuento fijo (20 unidades)
        Descuento descuentoFijo = new DescuentoFijo(20);
        double precioConDescuentoFijo = descuentoFijo.aplicarDescuento(precioOriginal);
        System.out.println("\nPrecio original: " + precioOriginal);
        System.out.println("Descuento fijo: 20");
        System.out.println("Precio con descuento fijo: " + precioConDescuentoFijo);
    }
}

