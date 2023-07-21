
import java.util.*;
public class Tot_String {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1="";
        int count=1;
        for(int i=0;i<str.length()-1;i++)
        {
            str1=str1+str.charAt(i);
            count++;
        }
        System.out.println(count);

    }
    
}
