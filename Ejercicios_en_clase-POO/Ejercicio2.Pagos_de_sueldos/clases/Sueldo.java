public class Sueldo {
    private String descripcion;
    private double cantidad;

    public Sueldo(String descripcion, double cantidad){
        this.descripcion=descripcion;
        this.cantidad=cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
}
