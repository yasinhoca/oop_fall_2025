package hafta10;

public class test_generic_ogrenci {
    public static void main(String[] args) {
        GenericOgrenci<Ogrenci> jenerikOgrenci = new GenericOgrenci<>
                (new Ogrenci(45,"Ali","Alkan","aa@gmail.com"));







        System.out.println(jenerikOgrenci.o.ad);
        System.out.println(jenerikOgrenci.o.soyad);
        System.out.println(jenerikOgrenci.o.numara);
        System.out.println(jenerikOgrenci.o.email);

    }
}
