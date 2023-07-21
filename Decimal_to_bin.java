import java.util.*;

public class Decimal_to_bin {
    public static void main(String args[])
    {
        System.out.print("Enter the Decimal number:");
        Scanner sc =new Scanner (System.in);
        int num=sc.nextInt();
        String bin="";
        while(num!=0)
        {
            bin+=num%2;
            num=num/2;
        }
        System.out.println(bin);
        StringBuffer buffer=new StringBuffer(bin);
        buffer.reverse();
        System.out.println(buffer);

    }
}
