//  Question 9: Person  Student  Monitor (Multi-Level Inheritance)
//  Q: Write a Java program where:- 
//  Class Person has method displayName()
//  - Class Student inherits Person and adds method displayClass()
//  - Class Monitor inherits Student and adds method checkDiscipline()
//  - Create an object of Monitor and call all three methods
package lect9;

class person{
    void displayName(){
        System.out.println("name= john");
    }
}
class student extends person{
    void displayClass(){
        System.out.println("Class= 12th");
    }
}
class monitor extends student{
    void checkDiscipline(){
        System.out.println("in discipline");
    }
}
public class question2 {
    public static void main(String[] args) {
        monitor m=new monitor();
        m.displayName();
        m.displayClass();
        m.checkDiscipline();
        
    }
}
