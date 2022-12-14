package service;

import static db.JDBCUtil.*;

import java.sql.Connection;

import dao.MemberDAO;
import vo.MemberVO;
public class MemberRegistService {

	public boolean registMember(MemberVO memberVO) throws Exception {
		boolean registSuccess = false;
		Connection con = getConnection();
		MemberDAO memberDAO = MemberDAO.getInstance();
		memberDAO.setConnection(con);
		
		int insertCount = memberDAO.insertMember(memberVO);

		if(insertCount > 0) {
			commit(con);
			registSuccess = true;
		}
		close(con);
		return registSuccess;
	}
	
}
