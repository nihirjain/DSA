public class Q1 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        int target = 3;
        int index = Search(arr, target);
        System.out.println(index);
    }
    static int Search(int [] arr , int tg){
        int low = 0;
        int high = arr.length -1;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == tg){
                return mid;
            }
            else if(arr[mid] < tg){
                low = mid +1;
            }
            else {
                high = mid - 1;
            }
        }


        return -1;
    }
}
