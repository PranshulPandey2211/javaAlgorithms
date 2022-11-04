package conversions;

public class HexToBinary {
	public static int hexToBin(String hex){
        int base = 1, dec = 0, bin = 0, count = 0;
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
        while (dec > 0) {
            int rem = dec % 2;
            bin = bin + rem * (int) Math.pow(10, count);
            dec = dec/2;
            count++;
        }
		return bin;
	}
	public static void main(String[] args) {
		System.out.println(hexToBin("3C"));
	}
}
