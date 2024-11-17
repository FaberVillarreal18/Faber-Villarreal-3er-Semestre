public class Prueba1 {
    public static void main(String[] args) {
        Estudiante estudiante=new Estudiante("Javier", 19, 4.5);

        System.out.println(estudiante.getNombre());
        System.out.println(estudiante.getEdad());
        System.out.println(estudiante.getNotaPromedio());
    }
}
