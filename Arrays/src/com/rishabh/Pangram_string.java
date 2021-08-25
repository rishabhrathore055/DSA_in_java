import java.util.Scanner;

public class Pangram_string {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(checkIfPangram(s));
    }
    public static boolean checkIfPangram(String sentence) {
        boolean[] check = new boolean[26];
        for(int i=0; i<26; i++){
            check[i]=false;
        }
        for(int i=0; i<sentence.length(); i++){
            int n = sentence.charAt(i);
            check[(n-97)] = true;
        }
        for(int i=0; i<26; i++){
            if(!check[i]) return false;
        }
        return true;
    }
}
