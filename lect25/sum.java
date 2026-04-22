package lect25;

public class sum {
    public static void subArraySum(int[]arr,int i,int sum){
        if(i==arr.length){
            System.out.println(sum);
            return;
        }
        // include
        subArraySum(arr, i+1, sum+arr[i]);
        // exclude
        subArraySum(arr, i+1, sum);

    }
    public static void main(String[] args) {
        int[]arr={1,2,3};
        subArraySum(arr, 0, 0);
        
    }
}