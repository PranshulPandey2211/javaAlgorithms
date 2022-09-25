package strings;

public class CharacterFrequency{
    public static void frequency(String s){
        int count[] = new int[s.length()];
        char c[] = s.toCharArray();
        for(int i = 0; i <s.length(); i++){
            count[i] = 1;
            for(int j = i+1; j <s.length(); j++){
                if(c[i] == c[j]){
                    count[i]++;
                    c[j] = '0';
                }
            }
        }
        for(int i = 0; i <count.length; i++){
            if(c[i] != ' ' && c[i]!='0')
                System.out.print(c[i] + ": " + count[i]+"\t");
        }
    }
    public static void main(String[] args) {
        String S = "Hello World";
        frequency(S);
    }
}
