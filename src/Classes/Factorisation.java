package Classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Polina on 12/22/13.
 */
public class Factorisation {

    public static int number;

    public Factorisation(int numbers){
        this.number = numbers;
    }

    public static List<Integer> primeFactors() {
        int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n / i; i++)
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}
