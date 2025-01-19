class SunroofDekorator extends ArabaDekorator {
    private String mevcut;

    public SunroofDekorator(Araba araba,String mevcut) {
        super(araba);
        this.mevcut =mevcut;
    }
    @Override
    public String getAciklama() {
        return araba.getAciklama() + ", Sunroof:"+mevcut;
    }
    @Override
    public double getFiyat() {
        return araba.getFiyat() + 150000.0;
    }
}
