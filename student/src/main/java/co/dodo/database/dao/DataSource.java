package co.dodo.database.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DataSource 
{
	// 싱글톤 class 패턴.
	private static DataSource dataSource = new DataSource(); // 자기자신을 객체로 만듬.
	private DataSource(){} // 외부에서 생성 못하도록 함.
	
	private Connection conn;
	private String driver;
	private String url;
	private String user;
	private String pw;
	
	public static DataSource getInstance()
	{
		return dataSource;
	}
	
	public Connection getConnection() // 자기자신의 객체를 리턴.
	{
		dbconfiguration();
		try 
		{
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("DB 연결 성공!!!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("DB 연결 실패!!!!");
		}
		return conn;
	}
	
	private void dbconfiguration() // properties파일로 jdbc 접속시 필요한 데이터 불러오기.
	{
		Properties properties = new Properties();
		try
		{
			String resource = getClass().getResource("/db.properties").getPath();
			properties.load(new FileReader(resource));
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			pw = properties.getProperty("pw");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
