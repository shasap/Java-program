import java.util.Scanner;

public class Q4_ReverseNumber {

    public static void main(String args[])
    {
        Scanner reverseNumber = new Scanner(System.in); // capture user input

        System.out.println("Enter number: ");

        int number = reverseNumber.nextInt();   //  captured input will be stored here

        int reverse = 0;

        /* for loop : no initialise part as number is already initialised
         * and no increment or decrement part because logic number/10
         * already decrements the value of number */

        for (;number!=0;number=number/10)
        {
            int remainder = number%10;
            reverse = reverse*10 + remainder;
        }
        System.out.println("The reverse of given number is: "+ reverse);
    }
}
