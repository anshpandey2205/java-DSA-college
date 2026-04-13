package lect23;

public class vowels {
    static int countVowels(String str, int i) {
        if(i == str.length()) {
            return 0;
        }
        char c = str.charAt(i);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return 1 + countVowels(str, i + 1);
        }
        return countVowels(str, i + 1);
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(countVowels(str, 0));
    }
}
