package AS1T4;

public class PositiveNegative {
    public static void main(String args[]){
        int arr[]={-3,-2,-1,1,5,2,4};
        int low = 0;
        int high = arr.length-1;
        while(low<high)
        {
            if(arr[low]+arr[high]>0){
                high--;
            } else if(arr[low]+arr[high]<0) {
                low++;
            }else if(arr[low]+arr[high]==0){
                System.out.println("Pairs in a given array which are equal to zero: (" +arr[low]+ "," +arr[high]+")");
                low++;
                high--;
            }

        }
    }
}
