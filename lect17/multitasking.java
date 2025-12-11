package lect17;

class myThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=1;i<=5;i++){
            System.out.println(i +"t1 thread");
        }
    }
}
public class multitasking {
    public static void main(String[] args) {
        myThread t1=new myThread();
        t1.run();  // this will run in main thread
        for(int i=1;i<=5;i++){
            System.out.println("main thread");
        }
    }
}
