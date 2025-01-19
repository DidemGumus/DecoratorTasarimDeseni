class JantOlcusuDekorator extends ArabaDekorator {
    private int jantOlcusu;

    public JantOlcusuDekorator(Araba araba, int jantOlcusu) {
        super(araba);
        this.jantOlcusu = jantOlcusu;
    }
    @Override
    public String getAciklama() {
        return araba.getAciklama() + ", Jant Ölçüsü: " + jantOlcusu + " inç";
    }
    @Override
    public double getFiyat() {
        return araba.getFiyat() + 80000.0;
    }
}
