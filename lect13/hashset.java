package lect13;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        // main function of set is to store unique elements only it does not allow duplicates
        // int arr[]={1,2,3,2};
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // duplicate not printed
        set.contains(10);
        System.out.println(set);
    }
}
