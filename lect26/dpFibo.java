import java.util.Arrays;

public class dpFibo {
    static int fibo(int n,int[]dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=fibo(n-1, dp)+fibo(n-2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 3;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fibo(n, dp));
}
}
