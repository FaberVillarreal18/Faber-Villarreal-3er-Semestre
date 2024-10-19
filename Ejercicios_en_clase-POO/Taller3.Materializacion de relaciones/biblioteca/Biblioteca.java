
import java.util.ArrayList;
import java.util.List;

class Biblioteca{
    protected List<Libros> libros = new ArrayList<>();

    public void agregar(Libros libro){
        libros.add(libro);

    }

    public void mostrarEmpleados() {
        for (Libros libro : libros) {
        System.out.println(libro.getNombre());
        }
    }


}