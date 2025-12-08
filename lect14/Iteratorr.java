import java.util.ArrayList;
import java.util.Iterator;

                          // ITERATOR
                          
public class Iteratorr {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            Integer x= it.next();
            if(x==6){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
