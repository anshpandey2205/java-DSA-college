package lect8;

class A{
    void SowA(){
        System.out.println("A is a base class");
    }
}
class B extends A{
    void ShowB(){
        System.out.println("B is a derived class of A");
    }
}
class C extends A{
    void showC(){
        System.out.println("C is also a derived class of A");
    }
}
class D extends A{
    void showD(){
        System.out.println("D is also a derived class of A");
    }
}
public class Heirrarical_inheri {
    public static void main(String[] args) {
        B b=new B();
        b.SowA();
        b.ShowB();

        C c=new C();
        c.SowA();
        c.showC();

        D d=new D();
        d.SowA();
        d.showD();
        
    }
}
