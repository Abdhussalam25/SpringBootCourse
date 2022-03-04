package jdbcconnection.stockmarketmanagement;

public class Stock {
	
	private int stockId;
	private String stockName;
	private float stockCurrPrice;
	private int stockMktCapital;
	public Stock() {
		super();
	}
	public Stock(int stockId, String stockName, float stockCurrPrice, int stockMktCapital) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.stockCurrPrice = stockCurrPrice;
		this.stockMktCapital = stockMktCapital;
	}
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
	public float getStockCurrPrice() {
		return stockCurrPrice;
	}
	public void setStockCurrPrice(float stockCurrPrice) {
		this.stockCurrPrice = stockCurrPrice;
	}
	public int getStockMktCapital() {
		return stockMktCapital;
	}
	public void setStockMktCapital(int stockMktCapital) {
		this.stockMktCapital = stockMktCapital;
	}
	@Override
	public String toString() {
		return "Stock stockId=" + stockId + ", stockName=" + stockName + ", stockCurrPrice=" + stockCurrPrice
				+ ", stockMktCapital=" + stockMktCapital ;
	}
	
	
	

}
