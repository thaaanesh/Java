import java.util.*;
public class unique {
    public static void main(String args[])
    {
    int arr[]={1,2,3,2,3,5};
    int count=0,str=0,n=5;
   // while(n!=0)
    {
    for(int i=0;i<6;i++)
    {
        for(int j=i+1;j<6;j++)
        {
            if(arr[i]==arr[j])
            {
                count++;
                //System.out.println(arr[i]);
            }
            if(i==n&&j==n)
            {
                
                System.out.println(arr[i]);
            }
        }
        if (count==0)
        {
            System.out.println(arr[i]);
        }

    }
    
//}
}
    
    }
}
