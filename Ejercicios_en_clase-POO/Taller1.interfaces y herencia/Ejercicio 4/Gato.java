class Gato extends Animal{
    public Gato(){
        super.Sonido = "Miau";
    }
    @Override
    public void hacerSonido(){
        super.hacerSonido();
        System.out.println("El gato maulla");
    }
}
