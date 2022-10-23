package conversions;

public class RGBToHex {
    static String decToHex(int n){
        char hex[] = new char[2];
        int i = 0;
        String hexStr = "";
        while (n > 0) {
            int temp = 0;
            temp = n % 16;
            if (temp < 10)
                hex[i] = (char) (temp + 48);
            else
                hex[i] = (char) (temp + 55);
            i++;
            n = n / 16;
        }
        if (i == 2) {
            hexStr += hex[0];
            hexStr += hex[1];
        }
        else if (i == 1) {
            hexStr = "0";
            hexStr += hex[0];
        }
        else if (i == 0)
            hexStr = "00";
        return hexStr;
    }
    static String rgbToHex(int R, int G, int B){
        if ((R >= 0 && R <= 255) && (G >= 0 && G <= 255) && (B >= 0 && B <= 255)) {
            String hexStr = "#";
            hexStr += decToHex(R);
            hexStr += decToHex(G);
            hexStr += decToHex(B);
            return hexStr;
        }
        else
            return "-1";
    }
    public static void main(String[] args){
        System.out.println(rgbToHex(117, 130, 115));
    }
}