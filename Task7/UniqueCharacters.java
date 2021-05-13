package AS1T7;
import java.util.*;
public class UniqueCharacters {
    boolean uniqueCharacters(String str)
    {
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;
        return true;
    }

    public static void main(String args[])
    {
        UniqueCharacters obj = new UniqueCharacters();
        String str = "Hey";

        if (obj.uniqueCharacters(str))
            System.out.println(str + " has all unique characters");
        else
            System.out.println(str +" has duplicate characters");
    }
}
