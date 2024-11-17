public class PruebaAlmacenamiento {
    public static void main(String[] args) {
        // Crear instancias de los servicios de almacenamiento
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        Almacenamiento almacenamientoNube = new AlmacenamientoNube();

        // Crear gestores de archivos con diferentes servicios de almacenamiento
        GestorArchivos gestorLocal = new GestorArchivos(almacenamientoLocal);
        GestorArchivos gestorNube = new GestorArchivos(almacenamientoNube);

        // Guardar y recuperar archivos en el almacenamiento local
        gestorLocal.guardarArchivo("documento1.txt", "Contenido del documento local");
        System.out.println(gestorLocal.recuperarArchivo("documento1.txt")); // Debería mostrar el contenido del archivo

        // Guardar y recuperar archivos en el almacenamiento en la nube
        gestorNube.guardarArchivo("documento2.txt", "Contenido del documento en la nube");
        System.out.println(gestorNube.recuperarArchivo("documento2.txt")); // Debería mostrar el contenido del archivo
    }
}
