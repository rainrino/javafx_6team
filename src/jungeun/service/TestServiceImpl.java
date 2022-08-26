package jungeun.service;

import jungeun.DAO.TestDAO;
import jungeun.DAO.TestDAOImpl;
import jungeun.controller.Member;
import jungeun.controller.TestPercent;

public class TestServiceImpl implements TestService{
	TestDAO testDAO = new TestDAOImpl();

	@Override
	public int modifyTest1Res(Member m) {
		int resMember = 0;

		resMember = testDAO.modifyTest1Res(m);

		return resMember;
	}

	@Override
	public int modifyTest2Res(Member m) {
		int resMember = 0;

		resMember = testDAO.modifyTest1Res(m);

		return resMember;
	}

	@Override
	public int modifyTest3Res(Member m) {
		int resMember = 0;

		resMember = testDAO.modifyTest1Res(m);

		return resMember;
	}

	@Override
	public int modifyTest1Res1Percent() {
		int resPercent = 0;
		resPercent = testDAO.modifyTest1Res1Percent();
		return resPercent;
	}

	@Override
	public int modifyTest1Res2Percent() {
		int resPercent = 0;
		resPercent = testDAO.modifyTest1Res2Percent();
		return resPercent;
	}

	@Override
	public int modifyTest1Res3Percent() {
		int resPercent = 0;
		resPercent = testDAO.modifyTest1Res3Percent();
		return resPercent;
	}

	@Override
	public int modifyTest2Res1Percent() {
		int resPercent = 0;
		resPercent = testDAO.modifyTest2Res1Percent();
		return resPercent;
	}

	@Override
	public int modifyTest2Res2Percent() {
		int resPercent = 0;
		resPercent = testDAO.modifyTest2Res2Percent();
		return resPercent;
	}

	@Override
	public int modifyTest2Res3Percent() {
		int resPercent = 0;
		resPercent = testDAO.modifyTest2Res3Percent();
		return resPercent;
	}

	@Override
	public int modifyTest3Res1Percent() {
		int resPercent = 0;
		resPercent = testDAO.modifyTest3Res1Percent();
		return resPercent;
	}

	@Override
	public int modifyTest3Res2Percent() {
		int resPercent = 0;
		resPercent = testDAO.modifyTest3Res2Percent();
		return resPercent;
	}

	@Override
	public int modifyTest3Res3Percent() {
		int resPercent = 0;
		resPercent = testDAO.modifyTest3Res3Percent();
		return resPercent;
	}

	@Override
	public TestPercent selectTest1Res() {
		// TODO Auto-generated method stub
		TestPercent tp = new TestPercent();
		tp = testDAO.selectTest1Res();

		tp.setTestNum(1);
		tp.setRes1Percent();
		tp.setRes2Percent();
		tp.setRes3Percent();

		return tp;
	}

	@Override
	public TestPercent selectTest2Res() {
		// TODO Auto-generated method stub
		TestPercent tp = new TestPercent();
		tp = testDAO.selectTest2Res();
		return tp;
	}

	@Override
	public TestPercent selectTest3Res() {
		TestPercent tp = new TestPercent();
		tp = testDAO.selectTest3Res();
		return tp;
	}

}
