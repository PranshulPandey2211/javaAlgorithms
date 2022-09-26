package strings;

public class StringPermutations{
    static int count;
    static void permute(String s, int l, int h){
        if(l == h)
            System.out.println(++count + ": " + s);
        else{
            for (int i = l; i <= h; i++){
                s = swap(s, l, i);
                permute(s, l+1, h);
                s = swap(s, l, i);
            }
        }
    }
    static String swap(String s, int i, int n){
        char temp;
        char c[] = s.toCharArray();
        temp = c[i];
        c[i] = c[n];
        c[n] = temp;
        return String.valueOf(c);
    }
    public static void main(String[] args){
        String S = "flux";
        int n = S.length();
        permute(S, 0, n-1);
    }
}