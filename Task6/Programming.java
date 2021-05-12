package AS1T6;

public class Programming {
    String s;
    String s1;
    public Programming(){
        s = "I love programming languages";
    }
    public Programming(String s1){
        s1 = s;
    }
    public static void main(String[] args){
        Programming p = new Programming();
        System.out.println(p.s);
        p.s1="Java";
        System.out.println("I love " +p.s1);
    }
}
