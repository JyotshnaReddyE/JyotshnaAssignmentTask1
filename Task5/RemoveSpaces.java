package AS1T5;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "This   is  the Place    to  learn";
        String str2 = str.replaceAll("\\s", "");
        System.out.println(str2);
    }}


