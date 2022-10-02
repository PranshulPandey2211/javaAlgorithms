package strings;

public class LexicographicRank {
    public static int factorial(int n) {
        if(n <= 2)
            return n;
        else
            return n * factorial(n - 1);
    }
    public static int rank(String s, int n) {
        int pos = 1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j <= n; j++) {
                if (s.charAt(i) > s.charAt(j))
                    count++;
            }
            pos += count * factorial(n - i);
        }
        return pos;
    }
    public static void main(String[] args) {
        String S = "hello";
        System.out.print(rank(S, S.length() - 1));
    }
}
