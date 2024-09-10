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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }
}