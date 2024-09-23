// // // find maximum consecutive Zeroes

// // /**
// //  * javalecture
// //  */
// // public class javalecture {

// //     public static void main(String[] args) {
// //         int arr [] = {1,1,1,1,0,0,0,0,1,0,0,0,0,0,1,1,1};
// //         int maxlen = 0;
// //         int len = 0;
        
// //             for(int j=0;j<arr.length;j++){
// //                 if(arr[j] == 0){
// //                     len++;
// //                     maxlen = Math.max(maxlen, len);
// //                 }
// //                 else{
// //                     len = 0;
// //                 }
// //             }
// //             System.out.println(maxlen);
// //     }
// // }


// //Maximum subarray sum 

// import java.util.Scanner;

// /**
//  * javalecture
//  */
// public class javalecture {

//     public static void main(String[] args) {
//         int [] arr = new int[10];
//         Scanner sc = new Scanner(System.in);
        
//         for(int i=0;i<10;i++){
//             arr[i] = sc.nextInt();
//         }

//         // Demo array
//         // int arr1 [] = {1,1,1,-2,3,-4,5,-6,2,3};
//         //We have to find the maximum sum of the subarray in this
//         int sum = 0;
//         int maxsum = 0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 sum += arr[j];
//                 maxsum = Math.max(maxsum,sum);

//             }
//             sum = 0;

//         }
//         System.out.println(maxsum);

//     }
// }



// maximum appeared number in the array 

// this approach space complexity is very high

import java.util.Arrays;

/**
 * javalecture
 */
public class javalecture {

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,4,5};
        int [] arr1 = new int[10];
        // initially assign all the element in the arr1 as Zero 
        for(int i=0;i<arr1.length;i++){
            arr1[i] = 0;
        }
        for(int i=0;i<arr.length;i++){
            arr1[arr[i]] += 1;
        }
        System.out.printf(Arrays.toString(arr1));
        
    }
}
