import java.util.*;


public class Main {
    public static void main(String[] args) 
     {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();

        String lc=s.toLowerCase();
        int asciiValue = 97;

        char convertedChar = '\u0000';
        while(true){
            convertedChar =(char)asciiValue;
            if(convertedChar!='{'){
                 if(lc.indexOf(convertedChar)!=-1){
                   asciiValue++;
                 }else{
                  System.out.println("not pangram");
                  break;
                 }
           }else{
                System.out.println( "pangram");
                break;
        }
     }
    }
}
