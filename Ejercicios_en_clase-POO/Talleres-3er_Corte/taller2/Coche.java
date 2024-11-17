
import java.util.Scanner;

public class Coche {
    private String marca;
    private String modelo;
    private String velocidadMaxima;

    
    public Coche() {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }


    public void setVelocidadMaxima(String velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }


    public static void acelerar(){
        Scanner entrada=new Scanner(System.in);
        double i;
        System.out.println("ingresa el indice de aceleracion");
        i=entrada.nextDouble();
        for (double j = i; j < 0; j++) {
            System.out.println("acelerando...");
            System.out.println(j);
        }
        entrada.close();
    }
}
