public class Test {

    public static String leftRotate(String str, int d) {
        // Write you code here.
        StringBuffer sb = new StringBuffer();
        String s = str.substring(0, d);
        sb.append(str.substring(d, str.length()));
        sb.append(s);
        return sb.toString();
    }

    public static String rightRotate(String str, int d) {
        // Write you code here.
        StringBuffer sb = new StringBuffer();
        String s = str.substring(str.length() - d, str.length());
        sb.append(s);
        sb.append(str.substring(0, str.length() - d));
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello";
        int d = 1;
        String lop = leftRotate(str, d);
        String rop = rightRotate(str, d);
        System.out.println(lop);
        System.out.println(rop);

    }

}
