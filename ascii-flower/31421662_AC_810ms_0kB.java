import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("..O..");
            }
            System.out.println();
            for(int j=1;j<=c;j++){
                System.out.print("O.o.O");
            }
            System.out.println();
            for(int j=1;j<=c;j++){
                System.out.print("..O..");
            }
            System.out.println();
        }
    }
}