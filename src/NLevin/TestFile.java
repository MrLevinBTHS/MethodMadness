package NLevin;


import static NLevin.NLevinLib.println;
import static NLevin.NLevinLib.sumTensDigit;

public class TestFile {

    public static void main (String args[])
    {
       println("I love a cup of Java in the morning.");

       //Testing the sumTensDigit Method
       int x  = sumTensDigit(51,25);
       int y = sumTensDigit(1, 12);
       int z = sumTensDigit(173, 592);
       System.out.println("7: " + x + "\n1: " + y + "\n16: " + z);
    }

}
