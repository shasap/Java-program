import java.util.Scanner;

public class Q8_SumOfXRange {
    public static void main(String[] args) {
        int i=1;
        int sum = 0;
        // -----Define Scanner object
        Scanner sumOfX = new Scanner(System.in);
        // -----Print statement for user to enter value of x
        System.out.println("Enter number to get sum: ");

        int x = sumOfX.nextInt();

        if ( x >=1 && x<=20) //----- if statement to make sure range of x is between 1 to 20.
        {
            for (int j = 0; j <=x ; ++j)
            {
                sum = j+sum;
            }
            System.out.println("Sum of 1 to "+x+" = "+sum);
        }else
            {
                System.out.println("It is a invalid entry.");
            }
    }
}

