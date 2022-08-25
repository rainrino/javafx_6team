package dayeun.service;

import java.util.ArrayList;
import java.util.List;

import dayeun.controller.Comment;
import dayeun.dao.CommentDAO;
import dayeun.dao.CommentDAOImpl;

public class CommentServiceImpl implements CommentService{
	CommentDAO cDAO=new CommentDAOImpl();
	
	@Override
	public List<Comment> selectCommentList() {
		// TODO Auto-generated method stub
		List<Comment> commentList=new ArrayList<>();
		commentList=cDAO.selectCommentList();
		return commentList;
	}

	@Override
	public int insertCommentTest1(Comment c) {
		// TODO Auto-generated method stub
		int res=0;
		
		res=cDAO.insertCommentTest1(c);
		
		return res;
	}

	@Override
	public List<Comment> selectAllCommentList() {
		// TODO Auto-generated method stub
		return null;
	}

}
