public class DiamondStarPattern {
    public static void main(String[] args) {
        int n = 5;
        int sp = n / 2;
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            sp--;
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sp = 1;
        for (int i = n / 2; i > 0; i--) {
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            sp++;
            for (int k = i * 2 - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}