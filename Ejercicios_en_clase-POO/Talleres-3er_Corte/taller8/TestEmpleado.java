public class TestEmpleado {
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Ana", 3000);
        System.out.println("Detalles del Empleado:");
        empleado.mostrarDetalles(); 


        Gerente gerente = new Gerente("Luis", 5000, "Ventas");
        System.out.println("\nDetalles del Gerente:");
        gerente.mostrarDetalles(); 
    }
}
