package jdbc.sms;

public class Stock {
	private int stockId;	
	private String stockName; 
	private float stockCurrprice;    
	private int stockMktCapital;
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public float getStockCurrprice() {
		return stockCurrprice;
	}
	public void setStockCurrprice(float stockCurrprice) {
		this.stockCurrprice = stockCurrprice;
	}
	public int getStockMktCapital() {
		return stockMktCapital;
	}
	public void setStockMktCapital(int stockMktCapital) {
		this.stockMktCapital = stockMktCapital;
	}
	public Stock() {
	}
	public Stock(int stockId, String stockName, float stockCurrprice, int stockMktCapital) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.stockCurrprice = stockCurrprice;
		this.stockMktCapital = stockMktCapital;
	}
	@Override
	public String toString() {
		return "\nstockId=" + stockId + ", stockName=" + stockName + ", stockCurrprice=" + stockCurrprice
				+ ", stockMktCapital=" + stockMktCapital;
	}
	
	
	

}
