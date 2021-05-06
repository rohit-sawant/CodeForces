//link to the question
//https://codeforces.com/contest/1520/problem/B
import java.util.*;
import java.io.*;
public class OrdinaryNumber {
    public static void main(String []args) throws IOException{
        Scanner sc= new Scanner(System.in);
        int loop = sc.nextInt();
        
        for(int ij=0;ij<loop;ij++)
        {
           
           long n=sc.nextInt();
           int count = 0;
           if(n<10)
           {
               System.out.println(n);
               continue;
           }
          
           long i = n;
           char[] chars = ("" + i).toCharArray();
           
           long ord = Character.getNumericValue(chars[0]);
           int k = (int)ord;
            while(n>=10)
            {
                ord = ((ord*10)+k);
                
                count+=9;
                n /= 10;
                
                
                
            }
            if(ord<=i)
            {
                count+=k;
            }
            else
            {
                count+=(k-1);
            }
            
            System.out.println(count);
            
            
        }
     }
    
}
