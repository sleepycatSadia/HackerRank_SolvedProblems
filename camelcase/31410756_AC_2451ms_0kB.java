
import java.util.*;
public class Solution {
    public static void main(String[] args)   {
         Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        char []c=s.toCharArray();
        int count=1;
        for(int i=0;i<=s.length()-1;i++){
            if(Character.isUpperCase(c[i]))
             count++;
            
        }
        System.out.println(count);
        sc.close();
    }
}
