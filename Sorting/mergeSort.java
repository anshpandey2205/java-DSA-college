package Sorting;

import java.util.ArrayList;

public class mergeSort {
    static void Mergesort(int arr[],int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            Mergesort(arr, mid+1, right);
            Mergesort(arr, left, mid);
            Merge(arr, left, mid, right);

        }
    }
    public static void Merge(int arr[],int left,int mid,int right){
        ArrayList<Integer>temp=new ArrayList<>();
        int i=left;
        int j=mid+1;

        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                temp.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<=right){
            temp.add(arr[j]);
            j++;
        }
        for(int k=left;k<=right;k++){
            arr[k]=temp.get(k-left);
        }   
    }
    

    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 2, 1};
        Mergesort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
