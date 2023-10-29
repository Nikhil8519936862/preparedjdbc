package preparedjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcinsert {

	public static void main(String[] args) throws Exception
	{

		try {
			int id = 3;
			String name = "padma";
			int age = 20;
			String query = "insert into college values (?,?,?)";

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikhil1", "root", "Nikhilraj@1");
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1,id);
			st.setString(2, name);
			st.setInt(3,age);
			
			int count = st.executeUpdate();

			System.out.println(count + " row/s afftected");
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
