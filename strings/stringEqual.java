public class stringEqual {
    public static void main(String[] args) {
        String s1 = "Aniket";
        String s2 = "Aniket";
        String s3 = new String("Aniket");

//        if (s1 == s2){//equal
//            System.out.println("equal");
//        }else {
//            System.out.println("not equal");
//        }
//
//        if (s1 == s3){//not equal
//            System.out.println("equal");
//        }else {
//            System.out.println("not equal");
//        }

        //equals functions checks the value hence it is equal
        //in if condition object is compared
        if (s1.equals(s3)){//equal
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }
}
