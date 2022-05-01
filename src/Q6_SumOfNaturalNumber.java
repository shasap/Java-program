import java.util.Scanner;

public class Q6_SumOfNaturalNumber {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        Scanner sumOfNaturalNumber = new Scanner(System.in);
        System.out.println("Enter number to get sum of natural number: ");
        int n = sumOfNaturalNumber.nextInt();

        for (i = 0;  i<=n ; i++) {
            sum = i+sum;
        }
        System.out.println("Sum of natural number "+n+" = "+sum);
    }
}
