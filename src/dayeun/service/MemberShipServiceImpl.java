package dayeun.service;

import dayeun.controller.Member;
import dayeun.dao.MemberDAO;
import dayeun.dao.MemberDAOImpl;

public class MemberShipServiceImpl implements MemberShipService {
	MemberDAO mDAO=new MemberDAOImpl();
	
	@Override
	public int chkDupId(String chkID) {
		int res=0; //중복 아이디 검사 select db 사용 후 결과 값 
	
		res=mDAO.chkDupId(chkID);
		
		return res;
	}//chkDupId


	@Override
	public int insertMember(Member m) {
		// TODO Auto-generated method stub
		int res=0;
		
		res=mDAO.insertMember(m);
		
		return res;
	}//insertMember
	
}//class
