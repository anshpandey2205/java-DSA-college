package lect3;

public class vowel {
    public static void main(String[] args) {
        // char ch='e';
        // if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        //     System.out.println("vowel");
        // }else{
        //     System.out.println("consonant");
        // }

        String str="java";
        int v=0;
        for(char ch:str.toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                v++;
            }
        }
        System.out.println("Number of vowels = " + v);
    }
}
