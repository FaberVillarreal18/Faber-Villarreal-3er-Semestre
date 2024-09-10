public class principal {
    public static void main(String[] args) {
        Empleado empleado1=new Empleado(null, null, null, null, null, null, null);
        empleado1.setDNI("1234456");
        empleado1.setNombre("Faber");
        empleado1.setApellidos("Villarreal");
        empleado1.setTelefono("3214871235");
        empleado1.setDireccion("mz h lot 48");
        empleado1.setCargo("Ingeniero");
        empleado1.setNum_cuenta("12445568");

        System.out.println("DNI: "+empleado1.getDNI());
        System.out.println("Nombre: "+empleado1.getNombre());
        System.out.println("Apellido: "+empleado1.getApellidos());
        System.out.println("Telefono: "+empleado1.getTelefono());
        System.out.println("Direccion: "+empleado1.getDireccion());
        System.out.println("Cargo: "+empleado1.getCargo());
        System.out.println("N. de cuenta: "+empleado1.getNum_cuenta());
    }
}
