public class PruebaLibro {
    public static void main(String[] args) {
        // Crear un libro
        Libro libro = new Libro("Java para Principiantes", "Juan Pérez", 2023);

        // Usar ReporteLibro para generar un reporte
        ReporteLibro reporteLibro = new ReporteLibro();
        reporteLibro.generarReporte(libro);

        // Usar PersistenciaLibro para guardar el libro
        PersistenciaLibro persistencia = new PersistenciaLibro();
        persistencia.guardar(libro);

        // Cargar un libro
        Libro libroCargado = persistencia.cargar("Java para Principiantes");
        reporteLibro.generarReporte(libroCargado);
    }
}
