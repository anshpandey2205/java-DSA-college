import java.util.ArrayList;
import java.util.ListIterator;

public class Add {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        ListIterator<Integer> it =list.listIterator();
        // while(it.hasNext()){
        //     Integer x=it.next();
        //     if(x==7){
        //         it.add(12);
        //     }
        // }
        while(it.hasPrevious()){
            int x=it.previous();
            if(x==7){
                it.add(12);
            }
        }
        System.out.println(list);
    }
}
