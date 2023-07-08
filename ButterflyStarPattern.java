public class ButterflyStarPattern {
    static void go(int n) {
        // take input n and generate n X 2 -1 pattern
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                if (j > i && j < (n - 1) * 2 - i)
                    System.out.print("   ");
                else
                    System.out.print("*  ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                if (j > (n - 1) - i && j < (n - 1) + i)
                    System.out.print("   ");
                else
                    System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        go(n);

    }
}
