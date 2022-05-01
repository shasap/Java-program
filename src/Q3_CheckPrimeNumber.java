import java.util.Scanner;

public class Q3_CheckPrimeNumber {

    public static void main(String args[]){
        Scanner checkPrimeNumber = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = checkPrimeNumber.nextInt();
        boolean IsPrime = true;

        for (int i = 2; i <= number/2; i++) {

            if (number%i==0)
            {
                IsPrime = false;
                break;
            }
        }
        if(IsPrime)
        {
            System.out.println(number+" is a prime number.");
        }else
            {
                System.out.println(number+" is not a prime number.");
            }

    }

}
