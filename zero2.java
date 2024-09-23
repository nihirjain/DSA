import java.util.Scanner;

public class zero2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int col = 1;
        int matrix[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j != 0){
                        matrix[0][j] = 0;
                    }
                    else{
                        col = 0;
                    }
{}                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
               if(matrix[i][0]==0 || matrix[0][j] == 0){
                matrix[i][j] = 0;
               }
            }
        }
        if(matrix[0][0] == 0){
            for(int i=0;i<m;i++){
                matrix[0][i] = 0;
            }
        }
        if(col == 0){
            for(int i=0;i<n;i++){
                matrix[i][0] = 0;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
