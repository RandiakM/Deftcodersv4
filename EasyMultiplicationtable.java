import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int n1,mul;
        
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        
       
      for(n1=1; n1<=12; n1++)
      {
          mul=n*n1;
          System.out.println(n+"X"+n1+"="+mul);
      }
    }
}
