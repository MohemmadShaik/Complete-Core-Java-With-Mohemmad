//Stock Market Selling the stock for max profit or buying the best stock for the future 

public class Practice8_10_StockMarket{
	public static int bestStock(int prices[]){
		int buyingPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		//Key note : selling price = prices[];
		for(int i=0; i<prices.length; i++){
			if(buyingPrice<prices[i]){
				int profit = prices[i] - buyingPrice;
				maxProfit = Math.max(maxProfit, profit);
			
			}else{
				buyingPrice = prices[i];
			}
		}
		System.out.print("\nMax Profit : ");
			return maxProfit;
		}
	public static void main(String args[]){
		int prices[] = {7,1,5,3,6,4};
		System.out.println(bestStock(prices)+"\n");
	}
}