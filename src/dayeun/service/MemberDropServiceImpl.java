package dayeun.service;

import dayeun.dao.MemberDAO;
import dayeun.dao.MemberDAOImpl;


public class MemberDropServiceImpl implements MemberDropService {

	
	@Override
	public int dropMember() {
		int res=0;
		MemberDAO mDAO=new MemberDAOImpl();
		
		res=mDAO.dropMember();
		System.out.println(res);
		return res;
	}//dropMember

}//class
