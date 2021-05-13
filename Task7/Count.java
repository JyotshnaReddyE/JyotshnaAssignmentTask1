package AS1T7;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a String: ");
        String sen = in.nextLine();
        char[] c = sen.toCharArray();
        int count=0;
        for(int i=0;i<sen.length();i++){
            count++;
        }
        System.out.println("The number of words in the given string is:" +count);
    }
}
