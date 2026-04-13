package lect23;

public class evenSum {
    static int EvenSum(int[] arr, int i) {
        if(i==arr.length){
            return 0;
        }
        if(arr[i]%2==0){
            return arr[i]+EvenSum(arr,i+1);
        }
        return EvenSum(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(EvenSum(arr, 0));
    }
}
