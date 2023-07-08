public class MirrorImageTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Numbers
            for (int j = i; j <= n; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Numbers
            for (int j = n - i; j <= n; j++) {
                System.out.print(" " + (j));
            }
            System.out.println();
        }
    }
}
