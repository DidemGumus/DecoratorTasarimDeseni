class VitesDekorator extends ArabaDekorator {
    private String vitesTuru;

    public VitesDekorator(Araba araba, String vitesTuru) {
        super(araba);
        this.vitesTuru = vitesTuru;
    }
    @Override
    public String getAciklama() {
        return araba.getAciklama() + ", Vites Türü: " + vitesTuru;
    }
    @Override
    public double getFiyat() {
        return araba.getFiyat() + 100000.0;
    }
}
