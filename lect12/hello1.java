       // SORTING BY ROLLNUMBER 

import java.util.ArrayList;
import java.util.Collections;

class student implements Comparable<student>{
    int rno;
    String name;

    public student(int rno, String name){
        this.rno=rno;
        this.name=name;
    }
    public int compareTo(student s){
        return this.rno - s.rno;
    }
    public String toString(){
        return this.rno+" "+this.name;
    }
}
public class hello1 {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        list.add(new student(1, "anshu"));
        list.add(new student(3, "rahul"));
        list.add(new student(2, "sachin"));
        Collections.sort(list);
        System.out.println(list);

    }
}
