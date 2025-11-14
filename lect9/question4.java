//  Question 11: Device  Laptop  GamingLaptop (Multi-Level Inheritance)
//  Q: Write a Java program where:- 
//  Class Device has method powerOn()
//  - Class Laptop inherits Device and has method boot()
//  - Class GamingLaptop inherits Laptop and has method startGame()
//  - Create an object of GamingLaptop and call all method
package lect9;

class Device{
    void powerOn(){
        System.out.println("power on device");
    }
}
class laptop extends Device{
    void boot(){
        System.out.println("boot");
    }
}
class GamingLaptop extends laptop{
    void startGame(){
        System.out.println("Start the game");
    }
}
public class question4 {
    public static void main(String[] args) {
        GamingLaptop g= new GamingLaptop();
        g.powerOn();
        g.boot();
        g.startGame();
    }
}
