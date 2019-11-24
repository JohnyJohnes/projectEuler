import java.math.BigInteger;

public class Problem_016 {

    public static void main() {

        BigInteger bigInteger = BigInteger.valueOf(2);
        long sum=0;
        bigInteger = bigInteger.pow(1000);
        while (bigInteger.mod(BigInteger.valueOf(10)) != BigInteger.valueOf(0)){

            sum += bigInteger.mod(BigInteger.valueOf(10)).longValue();
            bigInteger = bigInteger.clearBit(bigInteger.bitLength());
        }

        System.out.println(sum);
    }
}
