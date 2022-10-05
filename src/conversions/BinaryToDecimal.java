package conversions;

public class BinaryToDecimal {
    public static int binToDec(int n){
        int dec = 0, base = 1;
        while (n > 0) {
            int rem = n % 10;
            dec += rem * base;
            n = n / 10;
            base = base * 2;
        }
        return dec;
    }
    public static void main(String[] args) {
        System.out.println(binToDec(1011010));
    }
}