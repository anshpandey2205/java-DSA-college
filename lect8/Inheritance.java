package lect8;

class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("bark..");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog a=new Dog();
        a.bark();
        a.eat();
    }
}
