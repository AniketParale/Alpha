import java.util.*;
public class subarray {
    public static void subArray(int arr[]){
        int totalSubArrays = 0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<=arr.length;j++){
                System.out.print("( ");
                for (int k=i;k<j;k++){
                    System.out.print(arr[k]+" ");
                }
                totalSubArrays++;
                System.out.print(")");
            }
            System.out.println();
        }
        System.out.println("total sub arrays are "+totalSubArrays);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,6,8,10};
        subArray(arr);
    }
}

