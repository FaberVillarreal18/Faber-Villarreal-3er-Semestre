
public class TestUtilidades {
    public static void main(String[] args) {
      
        double a = 10;
        double b = 5;

     
        System.out.println("Suma de " + a + " y " + b + ": " + Utilidades.sumar(a, b));


        System.out.println("Resta de " + a + " y " + b + ": " + Utilidades.restar(a, b));

        System.out.println("Multiplicación de " + a + " y " + b + ": " + Utilidades.multiplicar(a, b));

  
        System.out.println("División de " + a + " y " + b + ": " + Utilidades.dividir(a, b));

        System.out.println("División de " + a + " y 0: " + Utilidades.dividir(a, 0));
    }
}
