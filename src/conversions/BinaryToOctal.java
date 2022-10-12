package conversions;

public class BinaryToOctal{
	public static int decToOct(int bin){
		int oct = 0, i = 0;
		int dec = binToDec(bin);
		while (dec != 0) {
			oct += (dec % 8) * ((int)Math.pow(10, i++));
			dec /= 8;
		}
		return oct;
	}
	public static int binToDec(int bin){
        int dec = 0, base = 1;
        while (bin > 0) {
            int rem = bin % 10;
            dec += rem * base;
            bin = bin / 10;
            base = base * 2;
        }
        return dec;
	}
	public static void main(String[] args){
		System.out.println(decToOct(1001011101));
	}
}