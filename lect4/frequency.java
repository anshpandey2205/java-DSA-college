package lect4;

public class frequency {
    public static void main(String[] args) {
        String str="hello";
        for(char ch='a';ch<='z';ch++){
            int count=0;
            for(char c:str.toCharArray()){
                if(c==ch){
                    count++;
                }
            }
            if(count>0){
                System.out.println(ch + " : " + count);
            }
        }
    }
}
