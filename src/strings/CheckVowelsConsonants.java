package strings;

public class CheckVowelsConsonants {
    public static void checkCharacter(String s){
        int vowels = 0, consonants = 0;
        s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else if (ch >= 'a' && ch <= 'z')
                consonants++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    public static void main(String[] args) {
        String S = "Hello World";
        checkCharacter(S);
    }
  }