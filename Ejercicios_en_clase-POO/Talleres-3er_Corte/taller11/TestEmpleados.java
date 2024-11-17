public class TestEmpleados {
    public static void main(String[] args) {
       
        Empleado gerente = new Gerente("Carlos", 5000, 2000);
        gerente.mostrarDetalles(); 

       
        Empleado vendedor = new Vendedor("Ana", 3000, 500);
        vendedor.mostrarDetalles(); 
    }
}

