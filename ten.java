public class Ten {
    public static void main(String [] args){
        Ten number = new Ten();
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
