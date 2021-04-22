package AS1T2;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("Enter a number : ");
        float i = val.nextFloat();
        if ( i>0){
            if (i < 1)
            {
                System.out.println("small");
            }
            else if (i > 1000000)
            {
                System.out.println("large");
            }
            else
            {
                System.out.println("Positive");
            }
        }else if(i<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}

