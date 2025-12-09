import java.util.ArrayList;
import java.util.ListIterator;

public class target {
    public static void main(String[] args) {
         ArrayList<Integer> list=new ArrayList<>();
         int target=14;
        list.add(20);
        list.add(10);
        list.add(5);
        list.add(14);
        list.add(3);
        list.add(10);
        ListIterator<Integer> it =list.listIterator();
        while(it.hasNext()){
            Integer x=it.next();
            if(x==target){
                break;
            }
        }
        while(it.hasPrevious()){
            Integer y=it.previous();
            if(y<target){
            it.remove();
         }//else{
        //          System.out.println(y);
        //     }
        }
        System.out.println(list);
    }
}
