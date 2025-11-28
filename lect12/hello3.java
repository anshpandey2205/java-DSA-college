
public class hello3 {
    static void fun(int a){
        if(a>0){
            fun(--a);
            System.out.println(a);
            fun(--a);
        }
    }
    public static void main(String[] args) {
        fun(4);
    }
}
