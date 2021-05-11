package AS1T5;

public class Convert {
    public static String ConvertCase(String str)
    {
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++)
        {
            c[i] = Character.isUpperCase(c[i])
                    ? Character.toLowerCase(c[i])
                    : Character.toUpperCase(c[i]);
        }
        return new String(c);
    }

    public static void main(String[] args)
    {
        String str = "HEllO woRlD";
        System.out.println(ConvertCase(str));
    }
}
