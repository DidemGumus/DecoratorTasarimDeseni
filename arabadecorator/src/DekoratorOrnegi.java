public class DekoratorOrnegi {
    public static void main(String[] args) {
        Araba araba = new TemelAraba();

        araba = new KoltukRengiDekorator(araba, "kırmızı");
        araba = new VitesDekorator(araba, "otomatik");
        araba = new SunroofDekorator(araba, "var");
        araba = new JantOlcusuDekorator(araba, 19);

        System.out.println(araba.getAciklama());
        System.out.println("Toplam Fiyat: " + araba.getFiyat() + " TL");
    }
}