package AS1T4;

public class SumPairs {
    public static void main(String args[]){
        int arr[]={1,2,4,5,6};
        int target = 6;
        int low = 0;
        int high = arr.length-1;
        while(low<high)
        {
            if(arr[low]+arr[high]>target){
                high--;
            } else if(arr[low]+arr[high]<target) {
                low++;
            }else if(arr[low]+arr[high]==target){
                System.out.println("Pairs in a given array which are equal to given target: (" +arr[low]+ "," +arr[high]+")");
                low++;
                high--;
            }

        }
    }
}
