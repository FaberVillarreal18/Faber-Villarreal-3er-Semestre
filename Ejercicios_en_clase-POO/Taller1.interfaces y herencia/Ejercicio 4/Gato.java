class Gato extends Animal2{

    public Gato(String sonido) {
        super(sonido);
    }

    
    @Override
    public void hacerSonido(){
        super.hacerSonido();
        System.out.println("El gato maulla");
    }
}
