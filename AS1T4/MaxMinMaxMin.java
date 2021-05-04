package AS1T4;
import java.util.Arrays;

public class MaxMinMaxMin {
    static int[] rearrange(int[] new_arr, int n) {
        int temp[] = new int[n];

        int small_num = 0, large_num = n - 1;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (flag)
                temp[i] = new_arr[large_num--];
            else
                temp[i] = new_arr[small_num++];

            flag = !flag;
        }

        return temp;
    }

    public static void main(String[] args) {
        int num[] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int result[];

        System.out.println("Given Array ");
        System.out.println(Arrays.toString(num));

        result = rearrange(num, num.length);

        System.out.println("New Array ");
        System.out.println(Arrays.toString(result));

    }
}
