
class ClaseBase {
    private String atributoPrivado = "Atributo Privado";

   
    public String obtenerAtributoPrivado() {
        return atributoPrivado;
    }
}


class ClaseDerivada extends ClaseBase {
    public void mostrarAtributoPrivado() {
        // Error: no se puede acceder al atributo privado de la clase base
        // System.out.println(atributoPrivado); // Esta línea generará un error

        // Se puede acceder al atributo privado mediante un método público de la clase base
        System.out.println("Atributo Privado: " + obtenerAtributoPrivado());
    }
}
