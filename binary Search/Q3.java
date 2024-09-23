/**
 * Q3
 */
public class Q3 {

    public static void main(String[] args) {
        //Upper Bound
        int arr[] = {1,1,2,2,3,4,5,6};
        int target = 2;
        int lb = upperbound(arr, target);
        System.out.println(lb);
    }
    static int upperbound(int [] arr , int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        //hypothetical upperbound is taken as n
        int ubound = n;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] > x){
                ubound = mid;
                high =  mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ubound;
    }
}