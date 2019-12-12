package JDBC.CURD.opration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

class CURD_WITHOUT_parameter {
	public static String Driver ="com.mysql.jdbc.Driver";
	public static String url="jdbc:mysql://localhost:3306/advance";;
	public static String user= "root";
	public static String password= "";


	public static void readdata() {
		try {
			Class.forName(Driver);
			Connection conn=DriverManager.getConnection(url, user, password);
			 		Statement stmt=conn.createStatement();	 

			String sql = "SELECT * FROM data";
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next())
			{
				System.out.println(rs.getString(2));
				System.out.println("readdata Successfully!!");
			}
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deletedata() {
		try {
			Class.forName(Driver);
			Connection conn=DriverManager.getConnection(url, user, password);
			String sql= "DELETE FROM data WHERE Rno=?;";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,4);
			pstmt.executeUpdate();
			System.out.println("Delete Successfully!!");
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

public static void insertdata() {
	
	try {
		Class.forName(Driver);
	Connection conn=	DriverManager.getConnection(url,user,password);
	String sql ="insert into data (name,pwd,email,mobile) values (?,?,?,?)";
	PreparedStatement  pstmt=conn.prepareStatement(sql);
	pstmt.setString(1, "Navanath");
	pstmt.setString(2,"nava@182");
	pstmt.setString(3, "navanathbansode00@gmail.com");
	pstmt.setString(4,"9860855133");
	pstmt.executeUpdate();
	conn.close();
	System.out.println("insertdata Successfully!!");
	}catch(Exception e) {
		e.printStackTrace();
	}

	}
public static void updatedata(){
	 try {
		 Class.forName(Driver);
		 
		Connection conn = DriverManager.getConnection(url, user, password);
		String sql="update data set name=?,pwd=?,email=?,mobile=?where Rno=?";
		 PreparedStatement  pstmt=conn.prepareStatement(sql);
		 pstmt.setString(1,"Bjarne Stroustrup");
		 pstmt.setString(2,"c++in1979");
		 pstmt.setString(3, "bjarnestroustrup@gmail.com");
		 pstmt.setString(4, "789456123");
		 pstmt.setInt(5,2);
		 pstmt.executeUpdate();
		 System.out.println(" updatedata succssecfull!!");
	 }catch(Exception e) {
     e.printStackTrace();		 
	 }
 }
	public static void main(String[] args) {

		//readdata();
		//deletedata();
	    //insertdata();
		updatedata();
	}

}
