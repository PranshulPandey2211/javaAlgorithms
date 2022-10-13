package conversions;

public class OctalToDecimal {
    public static int octToDec(int oct) {
        int dec = 0;
        for(int i = 0; oct!=0; i++){
            dec += oct % 10 * Math.pow(8, i);
            oct = oct / 10;
        }
        return dec;
      }
    public static void main(String[] args){
        System.out.println(octToDec(153451364));
    }
}
