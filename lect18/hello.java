package lect18;

class mythread implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000); // Sleep for 2 second
            } catch (Exception e) {
                System.out.println(e);
            }
        }

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
