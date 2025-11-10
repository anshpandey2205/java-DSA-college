package lect5;

public class reverseWord {
    public static void main(String[] args) {
         StringBuilder str=new StringBuilder("i love java");
            String[] words=str.toString().split(" ");
            StringBuilder reversedStr=new StringBuilder();
            for(String word:words){
                StringBuilder revWord=new StringBuilder(word);
                revWord.reverse();
                reversedStr.append(revWord).append(" ");
            }
            System.out.println(reversedStr.toString());

    }
}
