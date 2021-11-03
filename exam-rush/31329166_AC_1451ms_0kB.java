import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] tm = new int[n];
        for(int i = 0;i < n; i++){
            tm[i] = in.nextInt();
        }
       Arrays.sort(tm);
        int sum=0;
        int count=0;
        for(int idx=0;idx<tm.length-1;idx++){
            sum+=tm[idx];
            if(sum<=t)
                count++;
            else
                break;
        }
         System.out.println(count);
          }

}