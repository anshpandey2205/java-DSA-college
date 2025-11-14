 //Q: Write a Java program where:-
//   Class Employee has method work()
//   - Class Manager inherits Employee and has method attendMeeting()
//   - Create an object of Manager and call both methods.
package lect9;
 class employee{
    void work(){
        System.out.println("workinggg");
    }
 }
 class manager extends employee{
    void attendMeeting(){
        System.out.println("Attending meeting");
    }
 }

public class question1 {
    public static void main(String[] args) {
        manager e= new manager();
        e.work();
        e.attendMeeting();
    }
}
