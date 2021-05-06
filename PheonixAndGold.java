import java.util.*;
import java.io.*;

public class PheonixAndGold{

     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         
         int loop = sc.nextInt();
         for(int m=0;m<loop;m++)
         {
             int sum = 0;
             int sumtotal= 0;
             
             int n = sc.nextInt();
             int z = sc.nextInt();
             int a[] = new int[n];
             
             for(int i=0;i<n;i++)
             {
                a[i] = sc.nextInt();
                sumtotal+=a[i]; 
             }   
             Arrays.sort(a);
             for(int i=0;i<n;i++)
             {
                 if(sum+a[i]==z && a[i] ==a[n-1])
                 {
                     System.out.print("NO");
                     break;
                     
                     
                    
                     
                 }
                 else if(a[i]!=a[n-1]&&sum+a[i]==z)
                 {
                     int temp = a[i];
                     a[i] = a[n-1];
                     a[n-1] = temp;
                     sum +=a[i];
                 }
                 else
                 {
                     sum+=a[i];
                 }
                 
                 
                 
             }
             if(sumtotal == sum&& sum!=0){
                     System.out.println("YES");
                     for(int k=0;k<n;k++)
                     {
                         System.out.print(a[k]+" ");
                     }
                     System.out.println();
                 }
             
         }
         
         
         
     }
}