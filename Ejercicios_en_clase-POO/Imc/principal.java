import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Usuario user=new Usuario();
        Imc imc=new Imc();
        System.out.println("Ingresa tu nombre");
        user.nombre=entrada.next();
        System.out.println("Ingresa tu apellido");
        user.apellido=entrada.next();
        System.out.println("Ingresa tu documento");
        user.cc=entrada.nextInt();
        System.out.println("Ingresa tu genero");
        user.genero=entrada.next();

        System.out.println("Ingresa tu peso(KG)");
        imc.peso=entrada.nextDouble();
        System.out.println("Ingresa tu estatura(M)");
        imc.altura=entrada.nextDouble();
        double op= imc.peso/Math.pow(imc.altura,2);
        System.out.println("su indice de masa corporal es: "+op);
        if (op<16) {
            System.out.println("delgadez severa");
        } else {
            if (op>16 && op<=17) {
                System.out.println("delgadez moderada");
            } else {
                if (op>17 && op<=18.5) {
                    System.out.println("delgadez leve");
                } else {
                    if (op>18.5 && op<=25) {
                        System.out.println("peso normal");
                    } else {
                        if (op>25 && op<=30) {
                            System.out.println("sobrepeso");
                        } else {
                            if (op>30 && op<=35) {
                                System.out.println("obesidad leve");
                            } else {
                                if (op>35 && op<40) {
                                    System.out.println("obesidad moderada");
                                } else {
                                    if (op<=40) {
                                        System.out.println("obesidad morbida");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            entrada.close();
        }
    }
}
