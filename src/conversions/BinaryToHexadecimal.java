package conversions;

public class BinaryToHexadecimal {
	public static int binToDec(long bin){
		int dec = 0, i = 0;
		while (bin > 0) {
			dec += Math.pow(2, i++) * (bin % 10);
			bin /= 10;
		}
		return dec;
	}
	public static String decToHex(long bin){
		int dec = binToDec(bin);
		char arr[] = {'A', 'B', 'C', 'D', 'E', 'F'};
		String hex = "";
		while (dec != 0){
			int rem = dec % 16;
			if (rem < 10)
				hex = rem + hex;
			else
				hex = arr[rem - 10] + hex;
			dec /= 16;
		}
		return hex;
	}
	public static void main(String[] args){
		System.out.println(decToHex(1011000011));
	}
}
