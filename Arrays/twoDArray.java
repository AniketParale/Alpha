import java.util.*;
public class twoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];

        int n =3; //matrix.length--> gives rows
        int m =3; //matrix[0].length--> gives columns
        System.out.println("enter 9 elements- ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
