public class PruebaProducto {
    public static void main(String[] args) {
        // Crear un producto
        Producto producto = new Producto("Camiseta", 20.0, 15.0);

        // Crear instancias de CalculadoraPrecio y GeneradorEtiqueta
        CalculadoraPrecio calculadora = new CalculadoraPrecio();
        GeneradorEtiqueta generadorEtiqueta = new GeneradorEtiqueta();

        // Generar la etiqueta
        generadorEtiqueta.generarEtiqueta(producto, calculadora);
    }
}

