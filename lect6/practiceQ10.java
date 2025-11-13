package lect6;

class laptop{
    String brand;
    int ram;
    double price;
    laptop(String brand,int ram,double price){
        this.brand=brand;
        this.ram=ram;
        this.price=price;
    }
    void display(){
        System.out.println("brand = "+brand);
        System.out.println("ram= "+ram);
        System.out.println("price= "+price);
    }
}
public class practiceQ10 {
    public static void main(String[] args) {
        laptop l=new laptop("MAC",16,450000);
        l.display();
        
    }
}
