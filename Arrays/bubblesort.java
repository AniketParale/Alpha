import java.util.*;
public class bubblesort {

    public static int[] bubbleSort(int arr[]){
        int temp;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){

                if (arr[j]<arr[i]){
                    temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        printArray(arr);
        return arr;
    }
    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array- ");
        int arraySize = sc.nextInt();
        int arr[] = new int[arraySize];
        System.out.print("enter " + arraySize + " elements in array- ");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int sortedArray[] = new int[arraySize];
        bubbleSort(arr);

    }
}
