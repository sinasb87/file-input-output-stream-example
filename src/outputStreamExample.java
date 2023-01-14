import java.io.*;
public class OutputStreamExample {
        public static void main(String args[]){
            try{
                FileOutputStream fose=new FileOutputStream("C:\\Users\\Sina\\Desktop\\readsAllCharacters.txt");
                String se = "hello this is my example";
                byte b[] = se.getBytes();
                fose.write(b);
                fose.close();;
            }catch(Exception e){System.out.println(e);}
        }
    }
