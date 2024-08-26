public class Estudiante extends Usuario{
    private String carrera;

    public Estudiante(String nombre, String ID, boolean carnet, String tipo, String carrera){
        super(nombre, ID, carnet);
        this.carrera= carrera;
    }
    public static void mostrar(){
        //op del metodo
    }
}
