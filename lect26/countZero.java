import java.util.*;
public class countZero {
    public static int countzeros(int n,int []dp) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = countzeros(n / 10, dp) + (n % 10 == 0 ? 1 : 0);
        return dp[n];
    }
    public static void main(String[] args) {
        int []dp = new int[100];
        Arrays.fill(dp, -1);
        System.out.println(countzeros(102030, dp));
    }
}
