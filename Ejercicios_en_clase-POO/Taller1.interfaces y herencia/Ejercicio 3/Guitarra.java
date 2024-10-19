public class Guitarra extends Instrumento implements Afinable{
    @Override
    public void afinar(){
        System.out.println("Afinando");
    }
    public void tocar(){
        System.out.println("Tocando");
    }
    
}
