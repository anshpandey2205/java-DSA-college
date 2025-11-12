 //Create a class Rectangle with length and breadth as fields. Add methods to calculate area and 
 //perimeter. Create objects with different values and call those methods.
package lect6;

 class Rectangle {
    int length;
    int breadth;
    int area(){
        return length*breadth;
    }
    int perimeter(){
        return 2*(length+breadth); 
}
 }
public class practiceQ2 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=5;
        r.breadth=10;
        
        
    }
}
