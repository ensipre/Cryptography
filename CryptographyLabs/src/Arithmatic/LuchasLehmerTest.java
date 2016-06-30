package Arithmatic;

import java.util.Scanner;

/**
 * Created by Dipesh on 6/30/2016.
 */
public class LuchasLehmerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to test: ");
        int p =scanner.nextInt();
        boolean check=test(p);
        if(check==true)
        {
            System.out.println("The given number is prime");
        }
        else
        {
            System.out.println("The given number is composite");
        }
    }

    private static boolean test(int p) {
        int s=4;
        int m= (int) (Math.pow(2,p)-1);
        for (int i = 0; i <p-2 ; i++)
        {
            s=((s*s)-2)%m;

        }
        if (s==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}