package lect4;

public class count_words {
    public static void main(String[] args) {
        String str="java is programing language";
        String[] words=str.split(" ");
        System.out.println("Number of words = " + words.length);
    }
}
