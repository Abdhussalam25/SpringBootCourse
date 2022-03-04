package jdbc.sms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StockManagerImpl implements StockManager{
	
	

	public void addStockRecord(Stock stk) {
		Connection con=null;
		PreparedStatement pstmt=null;
	
		
		String query="insert into stock(stockname,stockcurrprice,stockmktcapital) values"
				+ "(?,?,?)";
		con=DbUtil.getConnection();
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,stk.getStockName());
			pstmt.setFloat(2,stk.getStockCurrprice());
			pstmt.setInt(3,stk.getStockMktCapital());
			int i=pstmt.executeUpdate();
			if(i>0)
				System.out.print("\nStock added successfully..");
			else
				System.err.print("\nprocess show error..");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void modStockRecord(Stock stk) {
		Connection con=null;
		PreparedStatement pstmt=null;
		String query="update stock set stockname=?,stockcurrprice=?,stockmktcapital=?"
				+ "where stockid=?";
		con=DbUtil.getConnection();
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,stk.getStockName());
			pstmt.setFloat(2,stk.getStockCurrprice());
			pstmt.setInt(3,stk.getStockMktCapital());
			pstmt.setInt(4, stk.getStockId());
			int i=pstmt.executeUpdate();
			if(i>0)
				System.out.print("\nStock modified successfully..");
			else
				System.err.print("\nprocess show error.. or stockId:"+stk.getStockId()+" provided is not found");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void delStockRecord(int stockId) {
		Connection con=null;
		PreparedStatement pstmt=null;
		String query="delete from stock where stockid=?";
		con=DbUtil.getConnection();
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, stockId);
			int i=pstmt.executeUpdate();
			if(i>0)
				System.out.print("\nStock having stockid:"+stockId+" deleted successfully..");
			else
				System.err.print("\nprocess show error.. or stockId:"+stockId+" provided is not found");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	public void showAllStockRecords() {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String query="select * from stock";
		con=DbUtil.getConnection();
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			Stock stk=new Stock();
			while(rs.next()) {
				stk.setStockId(rs.getInt(1));
				stk.setStockName(rs.getString(2));
				stk.setStockCurrprice(rs.getFloat(3));
				stk.setStockMktCapital(rs.getInt(4));
				System.out.print(stk);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void showStockRecordById(int stockId) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String query="select * from stock where stockid=?";
		con=DbUtil.getConnection();
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, stockId);
			rs=pstmt.executeQuery();
			Stock stk=new Stock();
			if(rs.next()) {
				stk.setStockId(rs.getInt(1));
				stk.setStockName(rs.getString(2));
				stk.setStockCurrprice(rs.getFloat(3));
				stk.setStockMktCapital(rs.getInt(4));
				System.out.print(stk);
			}else {
				System.err.print("\nprocess show error.. or stockId:"+stockId+" provided is not found");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
