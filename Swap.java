package AS1T1;

public class Swap {

    public static void main(String[] args) {

        int x = 20, y = 37, z;
        // With third variable
        System.out.println("Values before swap: x,y = "+x+", "+y);
        z = x;
        x = y;
        y = z;
        System.out.println("Values after swap: x,y = "+x+", "+y);
        // Without third variable
        System.out.println("Values before swap: x,y = "+x+", "+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("Values after swap: x,y = "+x+", "+y);

    }
}
