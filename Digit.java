import java.util.Scanner;

public class Digit{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.printf("%05d\n",a);
        System.out.printf("%15d",b);
    }
}