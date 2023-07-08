public class HollowTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {// Print each row
            for (int j = n - 1; j >= i; j--) {// Print space for Pyramid shape
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j >= 1; j -= 2) {// print *
                if (i == n || (j == 1 || j == 2 * i - 1))
                    System.out.print(" *");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // move to next line
        }
    }
}
