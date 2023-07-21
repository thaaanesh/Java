import java.util.*;
public class Cube {
   //with argument with return type
   ///*  
   public static void main(String args[])
    {
        int a,b;
        a=3;
        b=3;
        System.out.println(Num_cube(a,b));

    }
    static int  Num_cube(int a,int b)
    {
        int result;
        result=(int)Math.pow(a,b);
        return result;
    }//*/

    /*
    public static void main(String args[])
    {
        //int a,b;
        cube1 cub=new cube1();
        cub.c=3;
        cub.d=3;
        cub.Num_cube();
       // System.out.println(Num_cube(a,b));

    }//*/
}

/*class cube1{
    int c;
    int d;
    void Num_cube()
    {
        int result=(int)Math.pow(c,d);
        System.out.println(result);
    }


}*/
