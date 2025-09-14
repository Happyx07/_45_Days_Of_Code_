package _08_Day;
public class _05_BuyandSellStocks {
  
  public static void main(String[] args) {
    int[] prices = {7,6,1,4,3,5};

    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int i = 0;i<prices.length;i++){

      minPrice = Math.min(prices[i],minPrice);
      maxProfit = Math.max(maxProfit,prices[i]-minPrice); 
    }

    System.out.println(maxProfit);
  }
}
