import java.util.*;
public class largestinarray {
    public static int largestInArray(int arr[]){
        int largestNum = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>largestNum){
                largestNum = arr[i];
            }
        }
        return largestNum;
    }
    public static int smallestInArray(int arr[]){
        int smallestNum = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<smallestNum){
                smallestNum = arr[i];
            }
        }
        return smallestNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array- ");
        int arraySize = sc.nextInt();
        int arr[] = new int[arraySize];
        System.out.print("enter "+arraySize+" elements in array- ");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int largestNumber = largestInArray(arr);
        System.out.println("largest number in array is "+largestNumber);
        int smallestNumber = smallestInArray(arr);
        System.out.println("smallest number is array is "+smallestNumber);
    }
}
