public class PersistenciaLibro {
    public void guardar(Libro libro) {
        // Lógica para guardar el libro en una base de datos o archivo
        System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido guardado.");
    }

    public Libro cargar(String titulo) {
        // Lógica para cargar el libro desde la base de datos o archivo
        // Simulación de carga de libro:
        return new Libro(titulo, "Autor Desconocido", 2020);
    }
}

