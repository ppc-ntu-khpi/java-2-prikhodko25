// package domain;

public class Exercise {

    public static String Calculate(int start, int end) {
        StringBuilder primes = new StringBuilder();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                if (primes.length() > 0) {
                    primes.append(", ");
                }
                primes.append(i);
            }
        }
        return primes.toString();
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
