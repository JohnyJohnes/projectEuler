import java.util.ArrayList;
import java.util.List;

public class Project_003 {
    public static List<Long> primeFactors(long number) {
        long n = number;
        List<Long> factors = new ArrayList<Long>();
        for (long i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }

    public static void main(){
        for (Long prime : primeFactors(600851475143L)) {
            System.out.println(prime);
        }
    }

}
