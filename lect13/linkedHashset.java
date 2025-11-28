package lect13;
import java.util.LinkedHashSet;

public class linkedHashset {
    public static void main(String[] args) {
        // main function of set is to store unique elements only it does not allow duplicates
        // It always maintains the insertion order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // duplicate not printed
        set.contains(10);
        System.out.println(set);
    }
}
