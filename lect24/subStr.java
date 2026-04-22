package lect24;

public class subStr {
    static void subStr(String str, int i, String ans) {
        if(i == str.length()) {
            System.out.println(ans);
            return;
        }
        char c = str.charAt(i);
        // include
        subStr(str, i + 1, ans + c);
        // exclude
        subStr(str, i + 1, ans);
    }
    public static void main(String[] args) {
        String str = "abc";
        subStr(str, 0, "");
    }
}