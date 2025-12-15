package hafta10;

public class GenericCokParametreli <T,U>{
    T obj1;
    U obj2;


    //constructer
    GenericCokParametreli(T obj1, U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void yaz(){
        System.out.println(this.obj1);
        System.out.println(this.obj2);
    }

    public T getObj1(T obj1){
        return this.obj1;
    }

    public U getObj2(U obj2){
        return this.obj2;
    }

}
