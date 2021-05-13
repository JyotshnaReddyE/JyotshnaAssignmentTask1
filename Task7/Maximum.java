package AS1T7;

public class Maximum {
    public static void main(String[] args){
        int arr[]= {10,11,3,5,7,20,2,6,9};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum element in the given array is:" +max);
    }
}
