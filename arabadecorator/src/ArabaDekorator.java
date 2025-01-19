abstract class ArabaDekorator implements Araba {
    protected Araba araba;

    public ArabaDekorator(Araba araba) {
        this.araba = araba;
    }
    @Override
    public String getAciklama() {
        return araba.getAciklama();
    }
    @Override
    public double getFiyat() {
        return araba.getFiyat();
    }
}