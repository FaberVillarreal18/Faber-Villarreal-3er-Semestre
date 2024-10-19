class Computador{
    private Procesador procesador;

    public Computador() {
        this.procesador = new Procesador();
    }

    public void procesos(){
        procesador.Procesar();
        System.out.println("Procesador activo");
    }
    public void finalizar(){
        procesador.Apagar();
        System.out.println("precesador desactivado");
    }


}