//import java.util.Arrays;
import java.util.*;
public class inbuiltSorting {
    public static void printArray(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,8,2,1,9};
        Arrays.sort(arr);


//        Arrays.sort(arr,0,3);
//        here you can specify the index number from where to where you want to sort array


//        to use Collections.reverseOrder() you have to change int arr[] to Integer arr[]
//        Arrays.sort(arr,Collections.reverseOrder());



        printArray(arr);
    }
}
