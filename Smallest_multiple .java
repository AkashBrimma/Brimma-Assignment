/*5. 2520 is the smallest number that can be divided by each of the numbers from 1 to 10
        without any remainder.
        What is the smallest positive number that is evenly divisible by all of the numbers
        from 1 to 20?
        Ans: 232792560*/

public class Smallest_multiple {
    public static void main(String[] args) {
        final int start = 3, step = 20;
        for (int i = step;; i += step) {
            boolean allValues = true;
            for (int k = start; k < step; k++) {
                if (i % k != 0) {
                    allValues = false;
                    break;
                }
            }
            if (allValues) {
                System.out.println(i);
                break;
            }
        }

    }
}
