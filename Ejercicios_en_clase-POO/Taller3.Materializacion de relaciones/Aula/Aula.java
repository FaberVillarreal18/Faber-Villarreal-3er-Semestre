class Aula{
    private Estudiantes estudianteAdelante;
    private Estudiantes estudiantesAtras;
    public Aula() {
    }
    public Aula(Estudiantes estudianteAdelante, Estudiantes estudiantesAtras) {
        this.estudianteAdelante = estudianteAdelante;
        this.estudiantesAtras = estudiantesAtras;
    }

    public void clase(){
        estudianteAdelante.Hablar();
        estudiantesAtras.Hablar();
        System.out.println("estudiantes hablando");
    }
}