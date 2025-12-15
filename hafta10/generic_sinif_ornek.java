package hafta10;

public class generic_sinif_ornek {
    public static void main(String[] args) {
        generic_sinif <Integer> jenerik = new generic_sinif<>(5);
        System.out.println(jenerik.getObj());

        generic_sinif <String> jeneriks = new generic_sinif<>("jenerik sınıf");
        System.out.println(jeneriks.getObj());

        generic_sinif <Float> jenerikf = new generic_sinif<>(3.14f);
        System.out.println(jeneriks.getObj());


        GenericCokParametreli<Integer,String> jenerikCokParametreli =
                new GenericCokParametreli<Integer,String>(45,"Ali");
        jenerikCokParametreli.yaz();

        GenericCokParametreli<String,Boolean> jenerikCokParametreli2 =
                new GenericCokParametreli<String,Boolean>("Ali",true);
        jenerikCokParametreli2.yaz();



    }



}
