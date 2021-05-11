package AS1T5;

import java.util.Arrays;
public class TrueFalse {
    static boolean is_isogram(String str)
    {
        str = str.toLowerCase();
        int len = str.length();
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str1 = "Teaching";
        System.out.println(is_isogram(str1));

        String str2 = "Expertise";
        System.out.println(is_isogram(str2));
    }
}
