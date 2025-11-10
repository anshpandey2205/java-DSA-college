package lect5;

public class count {
    public static void main(String[] args) {
        // count if str is "aabbcca"  result is a2b2c2a1
        String str="aaaaabbcca222";
        StringBuilder result=new StringBuilder();
        int count=1;
        for(int i=0;i<str.length();i++){
            if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                result.append(str.charAt(i));
                result.append(count);
                count=1;
            }
        }
        System.out.println(result.toString());

        
    }
}
