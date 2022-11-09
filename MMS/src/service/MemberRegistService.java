package service;
//Connection을 얻어오는 작업은 Service 클래스에서 수행함.
//Connection 단위로 트랜젝션이 처리됨.

import static db.JDBCUtil.*;

import java.sql.Connection;

import dao.MemberDAO;
import ui.MemberUI;
import vo.MemberVO;

public class MemberRegistService {

	public boolean registNewMember(MemberVO newMemberVO) throws Exception {
		
//		boolean registSuccess = true;
/*		for (int i = 0; i < MemberUI.memberList.size(); i++) {
			if(newMemberVO.getMemberId().contentEquals(MemberUI.memberList.get(i).getMemberId())) {
				registSuccess = false;
				break;
			}
		}
		if(registSuccess) {
			MemberUI.memberList.add(newMemberVO);
		}
		return registSuccess;*/
		
		boolean registSuccess = false;
		
		MemberDAO memberDAO = MemberDAO.getInstance();
		Connection con = getConnection();
		memberDAO.setConnection(con);
		
		int insertCount = memberDAO.insertMember(newMemberVO);
		if(insertCount > 0) {
			registSuccess = true;
		}
		close(con);
		return registSuccess;
	}
	
}
