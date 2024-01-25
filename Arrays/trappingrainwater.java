import java.util.*;
public class trappingrainwater {
    public static int trapRainWater(int arr[]){

        int waterlevel=0;

        int leftmax[] = new int[arr.length];
        leftmax[0]= arr[0];
        for (int i=1;i<arr.length;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }

        int rightmax[] = new int[arr.length];
        rightmax[arr.length-1]=arr[arr.length-1];
        for (int i=arr.length-2;i>=0;i--){
            rightmax[i] = Math.max(arr[i],rightmax[i+1]);
        }

        for (int i=0;i<arr.length;i++){
            waterlevel += (Math.min(leftmax[i],rightmax[i])-arr[i]);
        }
        return waterlevel;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,2,0,6,3,2,5};
        int waterlevel = trapRainWater(arr);
        System.out.println("final waterlevel= "+waterlevel);
    }
}
