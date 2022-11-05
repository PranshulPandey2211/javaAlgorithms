package conversions;

public class HexToOctal {
    public static int hexToOctal(String hex){
        int base = 1, dec = 0, oct = 0, count = 0;
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
        while (dec != 0) {
            int rem = dec % 8;
            oct += rem * (int) Math.pow(10, count++);
            dec /= 8;
        }
        return oct;
    }
    public static void main(String[] args) {
        System.out.println(hexToOctal("3A24E"));
    }
}
