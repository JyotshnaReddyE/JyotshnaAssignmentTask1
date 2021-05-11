package AS1T5;

import java.util.Arrays;

public class HighestLowest {
    public static void main(String[] args) {
        int numbers[] = {3,5,9,7,6,2};
        sum(numbers);
        System.out.println(sum(numbers));
    }
    public static int sum(int[] numbers) {
        if (numbers==null || numbers.length<3) return 0;
        java.util.Arrays.sort(numbers);
        int sum = 0;
        for(int i=1;i<numbers.length-1;i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
