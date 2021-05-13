package AS1T7;
import java.util.*;
public class NonRepeatedCharacter {
    public static void main(String[] args) {
        String s = "bubbakoos";
        System.out.println("The given string is: " + s);
        for (int i = 0; i < s.length(); i++) {
            boolean nrc = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    nrc = false;
                    break;
                }
            }
            if (nrc) {
                System.out.println("The first non repeated character in String is: " + s.charAt(i));
                break;
            }
        }
    }
}
