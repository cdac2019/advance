package JDBC.CURD.opration;
import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc_demo {

	public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/advance";
	//String url="jdbc:mysql://192.168.43.9:3306/student" ;
	 String user="root";
	 String password="";
	 try {
		Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection conn = DriverManager.getConnection(url, user, password);
		  System.out.println("connection");
		  conn.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	  
	}

}
