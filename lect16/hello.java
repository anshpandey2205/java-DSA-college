package lect16;
import java.io.*;
public class hello {
    public static void main(String[] args) {
        File file=new File("New.txt");
        try{
        if(file.createNewFile()){
            System.out.println("file created");
        }else{
            System.out.println("file already exist");
        }
    }catch(Exception e){
        System.out.println(e);
    }
    }
}
