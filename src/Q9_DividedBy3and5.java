public class Q9_DividedBy3and5 {

    public static void main(String args[])
    {
        //--- First we find number divisible by 3 between 1 to 100
        for (int i = 1; i <=100 ; i++)
        {
           if(i%3==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println("\n");

        //--- Now we find numbers divisible by 5 between 1 to 100

        for (int i = 1; i <=100 ; i++)
       {
            if(i%5==0)
            {
                System.out.print(i+" ");
            }
           }
        }
    }

