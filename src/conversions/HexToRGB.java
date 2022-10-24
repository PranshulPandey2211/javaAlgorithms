package conversions;

public class HexToRGB {
    public static int hexToDec(String hex){
        int base = 1;
        int dec = 0;
        for (int i = hex.length() - 1; 0 <= i; i--) {
            if (hex.charAt(i) >= '0' && hex.charAt(i) <= '9') {
                dec += (hex.charAt(i) - 48) * base;
                base = base * 16;
            }
            else if (hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F') {
                dec += (hex.charAt(i) - 55) * base;
                base = base * 16;
            }
        }
        return dec;
    }
    public static void hexToRGB(String hex){
        int r = hexToDec(hex.substring(1, 3));
        int g = hexToDec(hex.substring(3, 5));
        int b = hexToDec(hex.substring(5, 7));
        System.out.println("rgb(" + r + ", " + g + ", " + b + ")");
    }
    public static void main(String[] args) {
        hexToRGB("#CFB095");
    }
}
