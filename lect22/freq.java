// freq like aabbcccd = a2b2c3d1 easy code
public class freq {
    public static void main(String[] args) {
        String s = "aabbcccd";
        char[] c = s.toCharArray();
        int count = 1;
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == c[i + 1]) {
                count++;
            } else {
                System.out.print(c[i] + "" + count);
                count = 1;
            }
        }
        System.out.print(c[c.length - 1] + "" + count);
    }

}
