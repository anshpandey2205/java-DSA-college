package lect6;
    //  class car{
    //      String brand="BMW"; 
    //     static void brandName(){
    //         System.out.println(brand);
    //     }
    // }
     class car{
         String brand="BMW"; 
        static void brandName(){
            car myCar=new car();
            System.out.println(myCar.brand);
        }
    }
    public class hello2 {
    public static void main(String[] args) {

        car myCar=new car();
        myCar.brandName();

    }
}
