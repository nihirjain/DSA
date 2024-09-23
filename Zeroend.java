//majority element in the array

/**
 * majority2
 */
// public class majority2 {

//     public static void main(String[] args) {
//         int arr[] = {1,1,1,2,3};
//         float majority = arr.length/2 ;
//         for(int i=0;i<arr.length;i++){
//             int len = 0;
//             int num = arr[i];
//             for(int j=0;j<arr.length;j++){
//                 if(arr[j] == num){
//                     len++;
//                 } 
//             }
//             if(len >= majority){
//                 System.out.println(num + " is the majority element");
//                 break;
//             }

//         }
        
//     }
// }


/**
 * majority2
 */

 //Moheres voting algorithm
// public class majority2 {

//     public static void main(String[] args) {
//         int arr [] = {2,1,2,1,2};
//         int majority = arr[0];
//         int k = 1;
//         for(int i=1;i<arr.length;i++){
//            if(arr[i] == majority){
//                 k++;
//            }
//            else{
//                 k--;
//            }
//            if(k==0){
//             majority = arr[i];
//             k = 1;
//            }
//         }
//         System.out.println(majority);
//     }
// }

// import java.util.Arrays;

// /**
//  * majority2
//  */
// //Move Zeroes to the end
// public class Zeroend {

//     public static void main(String[] args) {
//         int countzero = 0;
//         int arr[] = {1,1,0,1,0,1,0,0,3};
//         int poes = 0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i] == 0){
//                 poes = i;
//                 break;
//             }
//         }

//         for(int i=poes+1;i<arr.length;i++){
//             if(arr[i] != 0){
//                 Swap(i , poes ,arr);
//                 poes++;
//             }
//         }
//         System.out.println(Arrays.toString(arr));

//     }

//     static void Swap(int firstindex , int secondindex , int[] array){
//         int temp = array[firstindex];
//         array[firstindex] = array[secondindex];
//         array[secondindex] = temp;
//     }
// }


/**
 * element that does not appear in the array
 */
// public class Zeroend {

//     public static void main(String[] args) {
//         int arr1[] = {1,2,3,4,6};
//         int largest = arr1[0];
//         for(int i=0;i<arr1.length;i++){
//             if(arr1[i] > largest){
//                 largest = arr1[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }

/**
 * Zeroend
 */
// public class Zeroend {

//     public static void main(String[] args) {
//         int i = 123;

//         int temp = i;

//         int sum = 0;
//         int rem;
//         while(i != 0){
//             rem = i%10;
//             sum += rem;
//             i = i/10;
//         }
//         System.out.println(sum);
//     }
// }



/**
 * Zeroend
 */
// public class Zeroend {

//     public static void main(String[] args) {

//         int i = 163;

//         int temp = i;

//         int sum = 0;
//         int rem;
//         while(i != 0){
//             rem = i%10;
//             sum += cube(rem);
//             i = i/10;
//         }
//         if(sum == temp){
//             System.out.println("Armstong number");
//         }
//         else{
//             System.out.println("not a Armstong Number");
//         }
//     }

//     static int cube(int n){
//         int cuber = 1;
//         int i=0;
//         while (i<=2) {
//             cuber *=n;
//             i++;
//         }
//         return cuber;
//     }
// }

//Reverse of a number 

/**
 * Zeroend
 */
public class Zeroend {

    public static void main(String[] args) {
       //palindrome program

       int n = 123;
       int temp = n;
       int newnum = 0;
       int st = 100;
       while(n != 0){
            int rem = n%10;
            
            st = st/10;
            n=n/10;
       }
        System.out.println(newnum);
    }
}
