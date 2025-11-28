    // SORTING BY NAME
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class student{
    int rno;
    String name;

    public student(int rno, String name){
        this.rno=rno;
        this.name=name;
    }
    public String toString(){
        return rno+" "+name;
    }

}
class nameSorted implements Comparator<student>{
    public int compare(student s1, student s2){
        return s1.name.compareTo(s2.name);
    }
}
    
public class hello2 {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        list.add(new student(1, "anshu"));
        list.add(new student(3, "rahul"));
        list.add(new student(2, "sachin"));
        Collections.sort(list,new nameSorted());
        for(student s:list){
            System.out.println(s.rno+" "+s.name);
        }
        
    }
}
