package JDBCConnecion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class tableCreation {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String pass="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, pass);
			String s="create table one(id int, name varchar(20))";
			Statement st=con.createStatement();
			st.executeUpdate(s);
			System.out.println("Created successfully");
	        } catch (Exception e) {
			System.out.println(e);
		}
	}
}
