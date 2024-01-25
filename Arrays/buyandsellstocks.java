import java.util.*;
public class buyandsellstocks {

    public static void buySellStocks(int priceArray[]){
        int buyingPrice=priceArray[0];
        int buyingIndex=priceArray[0];
        int profit = 0;
        int sellingPrice;

        for (int i=1;i<priceArray.length;i++){
            if (priceArray[i]<buyingPrice){
                buyingPrice = priceArray[i];
                buyingIndex = i;
            }
            else if (priceArray[i]-buyingPrice>profit){
                profit = priceArray[i]-buyingPrice;
            }
        }
        System.out.println(profit);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int priceArray[] = {7,1,5,3,6,4};
        buySellStocks(priceArray);
    }
}