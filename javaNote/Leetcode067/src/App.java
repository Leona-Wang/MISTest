public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String a="10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b="110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        Solution s= new Solution();

        System.out.println(s.addBinary(a, b));
    }
}
