package lect23;

public class replce {
    public static void replace(int []arr,int i,int key,int newkey){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            arr[i]=newkey;
        }
        replace(arr, i+1, key, newkey);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,1,2,3,4,5};
        int i=0;
        int key=1;
        int newkey=100;
        replace(arr,i,key,newkey);
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
