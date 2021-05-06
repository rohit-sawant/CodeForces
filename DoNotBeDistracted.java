//link to the question
//https://codeforces.com/contest/1520/problem/A

import java.util.*;
import java.io.*;
public class DoNotBeDistracted{
 
     public static void main(String []args) throws IOException{
        Scanner sc= new Scanner(System.in);
        InputStreamReader r=new InputStreamReader(System.in);    
            BufferedReader br =new BufferedReader(r);
        int loop = Integer.parseInt(br.readLine());
        for(int ij=0;ij<loop;ij++)
        {
            Set<Character> hash_Set = new HashSet<Character>();
           
           
            int n = Integer.parseInt(br.readLine());
            String s =br.readLine();
            hash_Set.add(s.charAt(0));
            int count= 1 ;
            
            for(int i=1;i<s.length();i++)
            {
                if(s.charAt(i)!=s.charAt(i-1))
                {
                    count++;
                    hash_Set.add(s.charAt(i));
                }
            }
            
            
            if(hash_Set.size()==count)
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