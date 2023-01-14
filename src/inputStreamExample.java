import java.io.*;
public class InputStreamExample {
        public static void main(String args[]){
            try{
                //fine = file input stream example
                FileInputStream fine =new FileInputStream("C:\\Users\\Sina\\Desktop\\readsAllCharacters.txt");
                int i = 0;
                // -1 means until it has more characters to read
                while((i =f ine.read()) != -1){
                    System.out.print((char)i);
                }
                fine.close();
            }catch(Exception e){System.out.println(e);}
        }
    }

