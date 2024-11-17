// Clase de prueba para demostrar el uso del sistema de reportes
public class PruebaReportes {
    public static void main(String[] args) {
        // Crear objetos de los generadores de reporte
        GeneradorReporte reportePDF = new ReportePDF();
        GeneradorReporte reporteExcel = new ReporteExcel();

        // Crear objetos del GestorReportes con diferentes generadores
        GestorReportes gestorPDF = new GestorReportes(reportePDF);
        GestorReportes gestorExcel = new GestorReportes(reporteExcel);

        // Generar reportes
        gestorPDF.generar();  // Generará un reporte en formato PDF
        gestorExcel.generar();  // Generará un reporte en formato Excel
    }
}
