import java.util.Scanner;

public class Q2_FibonacciNumber {

    public static void main(String args[])
    {
        int number1 = 0;
        int number2 = 1;
        int number3;
        int i;
        Scanner fibonacciNumber = new Scanner(System.in);
        System.out.println("Please enter value of n: ");
        int n = fibonacciNumber.nextInt();

        System.out.print(number1+" "+number2);

        for(i=1;i<=n;i++)
        {
            number3= number1+number2;

            System.out.print(" "+number3+"");

            number1 = number2;
            number2 = number3;

        }
    }
}
