/*3. The prime factors of 13195 are 5, 7, 13 and 29.
        What is the largest prime factor of the number 600851475143?
        Ans: 6857*/

public class Largest_prime_factor {
    public static void main(String[] args) {
        long HT = 600851475143l;
        long i = 1l;
        while (true) {
            long temp= HT/i;
                    if((HT%temp==0)&&(isprime(temp))){
                        System.out.println(temp);
                        break;
                    }
            i++;
        }
    }
    public static boolean isprime(long num) {
        for (int i = 3; i <= Math.sqrt(num); i++) {
            if(num%i==0)
            return false;
        }
        return true;
    }
}



