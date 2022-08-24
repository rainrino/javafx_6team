package dayeun.service;

import dayeun.controller.Member;

public interface MemberShipService {
	public int chkDupId(String chkID);
	public int insertMember(Member m); //회원가입 db insert 메소드
}//interface
