public class TableOfBinaryOctalAndHexadecimalNumbers_34 {
    public static void main(String[] args) {
        System.out.println("Decimal\tBinary\tOctal\tHexadecimal");
        for (int i = 1; i <= 256; i++) {
            System.out.println(i + "\t" + Integer.toBinaryString(i) + "\t" + Integer.toOctalString(i) + "\t" + Integer.toHexString(i));
        }
    }
}
