package JDBC.CURD.opration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CURD_External_class {

	public static String Driver ="com.mysql.jdbc.Driver";
	public static String url="jdbc:mysql://localhost:3306/advance";;
	public static String user= "root";
	public static String password= "";
public static void updatedata(User user1) {
		try {
			Class.forName(Driver);
			Connection conn =DriverManager.getConnection(url, user, password);
			String sql="update data set name=?,pwd=?,email=?,mobile=?where Rno=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,user1.getName());
		 pstmt.setString(2,user1.getPwd());
		 pstmt.setString(3,user1.getEmail());
		 pstmt.setString(4,user1.getMobile());
		 pstmt.setInt(5,user1.getRno());
		 pstmt.executeUpdate();
		 System.out.println(" updatedata succssecfull!!");
		 conn.close();
		}catch(Exception e) {
		 e.printStackTrace();
		 } 

	} 
	public static void main(String[] args) {
		
		User user1= new User();
		user1.setEmail("RasmusLerdorf@gmail.com");
		user1.setMobile("9762807188");
		user1.setName("Rasmus Lerdorf");
		user1.setPwd("PHP in 1994");
		user1.setRno(4);
		 updatedata(user1);

	}

}
