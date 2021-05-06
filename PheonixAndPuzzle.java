//Pheonix and Square
import java.util.*;
import java.io.*;
public class PheonixAndSquare{

     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         int loop = sc.nextInt();
         for(int i=0;i<loop ;i++)
         {
             double number=sc.nextDouble();  
             double sqrt=Math.sqrt(number);
             if(number%2!=0)
             {
                 System.out.println("NO");
             }
             else
             {
                 if(sqrt-Math.floor(sqrt)==0)
                 {
                     System.out.println("YES");
                 }
                 else
                 {
                     number = number/2;
                     sqrt=Math.sqrt(number);
                     if(sqrt-Math.floor(sqrt)==0)
                     {
                         System.out.println("YES");
                     }
                     else
                     {
                         System.out.println("NO");
                     }
                 }
             }
         }
         
        
        
     }
}