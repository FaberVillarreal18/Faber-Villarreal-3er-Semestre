public class Empleado {
    private String DNI;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String cargo;
    private String num_cuenta;

    public Empleado(String DNI, String nombre, String apellidos, String telefono, String direccion, String cargo, String num_cuenta ){
        this.nombre=nombre;
        this.DNI=DNI;
        this.apellidos=apellidos;
        this.nombre= nombre;
        this.telefono=telefono;
        this.direccion=direccion;
        this.cargo=cargo;
        this.num_cuenta=num_cuenta;
    }
    public String getDNI(){
        return this.DNI;
    }
    public void setDNI(){
        this.DNI=DNI;
    }
    public String getnombre(){
        return this.nombre;
    }
    public void setnombre(){
        this.nombre=nombre;
    }
    public String getapellidos(){
        return this.apellidos;
    }
    public void setapellidos(){
        this.apellidos=apellidos;
    }
    public String gettelefono(){
        return this.telefono;
    }
    public void settelefono(){
        this.telefono=telefono;
    }
    public String getdireccion(){
        return this.direccion;
    }
    public void direccion(){
        this.direccion=direccion;
    }
    public String getcargo(){
        return this.cargo;
    }
    public void setcargo(){
        this.cargo=cargo;
    }
    public String getnum_cuenta(){
        return this.num_cuenta;
    }
    public void setnum_cuenta(){
        this.num_cuenta=num_cuenta;
    }
}