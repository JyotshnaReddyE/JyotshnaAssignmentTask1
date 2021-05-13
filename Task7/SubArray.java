package AS1T7;

public class SubArray {
    int SubArray(int arr[], int n, int sum)
    {
        int curr_sum, i, j;
        for (i = 0; i < n; i++) {
            curr_sum = arr[i];
            for (j = i + 1; j <= n; j++) {
                if (curr_sum == sum) {
                    int p = j - 1;
                    System.out.println(
                            "Sum found between indexes " + i + " and " + p);
                    return 1;
                }
                if (curr_sum > sum || j == n)
                    break;
                curr_sum = curr_sum + arr[j];
            }
        }

        System.out.println("No sub-array found");
        return 0;
    }

    public static void main(String[] args)
    {
        SubArray arraysum = new SubArray();
        int arr[] = { 15, 2, 4, 7, 9, 5 };
        int n = arr.length;
        int sum = 6;
        arraysum.SubArray(arr, n, sum);
    }
}

