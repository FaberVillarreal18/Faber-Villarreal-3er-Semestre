public class PruebaSistemaTransporte {
    public static void main(String[] args) {
        // Crear una referencia de tipo Transporte y asignarle una Bicicleta
        Transporte transporte1 = new Bicicleta();
        transporte1.mover();  // Se espera que imprima: "La bicicleta se mueve pedaleando."

        // Crear una referencia de tipo Transporte y asignarle un Coche
        Transporte transporte2 = new Coche();
        transporte2.mover();  // Se espera que imprima: "El coche se mueve conduciendo."
    }
}
