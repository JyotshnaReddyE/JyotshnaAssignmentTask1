package AS1T5;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a sentence: ");
        String sen = in.nextLine();
        sen = sen.trim();
        String result = "";
        char[] ch= sen.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i]+"";
        }
        System.out.println("Reverse word: "+result.trim());
    }
}