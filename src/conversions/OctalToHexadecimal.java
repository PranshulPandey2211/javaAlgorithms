package conversions;

public class OctalToHexadecimal {
    public static void octToHex(int oct){
        int dec = 0;
        for(int i = 0; oct!=0; i++){
            dec += oct % 10 * Math.pow(8, i);
            oct = oct / 10;
        }
        String digits = "0123456789ABCDEF";
        String hex = "";
        while (dec > 0) {
            int decigit = dec % 16;
            hex = digits.charAt(decigit) + hex;
            dec = dec / 16;
        }
        System.out.println(hex);
    }
    public static void main(String[] args){
        octToHex(145037);
    }
}
