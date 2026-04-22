package lect25;
// sub array sum using recursion

public class subArraySum {
        static void subArraySum(int[] arr, int i, int sum) {
            if(i == arr.length) {
                System.out.println(sum);
                return;
            }
            // include
            subArraySum(arr, i + 1, sum + arr[i]);
            // exclude
            subArraySum(arr, i + 1, sum);
        }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subArraySum(arr, 0, 0);
    }
}
