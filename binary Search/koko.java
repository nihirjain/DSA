public class koko {
    public static void main(String[] args) {
        int piles [] = {3,6,7,11};
        // int max = Max(piles);
        // System.out.println(Hours(piles, 3));
       System.out.println( Hours(piles, 3));
    }

    static int Hours(int [] arr1 , int speed){
        int hours = 0;
            for(int j=0;j<arr1.length;j++){
                if(arr1[j] > speed){
                    float rem = (float) arr1[j]/speed;
                    hours += Math.ceil(rem);
                }
                else{
                    hours += 1;
                }
            }
        return hours;
    }
    static int Max(int [] arr1){
        int max = arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] > max){
                max = arr1[i];
            }
        }
        return max;
    }
}
