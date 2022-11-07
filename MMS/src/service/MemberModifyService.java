package service;

import ui.MemberUI;
import vo.MemberVO;

public class MemberModifyService {

	public MemberVO getOldMemberVO(String memberId) {
		MemberVO oldMemberVO = null;
		for (int i = 0; i < MemberUI.memberList.size(); i++) {
			if(MemberUI.memberList.get(i).getMemberId().contentEquals(memberId)) {
				oldMemberVO = MemberUI.memberList.get(i);
				break;
			}
		}
		return oldMemberVO;
	}

}
