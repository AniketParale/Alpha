import java.util.*;
public class searchInSortedMatrix {
    public static void searchInMatrix(int matrix[][], int key){
        int row=0, col=matrix[0].length-1;//start searching from top right corner
        while (row<matrix.length && col>=0){
            if (matrix[row][col]==key){
                System.out.println("found at position ("+row+","+col+")");
                return;
            }
            else if (key<matrix[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("key not found");
        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]= {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};

        int key=37;
        searchInMatrix(matrix,key);
    }
}
