package QLCuaHang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnUltis_SQLJDBC {
	// (Sử dụng thư viện điều khiển SQLJDBC)
	 public static Connection getSQLServerConnection()
	         throws SQLException, ClassNotFoundException {
	     String hostName = "DESKTOP-M0UENE4"; // localhost
	     String sqlInstanceName = "DESKTOP-M0UENE4\\MSSQLSERVER01"; //desktopp
	     String database = "db_quanlyCH";
	     String userName = "sa1";
	     String password = "123";
	 
	     return getSQLServerConnection(hostName, sqlInstanceName,
	             database, userName, password);
	 }
	 
	 // Trường hợp sử dụng SQLServer.
	 // Và thư viện SQLJDBC.
	 public static Connection getSQLServerConnection(String hostName,
	         String sqlInstanceName, String database, String userName,
	         String password) throws ClassNotFoundException, SQLException {
	     // Khai báo class Driver cho DB SQLServer
	     // Việc này cần thiết với Java 5
	     // Java6 tự động tìm kiếm Driver thích hợp.
	     // Nếu bạn dùng Java6, thì ko cần dòng này cũng được.
	     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	     
	     // Cấu trúc URL Connection dành cho SQLServer
	     // Ví dụ:
	     // jdbc:sqlserver://ServerIp:1433/SQLEXPRESS;databaseName=simplehr
	     String connectionURL = "jdbc:microsoft:sqlserver://" + hostName + ":1433"
	             + ";instance=" + sqlInstanceName + ";databaseName=" + database;
	     
	 //    String ngoctrinh = "jdbc:microsoft:sqlserver://localhost:1433;databaseName=db_quanlyCH" + 
	 //    		"com.microsoft.jdbc.sqlserver.SQLServerDriver";
	 
	     Connection conn = DriverManager.getConnection(connectionURL, userName,
	             password);
	     return conn;
}
}
