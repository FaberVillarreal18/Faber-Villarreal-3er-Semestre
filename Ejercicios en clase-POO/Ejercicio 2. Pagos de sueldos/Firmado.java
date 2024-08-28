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
    public String getfecha_alta(){
        return this.fecha_alta;
    }
    public void setfecha_alta(){
        this.fecha_alta=fecha_alta;
    } 
    public String getfecha_baja(){
        return this.fecha_baja;
    }
    public void setfecha_baja(){
        this.fecha_baja=fecha_baja;
    } 
    public String getcategoria_asociada(){
        return this.categoria_asociada;
    }
    public void setcategoria_asociada(){
        this.categoria_asociada=categoria_asociada;
    } 
    public String getpuesto_destino(){
        return this.puesto_destino;
    }
    public void setpuesto_destino(){
        this.puesto_destino=puesto_destino;
    } 
}
