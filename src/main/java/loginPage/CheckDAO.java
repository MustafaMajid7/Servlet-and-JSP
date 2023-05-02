package loginPage;

import java.sql.*;


public class CheckDAO {
	
	
	String sql = "select * from cred where username=? and password=?";
	String url = "jdbc:mysql://localhost:3306/credentials";
	String username = "root";
	String password = "4616950477";
	
	public boolean check (String name,String pass) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, name);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				con.close();
				return true;}
			else {
				con.close();
				return false;}
			}
		
		catch (ClassNotFoundException e) {
			System.out.print(e);
			}
		
		return false;
		
	}

}
