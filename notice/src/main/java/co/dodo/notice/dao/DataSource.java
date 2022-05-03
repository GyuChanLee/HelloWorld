package co.dodo.notice.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource // 싱글톤
{
	// 기본적인 싱글톤 패턴 > 1. 인스턴스 생성, 2. 생성자 private화, 3.getInstance()
	private static DataSource dataSource = new DataSource();
	private DataSource() {};
	
	private Connection conn;
	private String driver;
	private String url;
	private String user;
	private String pw;
	
	public static DataSource getInstance()
	{
		return dataSource;
	}
	
	public Connection getConnection() // 커넥션 연결
	{
		dbConfig();
		try
		{
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,pw);
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	
	private void dbConfig()
	{
		Properties properties = new Properties();
		String resource = getClass().getResource("/db.properties").getPath();
		try
		{
			properties.load(new FileInputStream(resource));
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			pw = properties.getProperty("pw");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
