import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         

         int loop = sc.nextInt();
         for(int ij=0;ij<loop;ij++)
         {
             
        Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
         
         int n = sc.nextInt();
         int a[] =  new int[n];
         int u[] = new int[n];
         
         for(int i=0;i<n;i++)
         {
            a[i] = sc.nextInt();    
         }
         
         for(int i=0;i<n;i++)
         {
            u[i] = sc.nextInt();    
         }
         //code
         for (int i = 0; i < n; i++) {
            map.put(a[i], new ArrayList<Integer>());
        }
        for (int i = 0; i < n; i++) {
            map.get(a[i]).add(u[i]);
        }
        int keylen = map.size();
        int i = 0;
        int x[][] = new int[keylen][n];
        for (Integer key : map.keySet()) {
            int sum = 0;
            Collections.sort(map.get(key), Collections.reverseOrder());
            ArrayList<Integer> ary = new ArrayList<Integer>();
            
            for (Integer b : map.get(key)) {
                sum = sum + b;
                ary.add(sum);
            }
            map.put(key,ary);

        }
        for(i=1;i<=n;i++)
        {
            int sum=0;
            int e;
            for(Integer key:map.keySet())
            {
                ArrayList<Integer> ary= map.get(key);

                    int mod =  ary.size()%i;
                    if(mod<ary.size())
                    {
                         e = ary.get(ary.size()-1-mod);
                     sum = sum+e;
                    }
                        
            }
            if(i==n)
            {
                System.out.println(sum);
            }
            else
            {
                 System.out.print(sum+" ");
            }
            
        }
         
             
         }
     }
}