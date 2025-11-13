 // Create a class Student with fields name, rollNumber, and marks. Write a method to display
 //student details. Create 3 student objects and display their data

package lect6;

     class student{
        String name;
        int rollNumber;
        float marks;
     void displayDetails(){
            System.out.println("Name: "+name);
            System.out.println("Roll Number: "+rollNumber);
            System.out.println("Marks: "+marks);
        }
    }
    public class practiceQ1 {
    public static void main(String[] args) {
        student s1= new student();
        student s2= new student();
        student s3= new student();
        s1.name="anshu";
        s1.rollNumber=1;
        s1.marks=91.4f;
        s1.displayDetails();
        System.out.println();
        s2.name="vikash";
        s2.rollNumber=2;
        s2.marks=85.5f;
        s2.displayDetails();
        System.out.println();
        s3.name="vivek";
        s3.rollNumber=3;
        s3.marks=88.5f;
        s3.displayDetails();    
    }
}
