package lect23;

public class countOccur {
    static int count(int[]arr,int i,int key){
        if(i==arr.length){
            return 0;
        }
        if(arr[i]==key){
            return 1+count(arr, i+1, key);
        }
        return count(arr, i+1, key);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,1,2,3,4,5};
        int i=0;
        int key=1;
        System.out.println(count(arr,i,key));
        
    }
}
