

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * removeduplicate
 */

// public class removeduplicate {

//     public static void main(String[] args) {
//         int arr[] = {1,1,1,2,2,2,3,4,4};
//         //remove duplicates from the sorted array
        
//         int pointer = 0;

//         for(int i=1;i<arr.length;i++){
//             if(arr[i] != arr[pointer] ){
//                 pointer++;
//                 swap(i , pointer , arr);
                
//             }
//         }
//         System.out.println(Arrays.toString(arr));
//     }

//     static void swap(int i1 , int i2 , int [] array){
//         int temp = array[i1];
//         array[i1] = array[i2];
//         array[i2] = temp;
//     }
// }

//Rotate an array




/**
 * removeduplicate
 */

 //rotate the array by 1 placce 


 
 /**
  * removeduplicate
  */
//  public class removeduplicate {
 
//     public static void main(String[] args) {
//         int array[] = {1,2,3,4,5};
//         int k = 1;
//         int temp = array[0];
//         for(int i=1;i<array.length;i++){
//             array[i-1] = array[i];
//         }
//         array[array.length - 1] = temp;
//         System.out.println(Arrays.toString(array));

//     }
//  }


/**
 * removeduplicate
 */

 //Rotate the matrix by two places
// public class d {


//     public static void main(String[] args) {
//         int array [] = {1,2,23,345,4,5,6};
//         int n = array.length;
//         int [] array1 = new int[2];
//         for(int i=0;i<2;i++){
//             array1[i] = array[i];
//         }
//         for(int i=2;i<array.length;i++){
//             array[i-2] = array[i];
//         }

//         for(int i=0;i<array1.length;i++){
//             array[n+i-2] = array1[i];
//         }
//         System.out.println(Arrays.toString(array));
//     }
    
// }


/**
 * d
 */
// public class d {

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         int n = arr.length;
//         Scanner sc = new Scanner(System.in);
//         int k = sc.nextInt()%n;
        
//         int [] arr1 = new int[k];
//         for(int i=0;i<k;i++){
//             arr1[i] = arr[i];
//         }
//         for(int i=k;i<n;i++){
//             arr[i-k] = arr[i];
//         }
//         for(int i=n-k;i<n;i++){
//             arr[i] = arr1[i-(n-k)];
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }



//union of two sorted array


/**
 * d
 */
// public class d {

//     public static void main(String[] args) {
//         int arr1[] = {1,1,2,2,3,4,5,5,6,7,78};
//         int arr2[] = {1,2,3,3,4,4,5,5,6,7,8,9,10};
//         ArrayList<Integer> union = new ArrayList<Integer>();
//         int n1 = arr1.length;
//         int n2 = arr2.length;
//         int p1 = 0;
//         int p2 = 0;

//         while (p1 < n1 && p2 < n2) {
//             if(arr1[p1] <= arr2[p2]){
//                 if(union.size() == 0 ||  arr1[p1] != union.get((union.size()-1))){
//                     union.add(arr1[p1]);
//                 }
//                 p1++;
//             }
//             else{
//                 if(union.size() == 0 ||arr2[p2] != union.get((union.size()-1))){
//                     union.add(arr2[p2]);
//                 }
//                 p2++;
//             }
//         }
//         while(p1<n1){
//             if(union.size() == 0 ||  arr1[p1] != union.get((union.size()-1))){
//                 union.add(arr1[p1]);
//             }
//             p1++;
//         }  
//         while(p2<n2){
//             if(union.size() == 0 ||arr2[p2] != union.get((union.size()-1))){
//                 union.add(arr2[p2]);
//             }
//             p2++;
//         }
//         System.out.println(union);

//     }
// }



/**
 * d
 */
import java.util.Scanner;
public class d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(n != 0){
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        System.out.println(rev);
    }
}