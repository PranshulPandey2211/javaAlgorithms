package strings;

public class Palindrome {
    public static String palindrome(String s){
        String rev = "";
        for(int i = s.length()-1; 0 <= i; i--)
            rev += s.charAt(i);
        if(s.equals(rev))
            return "is a palindrome";
        else
            return "is not a palindrome";
    }
    public static void main(String[] args){
        String S = "123321";
        System.out.println(S + " " + palindrome(S));
    }
}