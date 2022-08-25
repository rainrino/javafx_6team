package dayeun.service;

import dayeun.controller.Member;
import dayeun.controller.TestPercent;
import dayeun.dao.TestDAO;
import dayeun.dao.TestDAOImpl;

public class TestServiceImpl implements TestService {
	TestDAO tDAO=new TestDAOImpl();
//////////////////////////////////////////////////사용자 db에 저장////////////////////////////////////////////////////////////////////////
	@Override
	public int modifyTest1Res(Member m) { //다이어트 테스트에 대한 결과 사용자 db에 저장
		int resMember=0;
		
		resMember=tDAO.modifyTest1Res(m);
		
		return resMember;
	}//modifyTest1Res
	
	@Override
	public int modifyTest2Res(Member m) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int modifyTest3Res(Member m) {
		// TODO Auto-generated method stub
		return 0;
	}
//////////////////////////////////////////////////////전체 선택된 수 퍼센테이지 계산//////////////////////////////////////////////////////////////

	@Override
	public int modifyTest1Res1Percent() {
		int resPercent=0;
		resPercent=tDAO.modifyTest1Res1Percent();
		return resPercent;
	}

	@Override
	public int modifyTest1Res2Percent() {
		int resPercent=0;
		resPercent=tDAO.modifyTest1Res2Percent();
		return resPercent;
	}

	@Override
	public int modifyTest1Res3Percent() {
		int resPercent=0;
		resPercent=tDAO.modifyTest1Res3Percent();
		return resPercent;
	}

	@Override
	public int modifyTest2Res1Percent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyTest2Res2Percent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyTest2Res3Percent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyTest3Res1Percent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyTest3Res2Percent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyTest3Res3Percent() {
		// TODO Auto-generated method stub
		return 0;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public TestPercent selectTest1Res() {
		// TODO Auto-generated method stub
		TestPercent tp=new TestPercent();
		tp=tDAO.selectTest1Res();
		
		tp.setTestNum(1);
		tp.setRes1Percent();
		tp.setRes2Percent();
		tp.setRes3Percent();
		
		return tp;
	}

	@Override
	public TestPercent selectTest2Res() {
		// TODO Auto-generated method stub
		TestPercent tp=new TestPercent();
		tp=tDAO.selectTest2Res();
		return tp;
	}

	@Override
	public TestPercent selectTest3Res() {
		// TODO Auto-generated method stub
		TestPercent tp=new TestPercent();
		tp=tDAO.selectTest3Res();
		return tp;
	}


}//class
