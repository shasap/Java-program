public class Q11_CountCharacter {

    public static void main(String args[])
    {
        int count = 0;
        String str = "'I got annoyed when I see red line in Java program.'";
        String st = str.toLowerCase();
        char letter = 'i';


        /*To calculate the length of a string in Java,
        you can use an inbuilt length() method of the Java string class which is str.length()
         */
        for (int i = 0; i <st.length() ; i++)
        {
            if (st.charAt(i) == letter ) // ---- inbuilt str.charAt(i) method to count character in string'.
                count++;
        }
        System.out.println("Letter " +letter+" comes "+count+" times in "+st);
    }
}
