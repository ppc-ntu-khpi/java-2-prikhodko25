// package domain;

public class Exercise {

    public static String calculate(int start, int end) {
        StringBuilder primeNumbers = new StringBuilder();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                if (primeNumbers.length() > 0) {
                    primeNumbers.append(", ");
                }
                primeNumbers.append(i);
            }
        }
        return primeNumbers.toString();
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;

        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
