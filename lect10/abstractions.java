package lect10;

abstract class Animal {
     abstract void eat();
     void data(){
         System.out.println("hii");
     }
}
class cat extends Animal {
    void eat(){
        System.out.println("biryani");
    }
}
public class abstractions {
    public static void main(String[] args) {
        cat c1=new cat();
        c1.eat();
        c1.data();
       // Animal a1=new Animal(); // Abstract class ka object nahi bna skte
    }
}
