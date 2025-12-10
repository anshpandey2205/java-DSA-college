package lect16;

import java.io.*;
public class pathKnown {
    static void Writedata(String data){
        try{
        FileWriter writer=new FileWriter("New.txt",true);
        writer.write(data);
        writer.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    static void fileRead(){
        try{
        FileReader reader=new FileReader("New.txt");
        int ch;
        while((ch=reader.read())!=-1){
            System.out.print((char)ch);
        }
        reader.close();
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
    static void FileDelete(){
        try{
        File file=new File("New.txt");
        if(file.delete()){
            System.out.println("file deleted");
        }else{
            System.out.println("file not deleted");
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
}

    public static void main(String[] args) {
        //  USED TO WRITE DATA IN A FILE
        //Writedata("\nhello world");

        // USED TO READ DATA FROM A FILE
        //fileRead();

        // USED TO DELETE A FILE
        FileDelete();

    //     File file=new File("data.java");
    //     try{
    //     if(file.createNewFile()){
    //         System.out.println("file created"+file.getName());
    //         System.out.println("file created"+file.getAbsoluteFile());
    //     }else{
    //         System.out.println("file already exist");
    //     }
    // }catch(Exception e){
    //     System.out.println(e);
    // }
    }
}

