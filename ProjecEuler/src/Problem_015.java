import java.math.BigInteger;

public class Problem_015 {

    public static void main(){
        int n = 40;     // The total number of moves for any one path (right + down)
        int r = 20;     // The total number of right moves for any one path

        System.out.println(factorial(n).divide(factorial(r).multiply(factorial(n - r))));
    }
    public static BigInteger factorial( int n1 )
    {
        BigInteger n = BigInteger.ONE;
        for (int i = 1; i <= n1; i ++) {
            n = n.multiply(BigInteger.valueOf(i));
        }
        return n;
    }
}
