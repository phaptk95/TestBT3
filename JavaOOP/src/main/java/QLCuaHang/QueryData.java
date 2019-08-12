package QLCuaHang;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.util.Properties;


import QLCuaHang.SQLServerConnUltis_SQLJDBC;
public class QueryData  {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection connection = SQLServerConnUltis_SQLJDBC.getSQLServerConnection();
		System.out.println("Get connection ... ");
		 

	     
	 
	      System.out.println("Get connection " + connection);
	 
	      System.out.println("Done!");
	  
      Statement statement = connection.createStatement();
	 
	      String sql = "Select id_hanghoa, ten_HangHoa, Gia_HangHoa from tbl_hanghoa";
	     // select tbl_hanghoa.ID_hanghoa,tbl_hanghoa.Ten_HangHoa, tbl_hanghoa.Gia_HangHoa from tbl_hanghoa
	   
	      ResultSet rs = statement.executeQuery(sql);
	 
	      
	      while (rs.next()) {
	         int HH_ID = rs.getInt(1);
	         String  HH_Ten = rs.getString(2);
	         int HH_Gia = rs.getInt(3);
	          System.out.println("--------------------");
	          System.out.println("ID:" + HH_ID);
	          System.out.println("Ten:" + HH_Ten);
	          System.out.println("Gia:" + HH_Gia);
	      }
	    
	      connection.close() ;
	  } 
	
	
	}


