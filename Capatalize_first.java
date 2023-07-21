import java.util.*;

public class Capatalize_first {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       char arr[]=str.toCharArray();
       char arr1[]=new char[arr.length];

   
      
       for(int i=0;i<arr.length;i++)
       {
        if(i==0)
        {
            arr[i]=(char)((int)arr[i]-32);

        }
        if(arr[i]==' ')
        {
            arr[i+1]=(char)((int)arr[i+1]-32);
         
        
        }
        else
        {
            System.out.print(arr[i]);
        }
       }

    }
    
}
