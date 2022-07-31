/*7. By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th
        prime is 13.
        What is the 10,001st prime number?
        Ans: 104743*/

public class prime {
    public static void main(String[] args) {
        final int n = 10001;
        int numPrimes = 1, num = 1;
        while (numPrimes < n) {
            num += 2;
            numPrimes += (isPrime(num)) ? 1 : 0;
        }
        System.out.println(num);
    }
    public static boolean isPrime(int num) {
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
