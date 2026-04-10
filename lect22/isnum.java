public class isnum {
    public static void main(String[] args) {
        String s= "12345";
        boolean isnum = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                isnum = false;
                break;
            }
        }
        System.out.println(isnum);
    }
}
