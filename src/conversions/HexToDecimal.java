package conversions;

public class HexToDecimal {
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
	public static void main(String[] args){
		System.out.println(hexToDec("BE4D5"));
	}
}
