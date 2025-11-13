package lect8;

class bus{
   public bus(){
    this(5);
        System.out.println("hello");
    }
    public bus(int a){
        this(6, 7);
        System.out.println(a);
    }
     public bus(int a,int b){
        System.out.println(a+b);
    }
}
public class callMultiCons {
    public static void main(String[] args) {
        bus c1=new bus();
    }
}
