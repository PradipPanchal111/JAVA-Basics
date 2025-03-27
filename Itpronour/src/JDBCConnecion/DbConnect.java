package JDBCConnecion;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class DbConnect {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String pass="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();
			//st.executeQuery("select * from employee");
			ResultSet rs= st.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.print(rs.getInt(1)+ "  ");
				System.out.print(rs.getString(2)+"  ");
				System.out.print(rs.getInt(3)+"");
				System.out.println();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}

