package AS1T3;
import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        long n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter long Number: ");
        n = in.nextLong();
        System.out.println("Number of digits:" +countDigit(n));
        System.out.println("Sum of digits:" +SumOfDigits(n));
    }
    static int countDigit(long n) {
        int count = 0;
        while (n != 0) {
            //long res=0;
            n = n / 10;
            count=count+1;
        }
        return count;
    }
    static int SumOfDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }

    }

