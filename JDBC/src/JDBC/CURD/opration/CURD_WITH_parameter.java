package JDBC.CURD.opration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CURD_WITH_parameter {
	public static String Driver ="com.mysql.jdbc.Driver";
	public static String url="jdbc:mysql://localhost:3306/advance";;
	public static String user= "root";
	public static String password= "";
	
	public static void  updatadata(String name,String pwd ,String email, String mobile ) {
		 try {
			Class.forName(Driver);
			Connection conn =DriverManager.getConnection(url, user, password);
			String sql="update data set name=?,pwd=?,email=?,mobile=?where Rno=?";
			PreparedStatement pstmt=conn.prepareStatement(sql) ;
			pstmt.setString(1, name);
			pstmt.setString(2, pwd);
			pstmt.setString(3, email);
			pstmt.setNString(4,mobile);
			pstmt.setInt(5,6);
			pstmt.executeUpdate();
			conn.close();
			System.out.println("updatedata succssecfull!");
		 }catch(Exception e) {
			e.printStackTrace(); 
		 }
		
	}

public static void main(String[] args) {
	updatadata("Guido van Rossum"," python in 1980","GuidovanRossum@gmail.com","963852741");
}


}
 