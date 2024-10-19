public class perro extends Animal{
    protected String ladrar;
    protected String correr;
    protected String aullar;

    public perro() {
      
    }

    public perro(String aullar, String correr, String ladrar, String comer, String beber, String sobrevivir, String aparear) {
        super(comer, beber, sobrevivir, aparear);
        this.aullar = aullar;
        this.correr = correr;
        this.ladrar = ladrar;
    }

    public String getLadrar() {
        return ladrar;
    }

    public void setLadrar(String ladrar) {
        this.ladrar = ladrar;
    }

    public String getCorrer() {
        return correr;
    }

    public void setCorrer(String correr) {
        this.correr = correr;
    }

    public String getAullar() {
        return aullar;
    }

    public void setAullar(String aullar) {
        this.aullar = aullar;
    }

}
