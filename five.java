public class five {
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
