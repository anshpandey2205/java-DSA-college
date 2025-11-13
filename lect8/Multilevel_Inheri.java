package lect8;

class animal{
    void eat(){
        System.out.println("eat..");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("bark..");
    }
}
class BabyDog extends dog{
    void sleep(){
        System.out.println("weep..");
    }
}
public class Multilevel_Inheri {
    public static void main(String[] args) {
        BabyDog d=new BabyDog();
        d.sleep();
        d.bark();
        d.eat();
    }  
}