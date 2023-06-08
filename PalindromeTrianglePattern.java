public class PalindromeTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        int ctr = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            ctr = i;
            for (int k = 0; k < i - 1; k++) {
                System.out.print(ctr + " ");
                ctr--;
            }

            for (int k = 0; k < i; k++) {
                System.out.print(ctr + " ");
                ctr++;
            }
            System.out.println("");
        }
    }
}
