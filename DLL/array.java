public class array {
    public static void main(String[] args) {
        int arr [] = {3,4,5,6,1,2};
        int low = 0;
         int high = arr.length -1;
         int target = 2;
         int ans = -1;
         while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            }
            if(arr[low] <= arr[mid] ){
                if(arr[low]<= target && target<=arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid +1;
                }
            }
            else{
                if(arr[mid]<= target && target<=arr[high]){
                    low = mid +1;
                }
                else{
                    high = mid -1;
                }
            }
         }
         System.out.println(ans);
    }
}
