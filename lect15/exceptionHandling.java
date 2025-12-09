package lect15;

public class exceptionHandling {
    public static void main(String[] args) {
        System.out.println("hello");
        int a=5;
        int b=0;

        // used for exception handling by this next code will run even if there is an exception
        try {
            int c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("byeee");
    }
}
