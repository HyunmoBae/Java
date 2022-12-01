package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardDeleteService;
import vo.ActionForward;

public class BoardDeleteProAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int num = Integer.parseInt(request.getParameter("num"));
		String passwd = request.getParameter("passwd");
		String pageNum = request.getParameter("pageNum");
		
		BoardDeleteService boardDeleteService = new BoardDeleteService();
		boolean removeSuccess = boardDeleteService.removeArticle(num, passwd);
		
		ActionForward forward = null;
		if(removeSuccess) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setUrl("boardList.bo");
		} else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('삭제실패')");
			out.println("history.back()");
			out.println("</script>");
		}
		
		return forward;
	}

}
