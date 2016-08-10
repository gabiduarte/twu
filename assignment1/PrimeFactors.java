import java.util.ArrayList;

public class PrimeFactors {

    static ArrayList<Integer> primes = new ArrayList<Integer>();

    public static void main(String[] args) {
        generate(75);
    }

    public static void generate(int number) {

        for (int i = 2; i < number; i++) {
            getDivisibleNumbers(number, i);
        }
        System.out.println(primes);
    }

    public static void getDivisibleNumbers(int number, int iterator) {
        if (number % iterator == 0) {
            if (isNumberPrime(iterator)) primes.add(iterator);
        }
    }

    public static boolean isNumberPrime(int iterator) {
        for (int l = 2; l < iterator; l++) {
            if (iterator % l == 0) {
                return false;
            }
        }
        return true;
    }
}
