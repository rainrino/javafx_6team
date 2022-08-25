package dayeun.service;

import dayeun.controller.Member;
import dayeun.controller.TestPercent;

public interface TestService {
	public int modifyTest1Res(Member m); //사용자의 다이어트 테스트 결과를 db에 저장하는 메소드
	public int modifyTest2Res(Member m); //사용자의 소비성향 테스트 결과를 db에 저장하는 메소드
	public int modifyTest3Res(Member m); //사용자의 모임성향 테스트 결과를 db에 저장하는 메소드
	//////////////////////////////////////////////////////////////////////////////
	public int modifyTest1Res1Percent(); //다이어트 테스트에서 타고난 다이어트 천재 선택된 수를 db에 저장하는 메소드
	public int modifyTest1Res2Percent(); //다이어트 테스트에서 2번째결과 선택된 수를 db에 저장하는 메소드
	public int modifyTest1Res3Percent(); //다이어트 테스트에서 3번째결과 선택된 수를 db에 저장하는 메소드
	
	public int modifyTest2Res1Percent(); //소비성향 테스트에서 1번째결과 선택된 수를 db에 저장하는 메소드
	public int modifyTest2Res2Percent(); //소비성향 테스트에서 2번째결과 선택된 수를 db에 저장하는 메소드
	public int modifyTest2Res3Percent(); //소비성향 테스트에서 3번째결과 선택된 수를 db에 저장하는 메소드
	
	public int modifyTest3Res1Percent(); //모임성향 테스트에서 1번째결과 선택된 수를 db에 저장하는 메소드
	public int modifyTest3Res2Percent(); //모임성향 테스트에서 2번째결과 선택된 수를 db에 저장하는 메소드
	public int modifyTest3Res3Percent(); //모임성향 테스트에서 3번째결과 선택된 수를 db에 저장하는 메소드
	//////////////////////////////////////////////////////////////////////////////
	public TestPercent selectTest1Res(); //다이어트 테스트에서 결과1 2 3 이 각자 선택된 수 조회
	public TestPercent selectTest2Res(); //소비성향 테스트에서 결과1 2 3 이 각자 선택된 수 조회
	public TestPercent selectTest3Res(); //모임성향 테스트에서 결과1 2 3 이 각자 선택된 수 조회
	
}//interface
