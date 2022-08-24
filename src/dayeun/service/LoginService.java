package dayeun.service;

public interface LoginService {
	public boolean selectLogin(String id, String pass); //로그인할 회원의 아이디와 비밀번호를 받아서 db에서 조회한다
	//맞으면 true, 틀리면 false 반환
}//interface
