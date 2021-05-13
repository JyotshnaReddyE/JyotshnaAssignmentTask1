//Program to Count occurrences of each character in a string in java?
package AS1T7;

import java.util.Arrays;
import java.util.Scanner;

public class OccurrencesOfEachCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a String: ");
        String sen = in.nextLine();
        char[] c = sen.toCharArray();
        int l = c.length;
        for (int i = 0; i < l; i++) {
            int count = 0;
            for (int j = 0; j < l; j++) {
                if (j < i && c[i] == c[j]) {
                    break;
                }
                if (c[j] == c[i]) {
                    count++;
                }
                if (j == l - 1) {
                    System.out.println("occurrences of" + c[i] + "is" + count);
                }
            }
        }
    }
}
