public class Firmado extends Contrato{
    private String fecha_alta;
    private String fecha_baja;
    private String categoria_asociada; 
    private String puesto_destino;
    
    public Firmado(String numero_c, String descripcion, String fecha_alta, String fecha_baja, String categoria_asociada, String puesto_destino){
        super(numero_c, descripcion);
        this.fecha_alta=fecha_alta;
        this.fecha_baja=fecha_baja;
        this.categoria_asociada=categoria_asociada;
        this.puesto_destino=puesto_destino;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(String fecha_baja) {
        this.fecha_baja = fecha_baja;
    }

    public String getCategoria_asociada() {
        return categoria_asociada;
    }

    public void setCategoria_asociada(String categoria_asociada) {
        this.categoria_asociada = categoria_asociada;
    }

    public String getPuesto_destino() {
        return puesto_destino;
    }

    public void setPuesto_destino(String puesto_destino) {
        this.puesto_destino = puesto_destino;
    }
   
}
