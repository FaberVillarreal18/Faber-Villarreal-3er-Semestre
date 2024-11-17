public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        persona.presentarse();      // Llama al método presentarse de Persona
        estudiante.presentarse();   // Llama al método presentarse de Estudiante
        profesor.presentarse();     // Llama al método presentarse de Profesor
    }
}
