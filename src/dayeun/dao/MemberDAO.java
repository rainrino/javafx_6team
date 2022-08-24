package dayeun.dao;

import dayeun.controller.Member;

public interface MemberDAO {
	public int chkDupId(String chkID);
	public boolean chkLogin(String id, String pass);
	public Member selectMyPage(String id);
	public int dropMember();
	public int insertMember(Member m);
}//interface
