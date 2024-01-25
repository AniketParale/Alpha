import java.util.*;
public class reversearray {
    public static void reverseArray(int arr[]){
        int first = 0;
        int last = arr.length-1;
        while (first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        printArray(arr);
    }
    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        reverseArray(arr);
    }
}
