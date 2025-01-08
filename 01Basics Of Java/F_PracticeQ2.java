import java.util.*;
public class F_PracticeQ2{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1 :");
        int s1 = sc.nextInt();
        System.out.println("Enter side 2 :");
        int s2 = sc.nextInt();
        int area= s1*s2;
        System.out.print("Area = "+area);
        sc.close();
    }
}