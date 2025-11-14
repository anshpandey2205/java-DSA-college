//  Question 10: Shape and Circle (Single-Level Inheritance)
//  Q: Write a Java program where:- 
//  Class Shape has method draw()
//  - Class Circle inherits Shape and has method calculateArea()
//  - Create an object of Circle and call both method
package lect9;

class shape{
    void shape(){
        System.out.println("Drawing shape");
    }
}
class circle extends shape{
    void calculateArea(){
        System.out.println( "area of circle");
    }
}
public class question3 {
    public static void main(String[] args) {
        circle c= new circle();
        c.shape();
        c.calculateArea();
    }
}
