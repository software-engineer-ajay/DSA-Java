public class HollowReverseTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                // if (i == 0 || j == 0 )
                if (i == 0 || j == 0 || j == n - i - 1)

                    System.out.print(" *");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
