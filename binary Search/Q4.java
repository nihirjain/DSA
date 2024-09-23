// // import java.util.Arrays;

// // public class Q4 {
// //     public static void main(String[] args) {
// //         //first and last occurance

// //         int arr [] = {1,2,2,3,3,4,5};
// //         int target = 3;
// //         // Brute force solution
// //         int [] arr1 = new int[2];
// //         for(int i=0;i<arr.length;i++){
// //             if(arr[i] == target){
// //                 arr1[0] = i; 
// //                 break;
// //             }
// //         }
// //         int pointer = arr1[0];

// //         while (arr[pointer] == target) { 
// //             arr1[1] = pointer;
// //             pointer++;
// //         }
// //         System.out.println(Arrays.toString(arr1));
// //     }
// // }

// import java.util.Arrays;

// /**
//  * Q4
//  */
// public class Q4 {

//     public static void main(String[] args) {
//         int arr [] = {1,3,4,4,5};
//         int target = 2;
//         int ub = ub(arr , target);
//         int lb = lb(arr, target);
//         System.out.println(lb);
//         System.out.println(ub);
//         int [] ans = new int[2];
//         if(lb == arr.length || arr[lb] != target){
//             ans[0] = -1;
//             ans[1] = -1;
//         }
//         else{
//             ans[0] = lb;
//             ans[1] = ub-1;
//         }
//         System.out.println(Arrays.toString(ans));
//     }

//     static int lb(int [] arr , int target){
//         int low = 0;
//         int n = arr.length;
//         int high = n-1;
//         int lowerbound = n;
//         while(low <= high){
//             int mid = (low + high)/2;
//             if(arr[mid] >= target){
//                 lowerbound = mid;
//                 high = mid - 1;
//             }
//             else{
//                 low = mid + 1;
//             }
//         }
//         return lowerbound;
//     }
//     static int ub(int [] arr , int target){
//         int low = 0;
//         int n = arr.length;
//         int high = n-1;
//         int upperbound = n;
//         while(low <= high){
//             int mid = (low + high)/2;
//             if(arr[mid] > target){
//                 upperbound = mid;
//                 high = mid - 1;
//             }
//             else{
//                 low = mid + 1;
//             }
//         }
//         return upperbound;
//     }
// }