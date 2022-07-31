/*4. A palindromic number reads the same both ways. The largest palindrome made from
        the product of two 2-digit numbers is 9009 = 91 × 99.
        Find the largest palindrome made from the product of two 3-digit numbers.
        Ans: 906609*/


class Largest_palindrome_product {
        public static void main(String[] args) {
            int max = -1;
            for (int i = 999; i >= 100; i--) {
                for (int j = 999; j >= 100; j--) {
                    int p = i * j;
                    if (max < p && isPalindrome(p)) {
                        max = p;
                    }
                }
            }
            System.out.println(max > -1 ? max : "No palindrome found");
        }
        public static boolean isPalindrome(int nr) {
            int rev = 0;
            int x = nr;
            while (x > 0) {
                rev = 10 * rev + x % 10;
                x /= 10;
            }
            return nr == rev;
        }
}

