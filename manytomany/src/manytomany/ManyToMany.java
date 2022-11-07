package manytomany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ManyToMany

{
	static Connection conn = null;
	static Statement stmt;
	static ResultSet rs;

	public static void main(String[] args) {

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/manytomany", "root", "Softtek@2022");
			System.out.println("Connection successful");
		} catch (SQLException e) {
			System.out.println("Not connected to data base");
			e.printStackTrace();		}

		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			ResultSet rs = stmt.executeQuery("Select * from pcconnector");
			while (rs.next()) {

				System.out.println(rs.getString(1) + " : " + rs.getString(2));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
