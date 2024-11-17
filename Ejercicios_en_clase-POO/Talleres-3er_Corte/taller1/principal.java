
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese los datos del estudiante:");
        System.out.print("Edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Curso: ");
        String curso = entrada.nextLine();
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        Estudiante estudiante = new Estudiante(curso, edad, nombre);

        System.out.println("\nIngrese los datos de la cuenta bancaria:");
        System.out.print("Número de cuenta: ");
        String n_cuenta = entrada.nextLine();
        System.out.print("Tipo de cuenta: ");
        String tipo = entrada.nextLine();
        System.out.print("Saldo: ");
        double saldo = entrada.nextDouble();
        entrada.nextLine();
        CuentaBancaria cuentaBancaria = new CuentaBancaria(n_cuenta, saldo, tipo);

        System.out.println("\nIngrese los datos del libro:");
        System.out.print("Autor: ");
        String autor = entrada.nextLine();
        System.out.print("Número de páginas: ");
        int n_paginas = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Título: ");
        String titulo = entrada.nextLine();
        Libro libro = new Libro(autor, n_paginas, titulo);

        System.out.println("\nDatos ingresados:");
        System.out.println(estudiante.toString());
        System.out.println(cuentaBancaria.toString());
        System.out.println(libro.toString());

        entrada.close();
    }
}
