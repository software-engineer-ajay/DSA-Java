public class PascalsTriangle {

    static int binomialCoeff(int n, int k) {
        int res = 1;

        if (k > n - k)
            k = n - k;

        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + binomialCoeff(i, j));
            }
            System.out.println();
        }
    }
}
