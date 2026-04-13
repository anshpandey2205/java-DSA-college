package lect23;

public class found {
    static boolean foundkey(int []arr, int i,int key){
        if(i==arr.length){
            return false;
        }
        if(arr[i]==key){
            return true;
        }
        return foundkey(arr,i+1,key);

    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int i=0;
        int key=1;
        System.out.println(foundkey(arr,i,key));
        
    }
}
