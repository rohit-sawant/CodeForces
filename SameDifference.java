//link to the qustion
//https://codeforces.com/contest/1520/problem/D

import java.util.*;
import java.io.*;
public class SameDifference{
 
     public static void main(String []args) throws IOException{
        Scanner sc= new Scanner(System.in);
        int loop = sc.nextInt();
        for(int ij=0;ij<loop;ij++)
        {
           int n = sc.nextInt();
           int ans=0;
           HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
           int a[] = new int[n];
           for(int i=0;i<n;i++)
           {
               a[i]= sc.nextInt();
               Integer count = map.get(i-a[i]);
                if (count == null) {
                    map.put(i-a[i], 1);
                }
                else {
                    map.put(i-a[i], count + 1);
                }
           }
           for(Map.Entry<Integer,Integer> entry : map.entrySet())
           {
               int k = entry.getValue();
               ans += (k*(k-1))/2;
               
           }
           System.out.println(ans);
           
        }
     }
     
}