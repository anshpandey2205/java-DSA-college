package lect8;

 class xParent {
    void show(){
        System.out.println("parent class");
    }
}
class xChild extends xParent{
    void show(){
        System.out.println("child class");
    }
    void display(){
        show(); //calls child class show()
        super.show(); //calls parent class show()
    }
}
public class SupperKey {
    public static void main(String[] args) {
        xChild c=new xChild();
        c.display();
        
    }
}
