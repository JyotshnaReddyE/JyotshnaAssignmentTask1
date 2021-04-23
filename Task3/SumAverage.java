package AS1T3;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        float sum = 0;
        float avg = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number: ");
            int n = val.nextInt();
            sum = sum + i;
            avg = sum/10;
        }
        System.out.println("sum=" + sum);
        System.out.println("avg=" + avg);
    }
}
