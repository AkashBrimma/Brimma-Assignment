/*16. 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
        What is the sum of the digits of the number 2
        1000?
        Ans: 1366*/

import java.math.BigInteger;
public class Power_digit_sum {
    public static void main(String[] args) {
        String temp = BigInteger.ONE.shiftLeft(1000).toString();
        int sum = 0;
        for (int i = 0; i < temp.length(); i++) {
            sum += temp.charAt(i) - '0';
        }
        System.out.println(Integer.toString(sum));
    }
}
