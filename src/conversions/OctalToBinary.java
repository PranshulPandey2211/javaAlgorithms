package conversions;

public class OctalToBinary {
	public static int octToBin(int oct){
		int dec = 0;
		int bin = 0;
        for(int i = 0; oct!=0; i++){
            dec += oct % 10 * Math.pow(8, i);
            oct = oct / 10;
        }
		for (int i=1 ; dec != 0; i *= 10) {
			bin += (dec % 2) * i;
			dec /= 2;
		}
		return bin;
	}
	public static void main(String[] args){
        System.out.println(octToBin(336));
	}
}
