package AS1T4;

import java.util.Arrays;

public class MovesZeros {
    public static void main(String[] args)
    {
        int[] arr= { 20,30,40,0,3,0,60,0,70 };
        MoveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void MoveZeros(int[] arr)
    {
        int j = 0;
        for (int i: arr)
        {
            if (i != 0) {
                arr[j++] = i;
            }
        }
        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}