public class maxnum {
    // a2c3d9e5 inme 9 is max sor print 9 easy method
    public static void main(String[] args) {
        String s = "a2c3d9e5";
        char[] c = s.toCharArray();
        char max = c[1];
        for (int i = 1; i < c.length; i += 2) {
            if (c[i] > max) {
                max = c[i];
            }
        }
        System.out.println(max);
        
        
    }
}
