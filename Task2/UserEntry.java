package AS1T2;

import java.util.Scanner;

public class UserEntry {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int First = val.nextInt();
        System.out.println("Enter a number: ");
        int Second = val.nextInt();
        System.out.println("Enter which operation would you like to perform(Addition-->+, Subtraction-->-, Division-->/, Multiplication-->*, Average-->avg) ");
        char op = val.next().charAt(0);
        switch (op)
        {
            case '+':
               int  result = First+Second;
               break;
            case '-':
                 result = First-Second;
                break;
            case '*':
                result = First*Second;
                break;
            case '/':
                result = First/Second;
                break;
            default:
                System.out.println("Please enter a valid operator");
        }
        System.out.println("Enter a number: ");
        int First1 = val.nextInt();
        System.out.println("Enter a number: ");
        int Second2 = val.nextInt();
    }
}
