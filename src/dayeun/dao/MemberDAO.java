package dayeun.dao;

import dayeun.controller.Member;

public interface MemberDAO {
	public void chkDupId();
	public void insertMember();
//	public void chkLogin();
	public Member selectMyPage(String id);
	public void dropMember();
}//interface
