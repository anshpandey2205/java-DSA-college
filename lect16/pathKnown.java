package lect16;

import java.io.File;

public class pathKnown {
    public static void main(String[] args) {
        File file=new File("data.java");
        try{
        if(file.createNewFile()){
            System.out.println("file created"+file.getName());
            System.out.println("file created"+file.getAbsoluteFile());
        }else{
            System.out.println("file already exist");
        }
    }catch(Exception e){
        System.out.println(e);
    }
    }
}
