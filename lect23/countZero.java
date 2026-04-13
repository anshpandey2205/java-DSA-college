package lect23;
// easy method or code to count the number of zero in a number

public class countZero {
    public static int countzero(int n) {
        if (n == 0) {
            return 0;
        }
        int count =(n%10==0)?1:0;
        return count + countzero(n / 10);
    }




    public static void main(String[] args) {
        System.out.println(countzero(1002003));
    }
}
