class Coche extends Vehiculo {
    @Override
    public void conducir() {
        System.out.println("El coche está siendo conducido.");
    }

    
    @Override
    public void mostrarTipo() { 
        System.out.println("Este es un coche.");
    }
}