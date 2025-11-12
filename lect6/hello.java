package lect6;

public class hello {
    // //int a=5;    STATIC VARIABLE NOT ALLOWED HERE
    // int data=10;
    // static int b=20;
    static void sum(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        hello obj=new hello();
        obj.sum();

        sum();
       // System.out.println(a);
       // System.out.println(obj.a); 
    //    System.out.println(obj.data);
    //    System.out.println(b);
    }

    
}
