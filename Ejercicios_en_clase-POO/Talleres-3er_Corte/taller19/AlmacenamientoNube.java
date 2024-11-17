// Implementación del almacenamiento en la nube
import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoNube implements Almacenamiento {
    private Map<String, String> almacenamientoNube = new HashMap<>();

    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        almacenamientoNube.put(nombreArchivo, contenido);
        System.out.println("Archivo guardado en la nube: " + nombreArchivo);
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        return almacenamientoNube.getOrDefault(nombreArchivo, "Archivo no encontrado en la nube");
    }
}

