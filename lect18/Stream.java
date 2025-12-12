package lect18;
import java.util.*;

public class Stream {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        List<Integer> res=list.stream().filter(n->n>60).toList();// Filter elements greater than 60
        List<Integer> Mapres=list.stream().map(n->n*2).toList();// Double each element
        int data=list.stream().reduce(0,(a,b)->a+b);// Sum of all elements 
        System.out.println(res);
        System.out.println(Mapres);
        System.out.println(data);

    }
}
