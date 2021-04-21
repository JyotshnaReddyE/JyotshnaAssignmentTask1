package AS1T2;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("Enter a positive or negative number: ");
        int i = val.nextInt();
        while (i!=0){
            if(i>0) {
                System.out.println("Going Good");
            }else if(i<0)
                    System.out.println("It's Over");
                    break;
            }
        }
}
