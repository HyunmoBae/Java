package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.LoginService;
import vo.MemberVO;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String memberId = request.getParameter("memberId");
		String memberPasswd = request.getParameter("memberPasswd");
		
		LoginService loginService = new LoginService();
		
		try {
			MemberVO loginMemberVO = loginService.getLoginMember(memberId, memberPasswd);
			
			if (loginMemberVO == null) {
				response.setContentType("text/html;charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('로그인실패')");
				out.println("history.back()");
				out.println("</script>");
				
			}
			else {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
