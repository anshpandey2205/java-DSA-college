public class left {
    public static void main(String[] args) {
        String s = "abcdef";
        char c = 'c';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                System.out.print(s.charAt(i));
            }
        }

    }
}
