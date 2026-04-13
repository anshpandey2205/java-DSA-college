package lect23;
 // reverse the number using recursion
public class revers {

    public static int reverse(int n,int rev) {
        

        if (n == 0) {
            return rev;
        }
        
        return reverse(n/10,n%10+rev*10);

    }

    public static void main(String[] args) {
        System.out.println(reverse(12345, 0));
    }
}
