/**
 * revise
 */
public class revise {

    public static void main(String[] args) {
        int arr[]= {1,2,556,23,4,556};
        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];

            }
        }
        System.out.println(largest);
    }
}