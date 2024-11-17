class Coche extends Vehiculo {
    public void mostrarTipoPrivado() {
        // Intento de acceder al atributo privado
        // System.out.println(tipo); // Error de compilación: "tipo has private access in Vehiculo"

        // Se puede acceder al atributo privado mediante un método público
        System.out.println("Tipo Privado: " + obtenerTipo());
    }
}
