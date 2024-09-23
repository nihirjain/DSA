public class Q2 {
    public static void main(String[] args) {
        //lower bound 

        //defination is arr[mid] >= x that index

        int arr[] = {1,1,2,2,3,4,5,6};
        int target = 3;
        int lb = lb(arr , target);
        System.out.println(lb);
    }
    static int lb(int [] arr , int x){
        int n = arr.length;
        int low = 0;
        int high = n -1;

        int lowerbound = n;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= x){
                lowerbound = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }



        return lowerbound;
    }
}
