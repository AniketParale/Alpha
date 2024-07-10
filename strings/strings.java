//Strings are immutable
import java.util.*;
public class strings {

    //printing letters of string
    public static void printString(String str){
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
//        char arr[] = {'a','b','c','d'};
//        String str = "abcd";
//        String str2 = new String("aniket");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());//length of string

        //charAt function
        System.out.println(name.charAt(0));

        //printing letters of string
        printString(name);
    }
}
