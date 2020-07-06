package demo.entity;

public class Users {
	int u_id;
	String uname;
	String upwd;
	String realname;
	Roles roles;
	
	public Roles getRoles() {
		return roles;
	}
	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	public int getUid() {
		return u_id;
	}
	public void setUid(int uid) {
		this.u_id = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	
	@Override
	public String toString() {
		return "Users [uid=" + u_id + ", uname=" + uname + ", upwd=" + upwd
				+ ", realname=" + realname + ", roles=" + roles + "]";
	}
	public Users(int uid, String uname, String upwd, String realname) {
		super();
		this.u_id = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.realname = realname;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
