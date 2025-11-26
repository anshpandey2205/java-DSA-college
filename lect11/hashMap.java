package lect11;
import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5,6}; // frequency of elements
        // HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(1,10);  // set key and value
        // map.put(2,20);
        // System.out.println(map.get(3)); // get value of key 3
        // System.out.println(map.getOrDefault(3, null));
        // System.out.println(map.containsKey(3)); // check if key 3 is present
    //     for(int x:map.keySet()){  // give map all keys
    //         System.out.println(x+" "+map.get(x));
    // }

                 // FREQUENCY COUNT 

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int x:arr){
        //     map.put(x, map.getOrDefault(x, 0)+1);
        // }
        // System.out.println(map);

                 // FIRST NON REPEATING CHARACTER

        // String str="anshu";
        // HashMap<Character, Integer> map = new HashMap<>();
        // for(char ch:str.toCharArray()){
        //     map.put(ch, map.getOrDefault(ch, 0)+1);
        // }
        // System.out.println(map);
        // for(char ch:str.toCharArray()){
        //     if(map.get(ch)==1){
        //         System.out.println(ch);
        //         break;
        //     }
        // }

        // PRINT INDEX NO. WHOSE SUM ID 9 IN ARRAY
        int arr[]={1,2,3,4,5,6};
        int sum=9;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = sum - arr[i];
            if(map.containsKey(complement)){
                System.out.println("Index found: " + map.get(complement) + " and " + i);
                break;
            }
            map.put(arr[i], i);
        }




 }
}