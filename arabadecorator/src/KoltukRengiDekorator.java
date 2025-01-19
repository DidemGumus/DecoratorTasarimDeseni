class KoltukRengiDekorator extends ArabaDekorator {
    private String renk;

    public KoltukRengiDekorator(Araba araba, String renk) {
        super(araba);
        this.renk = renk;
    }
    @Override
    public String getAciklama() {
        return araba.getAciklama() + "Koltuk Rengi: " + renk;
    }
    @Override
    public double getFiyat() {
        return araba.getFiyat() + 50000.0;
    }
}