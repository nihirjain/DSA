public class Q5 {
    //floor and ceil value

    // floor value means the largest value <= x
    //ceil value means the smallest value >=x

    public static void main(String[] args) {
        int arr [] = {10 ,20 ,30 ,40,50};
        int target = 25;
        int fl = Floor(arr, target);
        int cl = ceil(arr, target);
        System.out.printf("floor is "+ arr[fl] + "\n");
        System.out.printf("ceil is "+ arr[cl]);
    }

    static int ceil(int [] arr , int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ceil = n;
        
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= x){
                ceil = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ceil;
    }
    static int Floor(int [] arr , int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int floor = n-1;
        
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] <= x){
                floor = mid;
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return floor;
    }
}
