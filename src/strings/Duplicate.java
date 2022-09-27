package strings;

public class Duplicate {
    static void duplicates(String s){
        int max = Character.MAX_VALUE;
        System.out.println(max);
        int c[] = new int[max];
        count(s, c);
        for (int i = 0; i < max; i++)
            if(c[i] > 1)
                System.out.printf("%c appears %d times\n", i,  c[i]);
    }
    static void count(String s, int c[]){
        for (int i = 0; i < s.length();  i++)
            c[s.charAt(i)]++;
    }
    public static void main(String[] args){
        duplicates("Hello Mississippi");
    }
}
