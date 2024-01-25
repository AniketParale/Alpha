import java.util.*;
public class linearsearch {
    public static int linearSearch(int arr[], int key){

        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                System.out.println("value is found at index " +i);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter "+n+" elements in array-");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter value you want to search in array- ");
        int key = sc.nextInt();
        int search = linearSearch(arr,key);
        if (search==-1){
            System.out.println("value is not found");
        }
    }
}
