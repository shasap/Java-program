import java.util.Scanner;

public class Q10_MultiplicationTable {

    public static void main(String[] args) {

        Scanner multiplicationTable = new Scanner(System.in);
        System.out.println("Multiplication table of ");


        int a = multiplicationTable.nextInt();

        for (int i = 1; i <= 12; i++)
        {
            System.out.println(a+" x "+i+" = "+ (a*i));

        }
    }
}
