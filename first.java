public class first {
    public static void main (String[] args) {
        int sum=0;
        int n=1000;
        for(int i=0; i<1000; i++)
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        System.out.println(sum);
    }
}
