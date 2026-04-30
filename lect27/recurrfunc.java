import java.util.*;
public class recurrfunc {
    public static int Minstep(int n,int[]dp){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        dp[n]=Minstep(n-1, dp)+Minstep(n-2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n=4;
        int []dp=new int[n+1];
        System.out.println(Minstep(n, dp));
 
    }
}
