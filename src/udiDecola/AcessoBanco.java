package udiDecola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AcessoBanco {
	public void inserirBanco(String comando){
		String url = "jdbc:postgresql://localhost:5432/udiDecola"; 
		String user = "postgres"; 
		String password = "banco"; 
		Connection conn = null;
		Statement stmt = null; 
		ResultSet rs = null; 
		try {
			Class.forName("org.postgresql.Driver"); 
			System.out.println("Driver OK"); 
		}
		catch (Exception e) { 
			System.out.println("Erro Driver"); 
		}
		try { 
			conn = DriverManager.getConnection(url,user,password); 
			stmt = conn.createStatement(); 
			String query = comando; 
			stmt.executeUpdate(query);
		} 
		catch (SQLException e) { 
			System.out.println(e.getMessage()); 
		} 
		finally { 
			try { 
				if (rs != null) 
					rs.close(); 
				if (stmt != null) 
					stmt.close(); 
			} 
			catch (SQLException ex) { 
				System.err.println(ex.getMessage()); 
			} 
		}
	}
}
