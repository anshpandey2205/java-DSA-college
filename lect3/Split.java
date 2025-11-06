package lect3;

public class Split {
    public static void main(String[] args) {
        String str="java cpp c js php ruby";
        String a[]=str.split(" ");
        for(String val : a){
            System.out.println(val);
        }
    }
}
