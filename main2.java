//Revision of all the Previous Questions
//How to find largest element 
/**
 * main2
 */
public class main2 {

    public static void main(String[] args) {
        int arr[] = {344,435,12,43,5324,443,2,34,3445,66,77,8,90,4355};
        int largest = arr[0];
        int secondlargest = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] >largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] >secondlargest){
                secondlargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondlargest);
    }
}
