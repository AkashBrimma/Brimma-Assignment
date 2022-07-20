public class nine {
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
