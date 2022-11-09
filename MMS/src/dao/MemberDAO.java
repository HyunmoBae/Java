package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import static db.JDBCUtil.*;
import vo.MemberVO;

import vo.MemberVO;

public class MemberDAO {
	private Connection con;
	//singleton 패턴
	//객체를 하나만 생성해서 공유하는 패턴
	private static MemberDAO memberDAO;
	
	private MemberDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static MemberDAO getInstance() {
		if(memberDAO == null) {
			//처음 호출되었으면...
			memberDAO = new MemberDAO();
		}
		return memberDAO;
	}

	public void setConnection(Connection con) {
		this.con = con;
	}

	public int insertMember(MemberVO newMemberVO) throws Exception {
		Statement stmt = null;
		int insertCount = 0;
			String sql = "INSERT INTO member1(memberId,memberName,memberAge,memberAddr,memberEmail,memberGender,memberGeneration) "
					+ "VALUES('" + newMemberVO.getMemberId() + "','" + newMemberVO.getMemberName() + "','" 
					+ newMemberVO.getMemberAge()+ "','"+newMemberVO.getMemberAddr()+ "','"+newMemberVO.getMemberEmail()+"','"
					+newMemberVO.getMemberGender()+"'," + newMemberVO.getMemberGeneration()+")";

		try {
			stmt = con.createStatement();
			insertCount = stmt.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
			}
		finally {
				close(stmt);
		}
		
		return 0;
	}
	
}
