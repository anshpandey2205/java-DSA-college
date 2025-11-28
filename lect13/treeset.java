package lect13;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        // TreeSet stores elements in a sorted order and does not allow duplicates
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(5);
        tset.add(1);
        tset.add(3);
        tset.add(2);
        tset.add(4);
        System.out.println(tset); // Output will be in sorted order: [1, 2, 3, 4, 5]
    }
}
