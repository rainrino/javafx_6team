package dayeun.controller;

public class TestPercent {
	private int testNum;
	private int selectRes1;
	private int selectRes2;
	private int selectRes3;
	private int res1Percent;
	private int res2Percent;
	private int res3Percent;
	
	public int getTestNum() {
		return testNum;
	}
	public void setTestNum(int testNum) {
		this.testNum = testNum;
	}
	public int getSelectRes1() {
		return selectRes1;
	}
	public void setSelectRes1(int selectRes1) {
		this.selectRes1 = selectRes1;
	}
	public int getSelectRes2() {
		return selectRes2;
	}
	public void setSelectRes2(int selectRes2) {
		this.selectRes2 = selectRes2;
	}
	public int getSelectRes3() {
		return selectRes3;
	}
	public void setSelectRes3(int selectRes3) {
		this.selectRes3 = selectRes3;
	}
	public int getRes1Percent() {
		return res1Percent;
	}
	public int getRes2Percent() {
		return res2Percent;
	}
	public void setRes2Percent() {
		if(selectRes2 != 0){
		this.res2Percent = (int) (selectRes2/(selectRes1+selectRes2+selectRes3+0.0)*100);
		}else {
			res2Percent=0;
		}
	}
	public int getRes3Percent() {
		return res3Percent;
	}
	public void setRes3Percent() {
		if(selectRes3 != 0){
		this.res3Percent = (int) (selectRes3/(selectRes1+selectRes2+selectRes3+0.0)*100);
		}else {
			res3Percent=0;
		}
	}
	public void setRes1Percent() {
		if(selectRes1 != 0){
		this.res1Percent = (int) (selectRes1/(selectRes1+selectRes2+selectRes3+0.0)*100);
		}else {
			res1Percent=0;
		}
	}

	
	
}//class
