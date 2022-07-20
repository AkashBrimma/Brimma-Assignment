public class two {
        public static void main(String[] args) {
            int num1 = 0, num2 = 1, x = 0, sum = 0;
            do {
                if (num2 % 2 == 0) {
                    sum = sum + num2;
                }
                x = num1 + num2;
                num1 = num2;

                num2 = x;
            } while (num2 < 4000000);
            System.out.println(sum);
        }
    }

