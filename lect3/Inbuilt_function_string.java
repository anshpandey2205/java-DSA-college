package lect3;

public class Inbuilt_function_string {
    public static void main(String[] args) {
        String str="hello world";
        System.out.println("original string: " + str);
        System.out.println("Length of string : "+ str.length());
        System.out.println("character at index 4 : " + str.charAt(4));
        System.out.println("substring from index 2 to 7 : " + str.substring(2, 7));
        System.out.println("index of o : " + str.indexOf('o'));
        System.out.println("to uppercase : " + str.toUpperCase());
        System.out.println("to lowercase : " + str.toLowerCase());

    }
}
