class Perro extends Animal {
    // Intento de sobrescribir cambiando la firma del método (cambiando el tipo de retorno)
    public int hacerSonido() { // Error de compilación
        System.out.println("El perro ladra.");
        return 0; // Se devuelve un entero
    }
}