public class HollowDiamondPyramid {
    public static void main(String[] args) {
        int n = 5, rows, columns;
        for (rows = 1; rows <= n; rows++) {
            for (columns = n; columns > rows; columns--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (columns = 1; columns < (rows - 1) * 2; columns++) {
                System.out.print(" ");
            }
            if (rows == 1) {
                System.out.println();
            } else {
                System.out.println("*");
            }
        }
        for (rows = n - 1; rows >= 1; rows--) {
            for (columns = n; columns > rows; columns--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (columns = 1; columns < (rows - 1) * 2; columns++) {
                System.out.print(" ");
            }
            if (rows == 1) {
                System.out.println();
            } else {
                System.out.println("*");
            }
        }
    }
}
