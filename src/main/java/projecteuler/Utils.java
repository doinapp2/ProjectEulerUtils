package projecteuler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Doina
 */
public class Utils {

    /**
     * Get the first 2 numbers.
     *
     * @return a list of 1, 2
     */
    public static List<Integer> getNumbers() {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        return result;
    }

    /**
     * tests if a number is prime
     *
     * @param n the number to test
     * @return is it prime?
     */
    public static boolean isPrime(long n) {
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static <T> void printList(List<T> L) {
        Iterator<T> it = L.iterator();
        while (it.hasNext()) {
            T x = it.next();
            System.out.print(x);
            if (it.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static <T extends Number, U extends Number> int add(T a, U b) {
        return a.intValue() + b.intValue();
    }

    public static List<Long> getPrimesUntil(int n) {
        List<Long> primes = new ArrayList<>();
        primes.add(2L);
        primes.add(3L);
        long i = 1;
        long x1, x2;
        boolean test1;
        boolean test2;
        while (true) {
            x1 = 6 * i - 1;
            x2 = 6 * i + 1;

            test1 = true;
            test2 = true;

            Iterator<Long> it;
            it = primes.iterator();
            while (it.hasNext()) {
                long prime = it.next();
                if (prime > Math.sqrt(x1)) {
                    break;
                }
                if (x1 % prime == 0) {
                    test1 = false;
                }
            }

            it = primes.iterator();
            while (it.hasNext()) {
                long prime = it.next();
                if (prime > Math.sqrt(x2)) {
                    break;
                }
                if (x2 % prime == 0) {
                    test2 = false;
                }
            }

            if (test1 && x1 <= n) {
                primes.add(x1);
            }
            if (test2 && x2 <= n) {
                primes.add(x2);
            }
            if (x1 > n || x2 > n) {
                break;
            }
            i++;
        }
        return primes;
    }

    public static void main(String[] args) {

    }
}
