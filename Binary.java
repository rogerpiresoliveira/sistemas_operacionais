public class Binary {
    public static String getBinaryOf(int number, int bits) {
        String format = "%".concat(String.valueOf(bits)).concat("s");
        String binary = Integer.toBinaryString(number);
        return String.format(format, binary).replaceAll(" ", "0");
    }
}
