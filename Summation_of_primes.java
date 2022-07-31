/*10. The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
        Find the sum of all the primes below two million.
        Ans: 142913828922*/

public class Summation_of_primes {
    public static void main(String [] args){
        Summation_of_primes number = new Summation_of_primes();
        long Sum = 0;
        int i = 1;
        while (i < 2000000) {
            if (number.isPrime(i)) {
                Sum += i;
            }
            i += 2;
        }
        System.out.println(Sum);
    }
    public boolean isPrime(int n)
    {
        if (n == 1){
            return false;
        }
        int k = (int) Math.sqrt(n);
        for (int i = 2; i <= k; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
