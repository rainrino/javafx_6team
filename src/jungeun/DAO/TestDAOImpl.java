package jungeun.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dayeun.controller.Server;
import jungeun.controller.Member;
import jungeun.controller.TestPercent;
import jungeun.controller.TestResult;
import jungeun.service.CommonService;
import jungeun.service.CommonServiceImpl;

public class TestDAOImpl implements TestDAO{

	Connection con;
	private CommonService commonServ;

	public TestDAOImpl() {
		// TODO Auto-generated constructor stub
		commonServ = new CommonServiceImpl();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "system";
			String pwd = "oracle";
			con = DriverManager.getConnection(url, user, pwd);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public int modifyTest1Res(Member m) {
		int resMember = 0;

		String sql = "	update member set  test1res = ? where id=?	"; 
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, m.getTest1Res());
			pstmt.setString(2, Server.id);
			resMember = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resMember;
	}

	@Override
	public int modifyTest2Res(Member m) {
		int resMember = 0;

		String sql = "	update member set  test2res = ? where id=?	"; 
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, m.getTest1Res());
			pstmt.setString(2, Server.id);
			resMember = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resMember;
	}

	@Override
	public int modifyTest3Res(Member m) {
		int resMember = 0;

		String sql = "	update member set  test3res = ? where id=?	"; 
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, m.getTest1Res());
			pstmt.setString(2, Server.id);
			resMember = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resMember;
	}

	@Override
	public int modifyTest1Res1Percent() {
		int resPercent = 0;

		String sql = "	update test1percent set  selectRes1 = test1_res1.nextval	"; 
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			resPercent = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resPercent;
	}

	@Override
	public int modifyTest1Res2Percent() {
		int resPercent = 0;

		String sql = "	update test1percent set  selectRes2 = test1_res2.nextval	"; 
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			resPercent = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resPercent;
	}

	@Override
	public int modifyTest1Res3Percent() {
		int resPercent = 0;

		String sql = "	update test1percent set  selectRes3 = test1_res3.nextval	"; 
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			resPercent = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resPercent;
	}

	@Override
	public int modifyTest2Res1Percent() {
		int resPercent = 0;

		String sql = "	update test2percent set  selectRes1 = test2_res1.nextval	"; 
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			resPercent = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resPercent;
	}

	@Override
	public int modifyTest2Res2Percent() {
		int resPercent = 0;

		String sql = "	update test2percent set  selectRes2 = test2_res2.nextval	"; 
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			resPercent = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resPercent;
	}

	@Override
	public int modifyTest2Res3Percent() {
		int resPercent = 0;

		String sql = "	update test2percent set  selectRes3 = test2_res3.nextval	"; 
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			resPercent = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resPercent;
	}

	@Override
	public int modifyTest3Res1Percent() {
		int resPercent = 0;

		String sql = "	update test3percent set  selectRes1 = test3_res1.nextval	"; 
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			resPercent = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resPercent;
	}

	@Override
	public int modifyTest3Res2Percent() {
		int resPercent = 0;

		String sql = "	update test3percent set  selectRes2 = test3_res2.nextval	"; 
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			resPercent = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resPercent;
	}

	@Override
	public int modifyTest3Res3Percent() {
		int resPercent = 0;

		String sql = "	update test3percent set  selectRes3 = test3_res3.nextval	"; 
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			resPercent = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resPercent;
	}

	@Override
	public TestPercent selectTest1Res() {
		TestPercent tp = new TestPercent();

		try {
			String sql = "	select selectres1, selectres2, selectres3 from test1percent	";
			PreparedStatement pstmt = con.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			if(rs.next()) {
				//m.setId(rs.getString("id"));
				tp.setSelectRes1(rs.getInt("selectres1"));
				tp.setSelectRes2(rs.getInt("selectres2"));
				tp.setSelectRes3(rs.getInt("selectres3"));
			}


		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		

		return tp;
	}

	@Override
	public TestPercent selectTest2Res() {
		TestPercent tp = new TestPercent();

		try {
			String sql = "	select selectres1, selectres2, selectres3 from test2percent	";
			PreparedStatement pstmt = con.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			if(rs.next()) {
				//m.setId(rs.getString("id"));
				tp.setSelectRes1(rs.getInt("selectres1"));
				tp.setSelectRes2(rs.getInt("selectres2"));
				tp.setSelectRes3(rs.getInt("selectres3"));
			}


		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		

		return tp;
	}

	@Override
	public TestPercent selectTest3Res() {
		TestPercent tp = new TestPercent();

		try {
			String sql = "	select selectres1, selectres2, selectres3 from test3percent	";
			PreparedStatement pstmt = con.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			if(rs.next()) {
				//m.setId(rs.getString("id"));
				tp.setSelectRes1(rs.getInt("selectres1"));
				tp.setSelectRes2(rs.getInt("selectres2"));
				tp.setSelectRes3(rs.getInt("selectres3"));
			}


		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		

		return tp;
	}

}
