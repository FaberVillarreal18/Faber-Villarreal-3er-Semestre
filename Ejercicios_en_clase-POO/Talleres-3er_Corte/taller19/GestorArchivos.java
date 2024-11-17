// Clase GestorArchivos
public class GestorArchivos {
    private Almacenamiento almacenamiento;

    // Constructor que recibe un objeto que implementa la interfaz Almacenamiento
    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    // Método para guardar un archivo
    public void guardarArchivo(String nombreArchivo, String contenido) {
        almacenamiento.guardarArchivo(nombreArchivo, contenido);
    }

    // Método para recuperar un archivo
    public String recuperarArchivo(String nombreArchivo) {
        return almacenamiento.recuperarArchivo(nombreArchivo);
    }
}
