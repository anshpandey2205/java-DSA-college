public class countLast {
    public static void main(String[] args) {
        String s = "abc";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for(int j=i; j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
