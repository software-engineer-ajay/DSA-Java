public class HollowHourglassPattern {
    public static void main(String[] args) {
        int n = 5;
        // Upper
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                if (i == 0 || j == 1 || j == n - i)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = n - i - 1; j >= 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (i == n - 1 || j == 0 || j == i)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
