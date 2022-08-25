package dayeun.service;

import java.util.List;

import dayeun.controller.Comment;

public interface CommentService {
	public List<Comment> selectCommentList(); //db에서 댓글을 가져오는 메소드(최근2개만)
	int insertCommentTest1(Comment c); //테스트1 댓글 테이블에 댓글 입력
	public List<Comment> selectAllCommentList(); //모든 댓글 가져오는 메소드
}//interface
