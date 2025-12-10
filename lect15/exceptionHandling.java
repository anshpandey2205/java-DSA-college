import java.util.*;

public class exceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("hello");
        int a=sc.nextInt();
        int b=sc.nextInt();

        // used for exception handling by this next code will run even if there is an exception
        try {
            int c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            System.out.println("it always run if there is an exception or not");
        }
        System.out.println("byeee");
    }
}