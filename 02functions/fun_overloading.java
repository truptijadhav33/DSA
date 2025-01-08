import java.util.*;

public class fun_overloading{
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(add(5,7));
        System.out.println(add(5,7,2));
        sc.close();
    }
}