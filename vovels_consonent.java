import java.util.Scanner;
public class vovels_consonent {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        if((n=='a'||n=='A')||(n=='e'||n=='E')||(n=='i'||n=='I')||(n=='o'||n=='O')||(n=='u'||n=='U'));
        System.out.println("Vovels");
        if((n!='a'||n!='A')||(n!='e'||n!='E')||(n!='i'||n!='I')||(n!='o'||n!='O')||(n!='u'||n!='U'));
        System.out.println("Consonent");
        //if((n>='a'||n<='z')||(n>='A'||n<='Z'));
        //System.out.println("Consonent");
        if(!(n>='a'||n<='z')||(n>='A'||n<='Z'))
        {
        System.out.println("Not Alphabet");
        }
    
    }

    
}
