public class Q12_MinMaxNumber {
    static int no1 = 32;
    static int no2 = 37;
    static int no3 = 4;

    //--- object to call non static method
    static Q12_MinMaxNumber minMaxNumber = new Q12_MinMaxNumber();

    // --- Method for finding smallest number out of 3 numbers

    public void min()
    {
        if (no1<=no2 && no1<=no3)
        {
            System.out.println(no1+" is the smallest number.");
        }else if(no2<=no1 && no2<=no3)
        {
            System.out.println(no2+" is the smallest number.");
        }else
            {
                System.out.println(no3+" is the smallest number.");
            }
    }

    // --- Method to find biggest number out of 3 numbers.

    public void max()
    {
        if (no1>=no2 && no1>=no3)
        {
            System.out.println(no1+" is the biggest number.");
        }else if(no2>=no1 && no2>=no3)
        {
            System.out.println(no2+" is the biggest number.");
        }else
            {
                System.out.println(no3+" is the biggest number.");
            }
    }

    public static void main(String[] args) {
        minMaxNumber.min();
        minMaxNumber.max();
    }
}
