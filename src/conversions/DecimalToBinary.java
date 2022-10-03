package conversions;

public class DecimalToBinary{
    
    public static int decToBin(int n) {
        int bin = 0, count = 0, rem;
        while (n != 0) {
            rem = n % 2;
            bin = bin + rem * (int) Math.pow(10, count);
            n = n/2;
            count++;
        }
        return bin;
    }
    
    public static void main(String args[]){
        System.out.println(decToBin(38));
    }
}