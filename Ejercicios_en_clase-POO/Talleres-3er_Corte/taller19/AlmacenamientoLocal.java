// Implementación del almacenamiento local
import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoLocal implements Almacenamiento {
    private Map<String, String> almacenamientoLocal = new HashMap<>();

    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        almacenamientoLocal.put(nombreArchivo, contenido);
        System.out.println("Archivo guardado localmente: " + nombreArchivo);
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        return almacenamientoLocal.getOrDefault(nombreArchivo, "Archivo no encontrado");
    }
}

