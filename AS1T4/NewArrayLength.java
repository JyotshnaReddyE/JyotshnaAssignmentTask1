package AS1T4;

public class NewArrayLength {
    public static int NewArrayLength(int[] arr) {
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index - 1])
                arr[index++] = arr[i];
        }
        return index;
    }

    public static void main(String[] args)
    {
        int arr[] = {5, 4, 6, 6, 7, 7, 9, 9};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nNew array length is :" +NewArrayLength(arr));

    }
}
