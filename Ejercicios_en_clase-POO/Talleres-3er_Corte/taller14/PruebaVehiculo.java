public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Coche();
        Vehiculo vehiculo2 = new Bicicleta();

        vehiculo1.mover(); // Llama al método mover de Coche
        vehiculo2.mover(); // Llama al método mover de Bicicleta
    }
}

