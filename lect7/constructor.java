package lect7;

class car{
    car(){             // constructor
        System.out.println("hello");
    }
    car(int a){        //  parameterized constructor
        System.out.println(a);
    }
}

class bus{
    int a;
    String name;
    bus(int a,String name){
        this.a=a;
        this.name=name;
        System.out.println("name"+" "+name);
        System.out.println("a"+" "+a);
    }
}
public class constructor {
    public static void main(String[] args) {
        car c=new car(5);
        car c1=new car();
        bus b= new bus(5, "ansh"); 
        
    }
}
