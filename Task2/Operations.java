package AS1T2;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
    Scanner val = new Scanner(System.in);
    System.out.println("Choose an op: (Addition-->1, Subtraction--> 2,Division--> 3, Multiplication-->4, Average-->5) ");
    char op = val.next().charAt(0);
    System.out.println("Enter First number: ");
    int First = val.nextInt();
    System.out.println("Enter Second number: ");
    int Second = val.nextInt();
    switch (op)
    {
        case '1':
            int  result = First+Second;
            System.out.println("The output is:" +result);
            break;
        case '2':
            result = First-Second;
            System.out.println("The output is:" +result);
            break;
        case '3':
            result = First*Second;
            System.out.println("The output is:" +result);
            break;
        case '4':
            result = First/Second;
            System.out.println("The output is:" +result);
            break;
        case '5':
            System.out.println("Enter First1 number: ");
            int First1 = val.nextInt();
            System.out.println("Enter Second2 number: ");
            int Second2 = val.nextInt();
            result = (First+Second+First1+Second2)/4;
            System.out.println("The output is:" +result);
            break;

        default:
            System.out.println("Oops optionX(1/2/3/4/5/) is returning the negative number");
    }
}
}
