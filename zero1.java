import java.util.Arrays;
import java.util.Scanner;

public class zero1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        System.out.println("Enter the number of cols");
        int m = sc.nextInt();
        int [][] matrix = new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int [] row = new int[n];
        int [] col = new int[m];
        for(int i=0;i<n;i++){
            row[i] = 1;
        }
        for(int j=0;j<m;j++){
            col[j] = 1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(row));
        System.out.println(Arrays.toString(col));
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                    if(row[i] == 0 || col[j] == 0){
                        matrix[i][j] = 0;
                    } 
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
