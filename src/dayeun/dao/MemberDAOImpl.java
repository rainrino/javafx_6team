package dayeun.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dayeun.controller.Member;
import dayeun.controller.Server;
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
	public int chkDupId(String chkId) { //중복 아이디인지 체크
		// TODO Auto-generated method stub
		int res=0;
		
		try {
			String sql = "select count(*) from member where id=? 	";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, chkId);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				res=rs.getInt("count(*)");
			}//end if
		}catch(Exception e) {
			e.printStackTrace();
		}		
		
		return res;
	}//chkDupId

	@Override
	public boolean chkLogin(String id, String pass) { //로그인 시도한 회원의 정보가 일치하는지 체크
		// TODO Auto-generated method stub
		boolean loginFlag=false;
		int chkLogin=0; //l이면 로그인 성공
		
		try {
			String sql = "select count(*) from member where id=? and pass=? and dropFlag='false'	";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				chkLogin=rs.getInt("count(*)");
			}//end if
			
			if(chkLogin ==1) { //만약 일치하는 정보가 있다면 
				loginFlag=true; //로그인 성공
				Server.id=id; //Server 클래스에 아이디 저장
				Server.loginFlag=true; //Server loginFlag가 true
			}//end if
			

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}//end catch
		
		return loginFlag;
	}//chkLogin

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
	public int dropMember() { //회원 탈퇴 메소드 
		// TODO Auto-generated method stub
		int res=0;
		
		String sql = "	update member set  dropflag = 'true' where id=?	"; //dropFlag = ture /탈퇴한 회원
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, Server.id);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}//dropMember

	@Override
	public int insertMember(Member m) { //회원가입
		int res=0;
		// TODO Auto-generated method stub
		String sql = "	insert into member(id, pass, email, dropflag) values (?,?,?,?)	"; //dropFlag = ture /탈퇴한 회원
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPass());
			pstmt.setString(3, m.getEmail());
			pstmt.setString(4, m.getDropFlag());
			res = pstmt.executeUpdate();
			System.out.println(res);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end catch
		
		return res;
	}//insertMember
	
	

}//class
