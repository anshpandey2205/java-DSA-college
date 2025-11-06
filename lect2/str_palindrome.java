package lect2;

public class str_palindrome {
    public static void main(String[] args) {
        String str="madam";
        String rev="";
        for(int i=str.length();i>0;i--){
            rev=rev+str.charAt(i-1);

        }
        if(str.equals(rev)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");;
        }
    }
}
