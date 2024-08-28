public class Contrato{
    private String numero_c;
    private String descripcion;

    public Contrato(String numero_c, String descripcion){
        this.numero_c=numero_c;
        this.descripcion=descripcion; 
    }   
    public String getnumero_c(){
        return this.numero_c;
    }
    public void setnumero_c(){
        this.numero_c=numero_c;
    } 
    public String getdescripcion(){
        return this.descripcion;
    }
    public void setdescripcion(){
        this.descripcion=descripcion;
    }
}
