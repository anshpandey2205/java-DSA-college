package lect9;

class Animal{
    void eat(){
        System.out.println("pizza");
    }
}
class dog extends Animal{
    void eat(){
        System.out.println("Roti");
    }
}
public class methodOverRiding {
    public static void main(String[] args) {
        Animal a=new dog();
        a.eat();
    }
}
