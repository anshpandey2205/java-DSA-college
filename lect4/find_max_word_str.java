package lect4;

public class find_max_word_str {
    public static void main(String[] args) {
        String str="java is programing language";
        String[] words=str.split(" ");
        String maxword="";
        for(String word:words){//
            if(word.length()>maxword.length()){
                maxword=word;
            }
        }
        System.out.println("Max word is: " + maxword);
    }
}
