public class FibSeq {

    public static void main(String [] args)
    {
        System.out.println("The 10th term of the Fibonacci Sequence is: " + fibSeq(10));
    }


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
