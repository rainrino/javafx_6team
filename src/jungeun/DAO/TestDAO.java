package jungeun.DAO;

import jungeun.controller.Member;
import jungeun.controller.TestPercent;

public interface TestDAO {
	public int modifyTest1Res(Member m);
	public int modifyTest2Res(Member m);
	public int modifyTest3Res(Member m);

	public int modifyTest1Res1Percent();
	public int modifyTest1Res2Percent();
	public int modifyTest1Res3Percent();
	
	public int modifyTest2Res1Percent();
	public int modifyTest2Res2Percent();
	public int modifyTest2Res3Percent();
	
	public int modifyTest3Res1Percent();
	public int modifyTest3Res2Percent();
	public int modifyTest3Res3Percent();

	public TestPercent selectTest1Res();
	public TestPercent selectTest2Res();
	public TestPercent selectTest3Res();
}
