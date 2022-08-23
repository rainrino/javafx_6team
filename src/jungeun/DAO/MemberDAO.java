package jungeun.DAO;

public interface MemberDAO {
	public void chkDupId();
	public void insertMember();
	public void chkLogin();
	public void selectMyPage();
	public void dropMember();
}
