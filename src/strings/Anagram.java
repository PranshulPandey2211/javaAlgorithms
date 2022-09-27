package strings;

public class Anagram {
    static boolean anagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        else {
            int a[] = new int[26];
            int b[] = new int[26];
            int k = s.length();
            for (int i = 0; i < k; i++) {
                a[s.charAt(i) - 'a']++;
                b[t.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (a[i] != b[i])
                    return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println(anagram("silent", "listen"));
    }
}
