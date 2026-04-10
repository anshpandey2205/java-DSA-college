public class maxnum {
    // a2c3d9e5 inme 9 is max sor print 9
    public static void main(String[] args) {
        String s = "a2c3d9e5";
        char[] c = s.toCharArray();
        int max = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                int num = c[i] - '0';
                if (num > max) {
                    max = num;
                }
            }
        }
        System.out.println(max);
        
    }
}
