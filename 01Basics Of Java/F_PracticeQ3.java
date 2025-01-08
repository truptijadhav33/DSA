import java.util.*;

public class F_PracticeQ3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pen price :");
        float pen = sc.nextFloat();
        System.out.println("Enter pencil price :");
        float pencil = sc.nextFloat();
        System.out.println("Enter eraser price :");
        float eraser = sc.nextFloat();
        float bill = pen + pencil + eraser;
        System.out.println("Bill is : "+bill);

        //Add on 18% gst tax
        float newbill = bill + (0.18f * bill);
        System.out.println("New bill is : "+ newbill);
        sc.close();

    }
}