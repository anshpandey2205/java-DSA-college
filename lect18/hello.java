package lect18;

class mythread implements Runnable{
    public void run(){
        System.out.println("hello");
    }
}
public class hello {
    public static void main(String[] args) {
        mythread task=new mythread();
        Thread t1=new Thread(task);
        Thread t2=new Thread(task);
        t1.start();
        t2.start();
    }
}
