import java.util.Scanner;

public class Q7_Calculator {
    public static void main(String args[]){

        Scanner calculator = new Scanner(System.in);    // created object for user to input number
        System.out.println("Enter first number:");      // instruct user to enter first number
        double a = calculator.nextDouble();             // user input will be stored here

        System.out.println("Enter operation: +, -, * or / "); // instruct user to enter symbol for operation user wants to do
        char operator = calculator.next().charAt(0);          // user operation input will be stored here

        System.out.println("Enter second number: ");    // instruct user to enter second number
        double b = calculator.nextDouble();

        switch (operator)
        {
            case '+':
            System.out.println("Addition of "+a+" & "+b+" = "+(a+b));
            break;
            case '-':
                System.out.println("Subtraction of "+a+"  & "+b+"= "+(a-b));
                break;
            case '*':
                System.out.println("Multiplication of "+a+" & "+b+" = "+(a*b));
                break;
            case '/':
                System.out.println("Division of "+a+" & "+b+" = "+(a/b));
        }
    }
}
