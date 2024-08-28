public class Sueldo {
    private String descripcion;
    private double cantidad;

    public Sueldo(String descripcion, double catidad){
        this.descripcion=descripcion;
        this.cantidad=cantidad;
    }
    public String getdescripcion(){
        return this.descripcion;
    }
    public void setdescripcion(){
        this.descripcion=descripcion;
    } 
    public double getcantidad(){
        return this.cantidad;
    }
    public void setcantidad(){
        this.cantidad=cantidad;
    } 
}
