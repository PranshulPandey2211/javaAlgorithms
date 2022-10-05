package conversions;

public class DecimalToHexadecimal{
    static void decToHex(int n){
        int hex[] = new int[100];
        int i = 0;
        while (n != 0) {
            hex[i++] = n % 16;
            n = n / 16;
        }
        for (int j = i - 1; 0 <= j; j--){
            if (hex[j] > 9)
                System.out.print((char)(55 + hex[j]));
            else
                System.out.print(hex[j]);
        }
    }
    public static void main(String[] args){
        decToHex(867503);
    }
}
