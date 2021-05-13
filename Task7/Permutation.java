package AS1T7;

public class Permutation {
    public static void main(String[] args)
    {
        String s = "abc";
        System.out.println("Given String::" +s);
        System.out.println("After Permutation");
        PrintPermutation(s, "");

    }
    static void PrintPermutation(String str, String a){
        if(str.length()==0){
            System.out.println(a);
            return;
        }
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            String r = str.substring(0,i)+str.substring(i+1);
            PrintPermutation(r, a+c);
        }
    }
}
