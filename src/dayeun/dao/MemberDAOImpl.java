package dayeun.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dayeun.controller.Member;
import dayeun.service.CommonService;
import dayeun.service.CommonServiceImpl;


public class MemberDAOImpl implements MemberDAO {
	Connection con;
	CommonService comServ;
	
	public MemberDAOImpl() {
		// TODO Auto-generated constructor stub
		comServ = new CommonServiceImpl();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "system";
			String pass = "oracle";
			//System.out.println("오라클연결");
			con = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}//MemberDAOImpl
	
	@Override
	public void chkDupId() { //중복 아이디인지 체크
		// TODO Auto-generated method stub
		
	}//chkDupId

	@Override
	public void insertMember() { //회원가입
		// TODO Auto-generated method stub
		
	}//insertMember

//	@Override
//	public void chkLogin() { //로그인 한 상태인지 체크
//		// TODO Auto-generated method stub
//		
//	}//chkLogin

	@Override
	public Member selectMyPage(String id) { //마이페이지 정보 가져오기
		// TODO Auto-generated method stub
		Member m =new Member();
		
		try {
			String sql = "select id, email, test1res,test2res, test3res from Member where id=?	";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				m.setId(rs.getString("id"));
				m.setEmail(rs.getString("email"));
				m.setTest1Res(rs.getInt("test1res"));
				m.setTest2Res(rs.getInt("test2res"));
				m.setTest3Res(rs.getInt("test3res"));
				return m;
			}	
			

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		

		return m;
	}//selectMyPage

	@Override
	public void dropMember() { //회원 탈퇴
		// TODO Auto-generated method stub
		
	}//dropMember

}//class
