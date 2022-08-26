package jungeun.controller;

public class Member {
	private String id;
	private String pass;
	private String email;
	private int test1Res;
	private int test2Res;
	private int test3Res;
	// 회원 탈퇴 유무
	// ture : 탈퇴한 회원 , false : 유지 중인 회원
	private boolean dropFlag;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTest1Res() {
		return test1Res;
	}
	public void setTest1Res(int test1Res) {
		this.test1Res = test1Res;
	}
	public int getTest2Res() {
		return test2Res;
	}
	public void setTest2Res(int test2Res) {
		this.test2Res = test2Res;
	}
	public int getTest3Res() {
		return test3Res;
	}
	public void setTest3Res(int test3Res) {
		this.test3Res = test3Res;
	}
	public boolean isDropFlag() {
		return dropFlag;
	}
	public void setDropFlag(boolean dropFlag) {
		this.dropFlag = dropFlag;
	}
}
