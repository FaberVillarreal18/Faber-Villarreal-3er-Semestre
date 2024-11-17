// Clase GestorReportes
public class GestorReportes {
    private GeneradorReporte generadorReporte;

    // Constructor que recibe una instancia de GeneradorReporte
    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    // Método para generar el reporte
    public void generar() {
        generadorReporte.generarReporte();
    }
}
