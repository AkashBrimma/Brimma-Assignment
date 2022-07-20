import java.math.BigInteger;
public class Twenty {
    public static void main(String[] args) {
        int n = 100;
        if (args.length == 1) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (Exception e) {
                System.out.println("arg parse error. will use default n=" + n
                        + "\n\n");
            }
        }
        Twenty number = new Twenty();
        number.sumDigits(number.getFactorial(n).toString());

    }

    public BigInteger getFactorial(int n) {
        if (n < 0) {
            return BigInteger.ZERO;
        } else if (n > 0) {
            BigInteger factorial = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            return factorial;
        } else {
            return BigInteger.ONE;
        }
    }

    public void sumDigits(String s) {
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Long.parseLong(s.substring(i, i + 1));
            System.out.print(s.charAt(i));
        }
        System.out.println("\n"+sum);
    }
}
