public class Prueba2 {
    public static void main(String[] args) {
        Coche coche1=new Coche();
        coche1.marca="audi";
        coche1.modelo="r8 etron v10";
        coche1.velocidadMaxima="329km/h";

        //error de compilacion: las propiedades tienen un modificador de acceso de tipo privado
    }
}
