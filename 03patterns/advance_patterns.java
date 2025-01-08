

public class advance_patterns{
    public static void hollow_rectangle(int row , int col)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if((i==1||i==row)||(j==1||j==col))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n)
    {
         int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void triangle_01(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0) //even
                {
                    System.out.print('1');
                }
                else{ //odd
                    System.out.print('0');
                }
            }
            System.out.println();
        }
    }

    public static void butterfly_pattern(int n)
    {
        // first half
        for(int i=1;i<=n;i++)
        {
            //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            //space
            for(int j=1;j<= 2*(n-i);j++)
            {
                System.out.print(" ");
            }

            //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // second half
        for(int i=n;i>=1;i--)
        {
             //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            //space
            for(int j=1;j<= 2*(n-i);j++)
            {
                System.out.print(" ");
            }

            //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solid_rohmbus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rohmbus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if((j==1||j==n)||(i==1||i==n))
                {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond_pattern(int n)
    {
        //first half
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //second half
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangle_numbers(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            int num=1;
            for(int j=1;j<=(2*i-1);j++)
            {
                 System.out.print(num);
                if(j<i)
                {
                    num++;
                }
                else
                {
                    num--;
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        // hollow_rectangle(11,11);
        // floyds_triangle(5);
        // triangle_01(5);
        // butterfly_pattern(15);
        // solid_rohmbus(5);
        // hollow_rohmbus(5);
        // diamond_pattern(5);
        triangle_numbers(5);
    }
}