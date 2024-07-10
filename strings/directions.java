import java.util.*;

public class directions {
    public static void shortestDistance(String str){
        float x=0;
        float y=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='E'){
                x+=1;
            }else if (str.charAt(i)=='W') {
                x-=1;
            } else if (str.charAt(i)=='N') {
                y+=1;
            } else if (str.charAt(i)=='S') {
                y-=1;
            }
        }

        double shortestPath = 0;
        shortestPath = Math.sqrt((x*x)+(y*y));
        System.out.println(shortestPath);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string to give directions(EWNS)- ");
        String str = sc.next();

        shortestDistance(str);
    }
}
