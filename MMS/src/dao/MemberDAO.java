package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
	
	public static MemberDAO getInstance()throws Exception {
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

	public ArrayList<MemberVO> selectMemberList()throws Exception {
		// TODO Auto-generated method stub
		ArrayList<MemberVO> memberList = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM member1";
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				//SELECT 구문을 실행해서 반환된 레코드가 하나라도 있으면...

				memberList = new ArrayList<MemberVO>();
				
				MemberVO memberVO = null;
				
				
				do {
					memberVO = new MemberVO();
					memberVO.setMemberAddr(rs.getString("memberAddr"));
					memberVO.setMemberAge(rs.getInt("memberAge"));
					memberVO.setMemberEmail(rs.getString("memberEmail"));
					memberVO.setMemberGender(rs.getString("memberEmail"));
					memberVO.setMemberGeneration(rs.getInt("memberGeneration"));
					memberVO.setMemberId(rs.getString("memberId"));
					memberVO.setMemberName(rs.getString("memberName"));
					
					memberList.add(memberVO);
				} while (rs.next());
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			close(rs);
			close(stmt);
			
			
		}
		
		return memberList;
	}

	public MemberVO selectOldMemberVO(String memberId)throws Exception {
		MemberVO oldMemberVO = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM member1 WHERE memberId = '"+ memberId + "'";
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				//SELECT 구문을 실행해서 반환된 레코드가 하나라도 있으면...

					oldMemberVO = new MemberVO();
					oldMemberVO.setMemberAddr(rs.getString("memberAddr"));
					oldMemberVO.setMemberAge(rs.getInt("memberAge"));
					oldMemberVO.setMemberEmail(rs.getString("memberEmail"));
					oldMemberVO.setMemberGender(rs.getString("memberEmail"));
					oldMemberVO.setMemberGeneration(rs.getInt("memberGeneration"));
					oldMemberVO.setMemberId(rs.getString("memberId"));
					oldMemberVO.setMemberName(rs.getString("memberName"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			close(rs);
			close(stmt);
			
			
		}
		
		return oldMemberVO;
	}

	public int updateMember(MemberVO newMemberVO)throws Exception {
		Statement stmt = null;
		int updateCount = 0;
		String sql = "UPDATE member1 SET memberName = '"+ newMemberVO.getMemberName() 
			+ "', memberAge = " + newMemberVO.getMemberAge()
			+ ", memberAddr = '" + newMemberVO.getMemberAddr()
			+ "', memberEmail = '" + newMemberVO.getMemberEmail()
			+ "', memberGender = '" + newMemberVO.getMemberGender()
			+ "', memberGeneration = " + newMemberVO.getMemberGeneration()
			+ " WHERE memberId = '" + newMemberVO.getMemberId() + "'";
		
		try {
			stmt = con.createStatement();
			updateCount = stmt.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			close(stmt);
		}
		
		return updateCount;
	}

	public int deleteMember(String memberId)throws Exception  {
		Statement stmt = null;
		int deleteCount = 0;
		String sql = "DELETE member1 "
				+ "WHERE memberId = '" + memberId + "'";
		
		try {
			stmt = con.createStatement();
			deleteCount = stmt.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			close(stmt);
		}
		
		return deleteCount;
	}

	public MemberVO selectSearchedMemberVO(String memberId)throws Exception {
		MemberVO searchedMemberVO = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM member1 WHERE memberId = '"+ memberId + "'";
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				//SELECT 구문을 실행해서 반환된 레코드가 하나라도 있으면...

					searchedMemberVO = new MemberVO();
					searchedMemberVO.setMemberAddr(rs.getString("memberAddr"));
					searchedMemberVO.setMemberAge(rs.getInt("memberAge"));
					searchedMemberVO.setMemberEmail(rs.getString("memberEmail"));
					searchedMemberVO.setMemberGender(rs.getString("memberEmail"));
					searchedMemberVO.setMemberGeneration(rs.getInt("memberGeneration"));
					searchedMemberVO.setMemberId(rs.getString("memberId"));
					searchedMemberVO.setMemberName(rs.getString("memberName"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			close(rs);
			close(stmt);
			
			
		}
		
		return searchedMemberVO;
	}

	public ArrayList<MemberVO> selectSearchedMemberList(String memberGeneration) {
		ArrayList<MemberVO> searchedmemberList = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM member1 WHERE memberGeneration = " + memberGeneration;
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				//SELECT 구문을 실행해서 반환된 레코드가 하나라도 있으면...

				searchedmemberList = new ArrayList<MemberVO>();
				
				MemberVO memberVO = null;
				
				
				do {
					memberVO = new MemberVO();
					memberVO.setMemberAddr(rs.getString("memberAddr"));
					memberVO.setMemberAge(rs.getInt("memberAge"));
					memberVO.setMemberEmail(rs.getString("memberEmail"));
					memberVO.setMemberGender(rs.getString("memberEmail"));
					memberVO.setMemberGeneration(rs.getInt("memberGeneration"));
					memberVO.setMemberId(rs.getString("memberId"));
					memberVO.setMemberName(rs.getString("memberName"));
					
					searchedmemberList.add(memberVO);
				} while (rs.next());
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			close(rs);
			close(stmt);
			
			
		}
		
		return searchedmemberList;	
	}
}

