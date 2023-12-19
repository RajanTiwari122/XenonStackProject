public class Buy_sellStocks {
    public static int Buy_sellStocks(int prices[]){
        int buyPrices=Integer.MAX_VALUE;
        int profit=0;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if (buyPrices<prices[i]){
                profit=prices[i]-buyPrices;
                maxProfit=Math.max(maxProfit, profit);

            }else{
                buyPrices=prices[i];
            }

        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(Buy_sellStocks(prices));
    }
    
}
