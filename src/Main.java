public class Main
{
    public static void main(String[] args)
    {
        int multi = 0;
        int rows = 5;

        System.out.println("Part A, task 1");

        for(int r=0; r < 31; r++) // r starts at 0 and gets incremented until it is no long < 10 e.g. 11
        {
            System.out.println(r);
        }

        System.out.println("Part A, task 2");

        for(int s=30; s > -1; s--) // r starts at 0 and gets incremented until it is no long < 10 e.g. 11
        {
            System.out.println(s);
        }

        System.out.println("Part A, task 3");

        for(int m = 0; m < 7; m++) // r starts at 0 and gets incremented until it is no long < 10 e.g. 11
        {
            multi = m * 3;
            System.out.println(multi);
        }

        System.out.println("Part A, task 4");

        for(int c=10; c > -1; c-=2)
        {
            System.out.println(c);
        }

        System.out.println("Part B, task 1");

        for (int i = 1; i <= rows; ++i)
        {
            for (int j = 1; j <= i; ++j)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Part B, task 2");

        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; ++j)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Part B, task 3");

        for(int dot = 1; dot <= 5; dot++)
        {
            for (int d = 1; d < 6; d++)
            {
                System.out.printf("*");
            }
            System.out.println("");
        }

    }
}