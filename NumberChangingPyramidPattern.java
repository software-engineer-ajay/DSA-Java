public class NumberChangingPyramidPattern {
    public static void main(String[] args) {
        int n = 5;
        int ctr = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++, ctr++) {
                System.out.print(ctr + " ");
            }
            System.out.println();
        }
    }
}
