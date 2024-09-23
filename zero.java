
import java.util.*;
/**
 * SetZero
 */
public class zero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows \n");
        int n = sc.nextInt();
        System.out.println("Enter the number of cols \n");
        int m = sc.nextInt();
        int [][] matrix = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    SetRow(matrix , i , m);
                    SetCol(matrix ,j , n );                
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;             
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void SetRow(int [][] mat , int row , int cols ){
        for(int i=0;i<cols;i++){
            mat[row][i] = -1;
        }
    }
    static void SetCol(int [][] mat , int col , int rows ){
        for(int i=0;i<rows;i++){
            mat[i][col] = -1;
        }
    }
}