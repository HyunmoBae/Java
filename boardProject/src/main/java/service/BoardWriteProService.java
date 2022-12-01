package service;
import static db.JDBCUtil.*;
import java.sql.*;

import dao.BoardDAO;
import vo.BoardVO;

public class BoardWriteProService {

	public boolean writeArticle(BoardVO boardVO) throws Exception {
		boolean writeSuccess = false;
		Connection con = getConnection();
		BoardDAO boardDAO = BoardDAO.getInstance();
		boardDAO.setConnection(con);
		
		int insertCount = boardDAO.insertArticle(boardVO);
		
		if(insertCount > 0) {
			commit(con);
			writeSuccess = true;
		} else {
			rollback(con);
		}
		
		return writeSuccess;
	}
	
}
