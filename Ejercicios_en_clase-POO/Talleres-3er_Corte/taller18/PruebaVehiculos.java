public class PruebaVehiculos {
    public static void main(String[] args) {
        // Crear objetos de cada tipo
        Conducible coche = new Coche();
        TransporteMercancias camion = new Camion();
        Conducible camionConductor = new CamionConductor();
        TransporteMercancias camionConductorMercancias = new CamionConductor();

        // Ejecutar las operaciones correspondientes
        coche.conducir();  // Se espera que imprima: "Conduciendo el coche."
        camion.cargarMercancias();  // Se espera que imprima: "Cargando mercancías en el camión."
        camionConductor.conducir();  // Se espera que imprima: "Conduciendo el camión."
        camionConductorMercancias.cargarMercancias();  // Se espera que imprima: "Cargando mercancías en el camión."
    }
}
