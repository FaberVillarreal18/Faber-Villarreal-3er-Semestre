class Animal{
    protected String comer;
    protected String beber;
    protected String sobrevivir;
    protected String aparear;
    public Animal() {
    }
    public Animal(String comer, String beber, String sobrevivir, String aparear) {
        this.comer = comer;
        this.beber = beber;
        this.sobrevivir = sobrevivir;
        this.aparear = aparear;
    }
    public String getComer() {
        return comer;
    }
    public void setComer(String comer) {
        this.comer = comer;
    }
    public String getBeber() {
        return beber;
    }
    public void setBeber(String beber) {
        this.beber = beber;
    }
    public String getSobrevivir() {
        return sobrevivir;
    }
    public void setSobrevivir(String sobrevivir) {
        this.sobrevivir = sobrevivir;
    }
    public String getAparear() {
        return aparear;
    }
    public void setAparear(String aparear) {
        this.aparear = aparear;
    }
}