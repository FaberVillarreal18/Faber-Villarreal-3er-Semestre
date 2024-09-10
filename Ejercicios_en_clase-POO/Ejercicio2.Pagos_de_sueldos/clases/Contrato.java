public class Contrato{
    private String numero_c;
    private String descripcion;

    public Contrato(String numero_c, String descripcion){
        this.numero_c=numero_c;
        this.descripcion=descripcion; 
    }

    public String getNumero_c() {
        return numero_c;
    }

    public void setNumero_c(String numero_c) {
        this.numero_c = numero_c;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }   
    
}
