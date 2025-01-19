# Decorator Tasarım Deseni 

Projede **Decorator Tasarım Deseni** incelenmiş ve bu desen kullanılarak bir uygulama geliştirilmiştir.

## Proje Amacı

Decorator tasarım deseni, bir nesnenin davranışını dinamik olarak değiştirmek için kullanılır. Bu proje ile:

- **Decorator tasarım deseninin** nasıl çalıştığı incelenmiş,
- Java dili kullanılarak bir araç süsleme (araç özellikleri ekleme) uygulaması geliştirilmiştir.

## Uygulama Detayları

### Uygulama Amacı
Araçlara ek özellikler tanımlayarak (örneğin, klima, navigasyon sistemi, deri koltuk gibi), bir temel aracın işlevselliğini dinamik şekilde artırmak.

### Kullanılan Teknolojiler
- Java programlama dili
- IntelliJ IDEA (ya da tercih edilen bir IDE)

### Temel Yapı
- **Araba**: Temel araç sınıfı.
- **ArabaDecorator**: Yeni özellikler eklemek için kullanılan soyut sınıf.
- **Örnek Dekoratörler**:
  - **Klima**: Klima ekler.
  - **NavigasyonSistemi**: Navigasyon ekler.
  - **DeriKoltuk**: Deri koltuk ekler.

## Çalıştırma Talimatları

1. Bu projeyi bilgisayarınıza klonlayın:
   ```bash
   git clone https://github.com/kullaniciadi/projeadi.git
2. Projeyi bir Java IDE'sinde açın (ör. IntelliJ IDEA).  
3. `Main` sınıfını çalıştırarak uygulamayı test edin.  

## Projenin dosya yapısı şu şekildedir:

├── src
│   ├── Araba.java
│   ├── ArabaDecorator.java
│   ├── Klima.java
│   ├── NavigasyonSistemi.java
│   ├── DeriKoltuk.java
│   └── Main.java
└── README.md

