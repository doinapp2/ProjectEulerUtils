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
     * Get the first 3 numbers.
     *
     * @return a list of 1, 2, 3
     */
    public static List<Integer> getNumbers() {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(3);
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

    public static void main(String[] args) {

    }
}
