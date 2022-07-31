/*9. A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
        a2 + b2 = c2
        For example, 32 + 42 = 9 + 16 = 25 = 52.
        There exists exactly one Pythagorean triplet for which a + b + c = 1000.
        Find the product abc.
        Ans: 31875000*/

public class Special_pythagorean_triplet {
    public static void main(String[] args) {
        int sum = 1000;
        for (int a = 2; a < sum; a++) {
            for (int b = 1; b < a; b++) {
                int c = sum - (a + b);
                    if ((a * a) + (b * b) == (c * c)) {
                        System.out.println(a * b * c);
                    }
                }
            }
        }
    }
