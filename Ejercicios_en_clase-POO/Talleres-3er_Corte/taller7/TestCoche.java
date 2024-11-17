
public class TestCoche {
    public static void main(String[] args) {
      
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Civic");
        Coche coche3 = new Coche("Ford", "Focus");

   
        coche1.mostrarDetalles();
        coche2.mostrarDetalles();
        coche3.mostrarDetalles();

       
        System.out.println("Número total de coches creados: " + Coche.getContadorCoches());
    }
}

