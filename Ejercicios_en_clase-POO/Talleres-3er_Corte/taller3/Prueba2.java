public class Prueba2 {
    public static void main(String[] args) {
        Moto moto = new Moto("Deportiva");
        moto.mostrarTipo(); // Error de compilación: no se puede acceder a `mostrarTipo` desde otro paquete
    }
}
