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
       // myThread t2=new myThread();
       // t2.start();  // this will run in a new thread
        t1.start();  // this will run in main thread
        try{
            t1.join();  // main thread will wait until t1 thread completes its execution
        }catch(Exception e){
            System.out.println(e);
        }
        for(int i=1;i<=5;i++){
            System.out.println("main thread");
            System.out.println(i);
        }}
}
