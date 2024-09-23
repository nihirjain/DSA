// //Revision

// // Missing number 

// /**
//  * Revision
//  */
// public class Revision {

//     public static void main(String[] args) {
//         int arr [] = {1,2,4,5};
//         //using Brute force approach 
//         // In this approch i will using nested loops
//         // first we will find out the largest element in the arr
//         // for finding the largest element wwe firstly assign the first element of the array as largest
//         int largest = arr[0];
//         int missingno = 0;
//         //looping inside the array
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>largest){
//                 largest = arr[i];
//             }
//         }
//         //looping to the largest element
//         for(int i=1;i<=largest;i++){
//             int flag = 0;
//             // linear Swarch inside the array
//             for(int j=0;j<arr.length;j++){
//                 if(i == arr[j]){
//                     flag = 1;
//                     break;
//                 }
//             }
//             if(flag == 0){
//                 missingno = i;
//             }
//         }
//         System.out.println(missingno);

//     }
// }


// Second approach 
// By using Hashing

// import java.util.Arrays;

// /**
//  * Revision
//  */
// public class Revision {

//     public static void main(String[] args) {
//         //To use hasig we want to find out the largest element inside the array
//         //To find the largest element will be using the method which is assigning the first element as largest
//         //Then loop through the array
//         int arr[] = {1,2,4,5};
//         int missingno = 0;
//         int largest = arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i] > largest){
//                 largest = arr[i];
//             }
//         }
//         int []  hash = new int[largest + 1];
//         // inserting all the element in hash array as Zero 
//         for(int i=0;i<arr.length;i++){
//             hash[i] = 0;
//         }
//         //In this step if we find the element then we hash into the array
//         for(int i=0;i<arr.length;i++){
//             hash[arr[i]] = 1;
//         }
//         System.out.println(Arrays.toString(hash));
//         //In this step lets start from the 1 and iterate therough the loop if we find any Zero value that position is out answer
//         for(int i=1;i<arr.length;i++){
//             if(hash[i] == 0){
//                 missingno = i;
//                 break;
//             }
//         }
//         System.out.println(missingno);
//     }
// }


/**
 * Revision
 */
//First Optimal Solution to find out the missing no 
// public class Revision {

//     public static void main(String[] args) {
//         int missingno = 0;
//         int arr[] = {1,2,3,5};
//         int largest = arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>largest){
//                 largest = arr[i];
//             }
//         }
//         int sum1 = (largest*(largest+1))/2;
//         int sum2 = 0;
//         for(int i=0;i<arr.length;i++){
//             sum2 += arr[i];
//         }
//         missingno = sum1-sum2;
//         System.out.println(missingno);
//     }
// }

//Second optimal approach to find the missing no in the array
/**
 * Revision
 */
// public class Revision {

//     public static void main(String[] args) {
//         int arr1[] = {1,2,4};
//         int largest = arr1[0];

//         int missingnum = 0;
//         int XOR1 = 0;
//         int XOR2=0;
//         for(int i=0;i<arr1.length;i++){
//             if(arr1[i] > largest){
//                 largest = arr1[i];
//             }
//         }
//         //In Xor the basic concept is XOR of pair of similar element is always is Equal to Zero
//         //Xor of Zero to Zero is Zero
//         //For loop in the arr1 to find out the xor of the all the elements in arr1 
//         for(int i=0;i<arr1.length;i++){
//             XOR1 = XOR1^arr1[i];
//         }
//         for(int i=1;i<=largest;i++){
//             XOR2 = XOR2^i;
//         }
//         missingnum = XOR1^XOR2;
//         System.out.println(missingnum);
//     }
// }


//find maximum no of consecutive ones in the array
// lets solve this question using brute force approch 
/**
 * Revision
 */
// public class Revision {

//     public static void main(String[] args) {
//         int arr [] = {1,1,0,1,1,1,0,0,1};
//         // To find the maximum no of consecutive ones we have to itrate in the 
//         int poes = 0;
//         int counter = 0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==1){
//                 counter++;
//                 if(counter > poes){
//                     poes = counter;
//                 }
//             }
//             else{
//                 counter = 0;
//             }
//         }
//         System.out.println(poes);
//     }
// }

import java.util.ArrayList;

/**
 * Revision
 */
public class Revision {

    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6};
        int b [] = {2,3,4};
        int n = a.length;
        int m = b.length;
         int i=0;
       int j=0;
       int n1 = a[i];
       int n2 = b[j];
       ArrayList <Integer> unionarr = new ArrayList<>();
       int size = unionarr.size();
       while(i<n && j<m){
           if(n1 < n2 && size-2>=0){
               if(unionarr.size() == 0 || unionarr.get(size-2) != n1 ){
                   unionarr.add(n1);
                   i++;
               }
           }
           else{
              if(unionarr.size() == 0 || unionarr.get(size-2) != n2){
                   unionarr.add(n2);
                   j++;
               }
           }
       }
       while(i<n){
               if(unionarr.size() == 0 || unionarr.get(size-2) != n1){
                   unionarr.add(n1);
                   i++;
               }
           }
           while(j<m){
            if(unionarr.size() == 0 || unionarr.get(size-2) != n2){
                   unionarr.add(n2);
                   j++;
            }
           }
           for(int k=0;j<unionarr.size();j++){
            System.out.println(unionarr.get(k));
           }
    }
    public static void back(String[] args) {
        
    }
}