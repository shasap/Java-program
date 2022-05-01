import java.util.Scanner;

public class Q5_FactorialOfNumber {
    public static void main(String args[]){
        int i=1;
        long factorial =1;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number to get factorial: ");
        int n = number.nextInt();

        for (i = 1; i <= n; i++) {
            factorial = i*factorial;
        }
        System.out.println("Factorial of "+ n +" = "+factorial);
    }
}
