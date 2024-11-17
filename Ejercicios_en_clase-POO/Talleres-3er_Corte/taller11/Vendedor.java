
class Vendedor extends Empleado {
    private double comision;

    
    public Vendedor(String nombre, double salarioBase, double comision) {
        super(nombre, salarioBase); 
    }

  
    @Override
    public double calcularSalario() {
        return salarioBase + comision; 
    }
}
