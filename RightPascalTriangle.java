public class RightPascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n* 2; i++) {
            if(i<n){
                for (int j = 0; j <= i; j++) {
                    if ((i + j) % 2 == 0)
                        System.out.print(" *");
                    else
                        System.out.print("  ");
                }
            } else {
                for (int j = 0; j < n * 2 - i-1; j++) {
                    if ((i + j) % 2 == 0)
                        System.out.print(" *");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
