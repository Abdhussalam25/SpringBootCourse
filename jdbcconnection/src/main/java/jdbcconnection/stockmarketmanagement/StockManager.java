package jdbcconnection.stockmarketmanagement;

public interface StockManager {

	void addStockRecord(Stock stk);
	void modStockRecord(Stock stk);
	void delStockRecord(int stockId);
	void showAllStockRecords();
	void showStockRecoverdById(int stockId);
	
	
}
