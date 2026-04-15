package lect24;
// Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
public class fibona {
     static int fib(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
     }
    
    public static void main(String[] args) {
        int n = 10;
        for(int i=0;i<n;i++) {
            System.out.print(fib(i) + " ");
        }
}
}
