import java.util.*;
public class sumofsubarray {
    public static void sumOfSubArray(int arr[]){
        int maxSum = 0;
        int currentSum;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<=arr.length;j++){
                currentSum =0;
                for (int k=i;k<j;k++){
                    currentSum+=arr[k];
                }
                System.out.print(currentSum+" ");
                if (currentSum>maxSum){
                    maxSum = currentSum;
                }
            }
            System.out.println();
        }
        System.out.println("maximum sum of sub array is "+maxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,6,8,-10};
        sumOfSubArray(arr);
    }
}
