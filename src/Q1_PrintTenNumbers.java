import java.util.Scanner;

public class Q1_PrintTenNumbers {

    public static void main(String args[])
    {
        //---- Define scanner object

        Scanner scanner = new Scanner(System.in);

        //----- Print statement for user to enter first number
        System.out.println("Enter value of first number: ");
        int firstNumber = scanner.nextInt();

        // -----Print statement for user to enter second number
        //System.out.println("Enter value of second number: ");
        //int secondNumber = scanner.nextInt();
        int secondNumber = firstNumber+10;

        for (int i = firstNumber; i <secondNumber ; i++) {
            System.out.print(i+ " ");
        }
    }
}
