
// Create a class with multiple sum methods where one takes two integers,
//  another takes three integers, and another takes two double values.
//   All methods should print the sum of the arguments passed.

package lect9;

class value{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void sum(double a,double b){
        System.out.println("Double"+a+b);
    }
}
public class question6 {
    public static void main(String[] args) {
        value v=new value();
        v.sum(41, 1);
    }
}
