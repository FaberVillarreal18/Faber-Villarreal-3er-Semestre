package pruebas;

import vehiculos.Moto;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Moto moto = new Moto("Deportiva", "Yamaha", 600);
        moto.mostrarInformacion();

        // Intentar acceder a los miembros protegidos (esto causará un error)
        // System.out.println("Tipo: " + moto.tipo); // Error de compilación
        // System.out.println("Marca: " + moto.marca); // Error de compilación
    }
}

