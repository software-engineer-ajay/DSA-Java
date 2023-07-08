public class ReverseNumberTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Number
            for (int k = i; k <= n; k++) {
                System.out.print(" " + k);
            }
            System.out.println();
        }
    }
}
