import java.io.*;
public class HelloWorld{

     public static void main(String []args) throws IOException{
         InputStreamReader r=new InputStreamReader(System.in);  
        BufferedReader br=new BufferedReader(r);
        int no = Integer.parseInt(br.readLine());
        for(int i = 0;i<no;i++)
        {
            String input = br.readLine();
            String arr[]=input.split(" ");
            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);
            int k = Integer.parseInt(arr[2]);
            if(((n-1)*1)+((m-1)*n)==k)
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