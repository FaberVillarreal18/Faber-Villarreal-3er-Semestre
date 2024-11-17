
class ClaseBase {
    public void metodoBase() {
        System.out.println("Método de ClaseBase");
    }
}

// Clase de prueba donde se intenta usar super
public class TestSuper {
    public void metodoPrueba() {
        // Intento de usar super fuera de una clase derivada
        // super.metodoBase(); // Error de compilación: "super cannot be used in this context"
    }

    public static void main(String[] args) {
        TestSuper prueba = new TestSuper();
        prueba.metodoPrueba();
    }
}

