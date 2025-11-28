package lect13;

import java.util.HashSet;

public class containDupli {
    public static void main(String[] args) {
        // main function of set is to store unique elements only it does not allow duplicates
        int arr[]={1,2,3};
        HashSet<Integer> set = new HashSet<>();
        for(int x:arr){
            set.add(x);
        }
        if(set.size()<arr.length){
            System.out.println("Contains Duplicates");
    }else{
        System.out.println("No Duplicates"+" "+set);
    }
}
}
