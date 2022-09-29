package strings;

public class PangramString {
    public static boolean pangram(String s){
        int c[] = new int[26];
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != ' ')
                c[s.charAt(i) - 'a']++;
        int flag = 0;
        for (int i = 0; i < 26; i++){    
            if (c[i] == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            return false;
        else
            return true;

    }
    public static void main(String args[]){
        String str = "The quick brown fox jumps over the Lazy dog";
        System.out.println(pangram(str.toLowerCase()));
    }
}