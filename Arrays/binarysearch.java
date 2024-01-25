import java.util.*;
public class binarysearch {
    public static int binarySearch(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start + end)/2;
            if (arr[mid]==key){
                return mid;
            }
            if (arr[mid]<key) {
                end = mid-1;
            }
            if (arr[mid]>key) {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7};
        int key = 4;
        int index = binarySearch(arr,key);
        if (index==-1){
            System.out.println("key not found");
        }
        else {
            System.out.println("key is found at "+index);
        }
    }
}
