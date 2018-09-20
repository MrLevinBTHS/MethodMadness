package NLevin;

public class NLevinLib {

    public static void println(String str)
    {
        System.out.println(str);
    }

    /**
     * Adds together the tens digits of the integer inputs.
     * If the number is less than 10, use 0.
     *
     * @param num1 the first number to extract the tens digit from
     * @param num2 the second number to extract the tens digit from
     * @return     the sum of the tens digits added together
     */
    public static int sumTensDigit(int num1, int num2)
    {
        return(num1/10)%10 + (num2/10)%10;
    }

}
