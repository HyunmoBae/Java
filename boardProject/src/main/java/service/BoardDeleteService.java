package service;
import static db.JDBCUtil.*;

import java.sql.Connection;

import dao.BoardDAO;

public class BoardDeleteService {
	
	public boolean removeArticle(int num, String passwd) throws Exception {
		boolean removeSuccess = false;
		Connection con = getConnection();
		BoardDAO boardDAO = BoardDAO.getInstance();
		boardDAO.setConnection(con);
		
		int deleteCount = boardDAO.deleteArticle(num,passwd);
		
		if(deleteCount > 0) {
			commit(con);
			removeSuccess = true;
		} else {
			rollback(con);
		}
		return removeSuccess;
	}
}
