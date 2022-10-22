package strings;

public class LongestSubstring {
    public static Boolean checkUnique(String s, int i, int j){
        boolean[] visited = new boolean[26];
        for(int k = i; k <= j; k++){
            if (visited[s.charAt(k) - 'a'] == true)
                return false;
            visited[s.charAt(k) - 'a'] = true;
        }
        return true;
    }
    public static int uniqueStr(String s){
        int len = 0;
        for(int i = 0; i < s.length(); i++)
            for(int j = i; j < s.length(); j++)
                if (checkUnique(s, i, j))
                    len = Math.max(len, j - i + 1);
        return len;
    }
    public static void main(String[] args){
        System.out.println(uniqueStr("hello"));
    }
}
