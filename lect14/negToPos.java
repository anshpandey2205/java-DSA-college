import java.util.ArrayList;
import java.util.ListIterator;
// replace any negative number with its positive counterpart
public class negToPos {
    public static void main(String[] args) {
         ArrayList<Integer> list=new ArrayList<>();
        list.add(-1);
        list.add(4);
        list.add(-7);
        list.add(8);
        ListIterator<Integer> it =list.listIterator();
        while(it.hasNext()){
            Integer x=it.next();
            if(x<0){
                it.set(-x);
            }
        }
        System.out.println(list);
    }
}
