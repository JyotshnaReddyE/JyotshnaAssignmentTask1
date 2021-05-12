package AS1T6;

public class Students {
    String names;
    public Students(String n){
        names=n;
    }
    public Students(){
        names="unknown";
    }

    public static void main(String[] args){
       Students s1 = new Students("Jyotshna");
       Students s2 = new Students();
       System.out.println(s1.names);
       System.out.println(s2.names);
    }

}
