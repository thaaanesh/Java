import java.util.*;
class sqr{
    Scanner sc =new Scanner(System.in);
    void area1()
    {
        int l,area;
        l=sc.nextInt();
        System.out.println(area=l*l);
        
    }
}

class rect extends sqr{
    Scanner sc =new Scanner(System.in);
    void area2()
    {
        int l,b,area;
        l=sc.nextInt();
        b=sc.nextInt();
        System.out.println(area=l*b);
        
    }
}

public class Area_sqr_rect {
    public static void main (String args[])
    {
        rect obj=new rect();
        obj.area1();
        obj.area2();

    }
    
}
