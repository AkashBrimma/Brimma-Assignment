public class third {
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



