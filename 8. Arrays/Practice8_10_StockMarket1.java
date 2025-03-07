//To find the best time to buy and sell the stocks in the stock market

class Practice8_10_StockMarket1{
    public static int stockBuySell(int price[]){
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
	for(int i=0; i<price.length; i++){
		//case 1 : to calculate the profit 
		if(buyingPrice < price[i]){
			int profit = price[i] - buyingPrice;
			maxProfit = Math.max(maxProfit, profit);
		}else{
		//case 2 : if loss then update the buyingPrice with selling price 
		 buyingPrice = price[i];
		}
	}
	return maxProfit;
  }
	
	public static void main(String[] args){
		int price[] = {2,6,3,1,7,5};
		System.out.println("\n maxProfit is : "+stockBuySell(price)+"\n");
	}
}

