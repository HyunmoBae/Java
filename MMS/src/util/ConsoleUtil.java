package util;

import java.util.ArrayList;
import java.util.Scanner;

import vo.MemberVO;

public class ConsoleUtil {

	public static MemberVO getNewMemberVO(Scanner scanner) {
		// TODO Auto-generated method stub
		vo.MemberVO newMemberVO = new MemberVO();
		System.out.println("회원정보입력");
		System.out.println("회원아이디 : ");
		String memberId = scanner.next();
		System.out.println("회원이름 : ");
		String memberName = scanner.next();
		System.out.println("회원나이 : ");
		int memberAge = scanner.nextInt();
		System.out.println("회원주소 : ");
		String memberAddr = scanner.next();
		System.out.println("회원이메일 : ");
		String memberEmail = scanner.next(); 
		System.out.println("회원성별 : ");
		String memberGender = scanner.next(); 
		
		newMemberVO.setMemberAddr(memberAddr);
		newMemberVO.setMemberAge(memberAge);
		newMemberVO.setMemberEmail(memberEmail);
		newMemberVO.setMemberGender(memberGender);
		newMemberVO.setMemberId(memberId);
		newMemberVO.setMemberName(memberName);
		
		return newMemberVO;
	}

	public void printRegistSuccessMessage(String memberName) {
		System.out.println(memberName + " 회원등록 성공");
	}
	public void printRegistFailMessage(String memberName) {
		System.out.println(memberName + " 회원등록 실패");
	}

	public void printMemberList(ArrayList<MemberVO> memberList) {
		if(memberList.size() == 0) {
			System.out.println("등록된 회원이 없습니다.");
		}
		else {
			for (int i = 0; i < memberList.size(); i++) {
				System.out.println(memberList.get(i));
			}
		}
	}

	public String getMemberId(String label, Scanner scanner) {
		System.out.print(label);
		return scanner.next();
	}

	public MemberVO getNewMemberVO(MemberVO oldMemberVO, Scanner scanner) {
		vo.MemberVO newMemberVO = new MemberVO();
		System.out.println("수정정보 입력");
		System.out.println("이전 회원이름 : " + oldMemberVO.getMemberName());
		System.out.println("회원이름 : ");
		String memberName = scanner.next();
		
		System.out.println("이전 회원나이 : " + oldMemberVO.getMemberAge());
		System.out.println("회원나이 : ");
		int memberAge = scanner.nextInt();
		
		System.out.println("이전 회원주소 : " + oldMemberVO.getMemberAddr());
		System.out.println("회원주소 : ");
		String memberAddr = scanner.next();
		
		System.out.println("이전 회원이메일 : " + oldMemberVO.getMemberEmail());
		System.out.println("회원이메일 : ");
		String memberEmail = scanner.next();
		
		
		System.out.println("이전 회원성별 : " + oldMemberVO.getMemberGender());
		System.out.println("회원성별 : ");
		String memberGender = scanner.next(); 
		
		newMemberVO.setMemberAddr(memberAddr);
		newMemberVO.setMemberAge(memberAge);
		newMemberVO.setMemberEmail(memberEmail);
		newMemberVO.setMemberGender(memberGender);
		newMemberVO.setMemberId(oldMemberVO.getMemberId());
		newMemberVO.setMemberName(memberName);
		
		return newMemberVO;
	}

}
