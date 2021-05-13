package AS1T7;

public class Armstrong {
    public static void main(String[] args)  {
        int n = 371;
        int c=0, temp, r;
        temp = n;
        while (n>0){
            r = n%10;
            c = c+(r*r*r);
            n=n/10;
        }
        if(temp==c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }
}
