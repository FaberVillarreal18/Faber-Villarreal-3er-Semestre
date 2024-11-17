
public class TestEmpleado {
    public static void main(String[] args) {
      
        Persona persona = new Persona("Carlos", 30);
        System.out.println("Detalles de la Persona:");
        persona.mostrarDetalles(); 

        
        Empleado empleado = new Empleado("Ana", 28, "Recursos Humanos");
        System.out.println("\nDetalles del Empleado:");
        empleado.mostrarDetalles(); 
    }
}
