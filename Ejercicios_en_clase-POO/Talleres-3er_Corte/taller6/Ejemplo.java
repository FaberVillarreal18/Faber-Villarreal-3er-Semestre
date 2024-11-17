
public class Ejemplo {
  
    private String mensaje = "Hola desde la clase Ejemplo";

 
    public static void mostrarMensaje() {
        System.out.println(this.mensaje); 
    }

    public static void main(String[] args) {
        mostrarMensaje(); 
    }
}
