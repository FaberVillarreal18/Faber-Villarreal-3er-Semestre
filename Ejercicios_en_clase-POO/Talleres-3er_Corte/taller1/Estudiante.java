public class Estudiante {
    protected String nombre;
    protected String curso;
    protected int edad;

    public Estudiante() {
        this.curso = null;
        this.edad = 0;
        this.nombre = null;
    }

    public Estudiante(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public Estudiante(String curso, int edad, String nombre){
        this(edad, nombre);
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", curso=" + curso + ", edad=" + edad + "]";
    }
}
