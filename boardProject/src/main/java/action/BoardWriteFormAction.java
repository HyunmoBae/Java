package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.ReplyVO;

public class BoardWriteFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
			int num=0,ref=1,re_step=0,re_level=0;
				//클라이언트가 글 상세내용보기를 하고 답변글쓰기 요청을 했을때 글쓰기 페이지로 전달 
	
			if(request.getParameter("num")!=null){
				num=Integer.parseInt(request.getParameter("num"));
				ref=Integer.parseInt(request.getParameter("ref"));
				re_step=Integer.parseInt(request.getParameter("re_step"));
				re_level=Integer.parseInt(request.getParameter("re_level"));
			}
			    
			ReplyVO replyVO = new ReplyVO();
			replyVO.setNum(num);
			replyVO.setRe_level(re_level);
			replyVO.setRe_step(re_step);
			replyVO.setRef(ref);
			
			request.setAttribute("replyVO", replyVO);
			
			ActionForward forward = new ActionForward();
			forward.setUrl("board/writeForm.jsp");
			
			
		return forward;
	}

}
