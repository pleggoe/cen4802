public class FibSeq {

    /**
     * Main method for the FibSeq program. Displays the 10th term in the Fibonacci Sequence.
     * @param args
     */
    public static void main(String [] args)
    {
        System.out.println("The 10th term of the Fibonacci Sequence is: " + fibSeq(10));
    }

    /**
     * Method which finds the nth number (passed as an argument) of the Fibonacci Sequence.
     * @param n Integer passed to the method which determines the nth number in the Fibonacci Sequence.
     * @return Static integer of the nth number in the Fibonacci Sequence.
     */
    static int fibSeq(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        else
        {
            return fibSeq(n-1) + fibSeq(n-2);
        }
    }
}
