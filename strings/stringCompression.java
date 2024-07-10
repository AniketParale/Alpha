import java.util.*;
public class stringCompression {
    public static String stringCompression(String str){
//        String newStr = "";
        StringBuilder newStr = new StringBuilder("");

        for (int i=0;i<str.length();i++){
            Integer count =1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if (count>1){
                newStr.append(count.toString());
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string - ");
        String str = sc.next();
        String result = stringCompression(str);
        System.out.println(result);

    }
}
