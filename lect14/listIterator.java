import java.util.ArrayList;
import java.util.ListIterator;

public class listIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        ListIterator<Integer> it =list.listIterator();
        // while(it.hasNext()){
        //     Integer x=it.next();
        //     System.out.println(x);
        // }
        //System.out.println("reverse");
        // while(it.hasPrevious()){
        //     Integer y=it.previous();
        //     System.out.println(y);
        // }
        // while(it.hasNext()){
        //     Integer x=it.next();
        //     if(x==7){
        //         it.set(10);
        //     }
        // }
        while(it.hasNext()){
            Integer x=it.next();
            if(x%2!=0){
                it.set(-1);
            }
        }
        System.out.println(list);
    }
}
