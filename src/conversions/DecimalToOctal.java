package conversions;

public class DecimalToOctal {
    static void decToOct(int n){
        int oct[] = new int[100];
        int i = 0;
        while (n != 0) {
            oct[i++] = n % 8;
            n = n / 8;
        }
        for (int j = i - 1; 0 <= j; j--){
            System.out.print(oct[j]);
        }
    }
    public static void main(String[] args){
        decToOct(29043850);
    }
}
