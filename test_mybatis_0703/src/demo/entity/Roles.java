package demo.entity;

import java.util.List;

public class Roles {
	int rid;
	String rolename;
	String demo;
	List<Users> alluser;
	
	public List<Users> getAlluser() {
		return alluser;
	}
	public void setAlluser(List<Users> alluser) {
		this.alluser = alluser;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getDemo() {
		return demo;
	}
	public void setDemo(String demo) {
		this.demo = demo;
	}
	@Override
	public String toString() {
		return "Roles [rid=" + rid + ", rolename=" + rolename + ", demo="
				+ demo + ", alluser=" + alluser + "]";
	}
	
	public Roles(int rid, String rolename, String demo) {
		super();
		this.rid = rid;
		this.rolename = rolename;
		this.demo = demo;
	}
	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
