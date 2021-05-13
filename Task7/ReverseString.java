//Program to reverse a string in java
package AS1T7;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a String: ");
        String s = in.nextLine();
        s = s.trim();
        String result = "";
        char[] ch= s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i]+"";
        }
        System.out.println("Reverse String: "+result.trim());
    }
}
