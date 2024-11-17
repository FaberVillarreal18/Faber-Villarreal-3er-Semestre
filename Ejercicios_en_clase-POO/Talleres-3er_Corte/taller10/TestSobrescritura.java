public class TestSobrescritura {
    public static void main(String[] args) {
        Animal animal = new Perro();
        animal.hacerSonido(); // Este código no se ejecutará debido al error de compilación
    }
}