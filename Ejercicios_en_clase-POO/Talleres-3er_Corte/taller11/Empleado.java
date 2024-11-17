abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    
    public abstract double calcularSalario();

   
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + calcularSalario());
    }
}
