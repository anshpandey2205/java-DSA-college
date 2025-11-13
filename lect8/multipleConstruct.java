package lect8;

class car{
    car(){
        System.out.println("hello");
    }
    car(int a){
        System.out.println(a);
    }
     car(int a,int b){
        System.out.println(a+b);
    }
}

public class multipleConstruct {
    public static void main(String[] args) {
        car c1=new car();
        car c2=new car(10);
        car c3=new car(5,6);
    }
}
