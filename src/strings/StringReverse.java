package strings;

public class StringReverse {
    public static String reverse(String s){
        char c[] = s.toCharArray();
        String reverseString = "";
        for(int i=c.length-1; 0<=i; i--)
            reverseString +=c[i];
        return reverseString;
    }
    public static void main(String[] args) {
        System.out.println(reverse("The quick brown fox jumps over the lazy dog."));
    }
}
