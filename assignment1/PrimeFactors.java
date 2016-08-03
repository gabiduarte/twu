import java.util.ArrayList;

public class PrimeFactors {

    static ArrayList<Integer> primes = new ArrayList<Integer>();

    public static void main(String[] args) {
        generate(14);
    }

    public static void generate(int number) {

        for (int i = 2; i < number; i++) {
            //get all divisible
            if (number % i == 0) {
                boolean isPrime = true;

                //check if prime
                for (int l = 2; l < i; l++) {
                    if (i % l == 0) {
                        isPrime = false;
                    }
                }

                if (isPrime) {
                    primes.add(i);
                }
            }
        }
        System.out.println(primes);
    }
}
