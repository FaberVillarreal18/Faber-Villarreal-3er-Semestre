public class Producto {
    private String nombre;
    private double precioBase;
    private double descuento;

    public Producto(String nombre, double precioBase, double descuento) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getDescuento() {
        return descuento;
    }
}
