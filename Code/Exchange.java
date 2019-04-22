public class Exchange {
    public static void main(String[] args) {
        System.out.println("十进制转二进制："  + Integer.toBinaryString(120));
        System.out.println("十进制转八进制："  + Integer.toOctalString(120));
        System.out.println("十进制转八进制："  + Integer.toHexString(120));
        System.out.println("二进制转八进制："  + Integer.valueOf("0101",2));
        System.out.println("八进制转十进制："  + Integer.valueOf("127",8));
        System.out.println("十六进制转十进制"  + Integer.valueOf("ABCD",16));
    }
}