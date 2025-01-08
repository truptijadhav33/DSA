

public class BuySellStocks{

    public static void maxprofit(int prices[])
    {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buyPrice<prices[i]) // calculate profit...
            {
                int profit=prices[i]-buyPrice;
                // calculate maximum profit
                maxProfit=Math.max(maxProfit,profit);
            }
            else{// buy stock n update buyPrice to today's price
                buyPrice=prices[i];
            }
        }
        System.out.println("Maximum profit: "+ maxProfit);
    }
    public static void main(String args[])
    {
        int prices[]={7,1,5,3,6,4};
        maxprofit(prices);
    }
}