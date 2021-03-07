package AntraDalis;

import java.util.Scanner;

public class Task5 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i;
        int temp = 0;

        for (i = 1; i <= a; i++)
        {
            int counter=0;
            for (temp = i; temp >= 1; temp--)
            {
                if (i % temp == 0)
                {
                    counter = counter + 1;
                }
            }
            if (counter == 2)
            {
                System.out.println(i);
            }
        }

    }
}