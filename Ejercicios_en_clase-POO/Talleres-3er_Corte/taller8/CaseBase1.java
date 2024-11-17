
class ClaseBase1 {
    public void metodoBase1() {
        System.out.println("Método de ClaseBase1");
    }
}

class ClaseBase2 {
    public void metodoBase2() {
        System.out.println("Método de ClaseBase2");
    }
}


class ClaseDerivada extends ClaseBase1, ClaseBase2 { // Error: Herencia múltiple no permitida
    public void metodoDerivado() {
        System.out.println("Método de ClaseDerivada");
    }
}
