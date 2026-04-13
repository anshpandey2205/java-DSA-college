public class palindoRecur {
    // recursive way
    public static boolean ispalindrome(String s){
        if(s.length()==0 || s.length()==1){
            return true;
        }
        else{
            if(s.charAt(0)==s.charAt(s.length()-1)){
                return ispalindrome(s.substring(1, s.length()-1));
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(ispalindrome("racecar"));
        System.out.println(ispalindrome("hello"));
    }
}
