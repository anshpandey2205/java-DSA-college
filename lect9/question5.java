//  Question 12: Book and Novel (Single-Level Inheritance)
//  Q: Write a Java program where:
//  - Class Book has method read()
//  - Class Novel inherits Book and has method storyLine()
//  - Create an object of Novel and call both methods.
 package lect9;

class book{
    void read(){
        System.out.println("readingg");
    }
}
class novel extends book{
    void storyLine(){
        System.out.println("interesting story line ");
    }
}
public class question5 {
    public static void main(String[] args) {
        novel n= new novel();
        n.read();
        n.storyLine();
    }
}
