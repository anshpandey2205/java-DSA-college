package lect9;

class sum{
    void add(int a){
        System.out.println(a);
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        sum s=new sum();
        s.add(5,8,2);
    }
}
