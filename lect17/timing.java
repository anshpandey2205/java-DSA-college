package lect17;

class timingt extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
       for(int i=1;i<=5;i++){
            System.out.println("timer: "+i+" seconds");
            System.out.println("downloading file "+i*20+"%");
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class timing {
    public static void main(String[] args) {
         timingt t1=new timingt();
        t1.start();  // this will run in main thread
    }
}
