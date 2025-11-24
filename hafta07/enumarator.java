package hafta07;

import java.awt.*;

enum Gunler{  //sınıf gibi tanımlanır, başına enum yazılır, değişkenler genelde büyük harfle yazılır
    PAZARTESI, //indis 0
    SALI, //1
    ÇARŞAMBA, //2
    PERŞEMBE,
    CUMA,
    CUMARTESİ,
    PAZAR //6
}


enum Takip{
    SİPARİŞ_HAZIRLANIYOR,
    KARGOYA_VERİLDİ,
    KARGODA,
    MÜŞTERİYE_ULAŞTI,
    İADE_SÜRECİNDE
}

public class enumarator {
    public static void main(String[] args) {
        Gunler g = Gunler.PAZARTESI;
        System.out.println(g);
        System.out.println(g.compareTo(Gunler.PERŞEMBE));
        System.out.println(Gunler.PAZAR.compareTo(Gunler.ÇARŞAMBA));
        System.out.println(g.ordinal());
        System.out.println(Gunler.PAZAR.ordinal());


        Color renk = Color.GREEN;
    }
}
