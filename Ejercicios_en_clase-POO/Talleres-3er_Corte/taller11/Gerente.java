class Gerente extends Empleado {
    private double bonificacion;


    public Gerente(String nombre, double salarioBase, double bonificacion) {
        super(nombre, salarioBase); 
        this.bonificacion = bonificacion;
    }

    
    @Override
    public double calcularSalario() {
        return salarioBase + bonificacion; 
    }
}
