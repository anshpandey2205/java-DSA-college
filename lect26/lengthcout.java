import java.util.Arrays;

public class lengthcout {
    // string length using recursion
    public static int countLength(String str, int []dp) {
        if (str.length() == 0) {
            return 0;
        }
        if (dp[str.length()] != -1) {
            return dp[str.length()];
        }
        dp[str.length()] = countLength(str.substring(1), dp) + 1;
        return dp[str.length()];
    }
        
        
    public static void main(String[] args) {
        int []dp = new int[100];
        Arrays.fill(dp, -1);
        System.out.println(countLength("Hello World!", dp)); 
    }
}
