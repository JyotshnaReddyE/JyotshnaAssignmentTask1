package AS1T5;

public class LengthOfShortestWord {
    public static void main(String[] args)
    {
        String string = "Trusted source for breaking news";
        String word = "", small = "";
        String[] words = new String[100];
        int length = 0;

        string = string + " ";

        for(int i = 0; i < string.length(); i++)
        {
            if(string.charAt(i) != ' ')
            {
                word = word + string.charAt(i);
            }
            else
            {
                words[length] = word;
                length++;
                word = "";
            }
        }
        small =  words[0];

        for(int k = 0; k < length; k++)
        {
            if(small.length() > words[k].length())
                small = words[k];
        }
        System.out.println("Smallest word: " + small);
    }
}
