import java.util.*;

public class C_input{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter data:");
        int a = sc.nextInt();
        System.out.println(a);
        String name = sc.next();
        System.out.println(name);
        String fullName = sc.nextLine();
        System.out.println(fullName);
        sc.close();
    }
}