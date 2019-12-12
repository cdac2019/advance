package JDBC.CURD.opration;

public class User {

	private int Rno;
	private String name;
	private String pwd;
	private String email;
	private String mobile;
	public int getRno() {
		return Rno;
	}
	public void setRno(int Rno) {
		this.Rno = Rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
