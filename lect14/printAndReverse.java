import java.util.ArrayList;
import java.util.ListIterator;
public class printAndReverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int mid=arr.length/2;
         ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        ListIterator<Integer> it =list.listIterator();
        while(it.hasNext()){
            Integer x=it.next();
            System.out.println(x);
            if(x==mid){
                break;
            }
        }
        while(it.hasPrevious()){
            Integer y=it.previous();
            System.out.println(y);
        }
    }
}
