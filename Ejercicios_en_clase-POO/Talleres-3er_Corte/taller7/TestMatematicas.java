
public class TestMatematicas {
    public static void main(String[] args) {
       
        double a = 12;
        double b = 4;

       
        System.out.println("Suma de " + a + " y " + b + ": " + Matematicas.sumar(a, b));

        
        System.out.println("Resta de " + a + " y " + b + ": " + Matematicas.restar(a, b));

        
        System.out.println("Multiplicación de " + a + " y " + b + ": " + Matematicas.multiplicar(a, b));

      
        System.out.println("División de " + a + " y " + b + ": " + Matematicas.dividir(a, b));

      
        System.out.println("División de " + a + " y 0: " + Matematicas.dividir(a, 0));
    }
}
