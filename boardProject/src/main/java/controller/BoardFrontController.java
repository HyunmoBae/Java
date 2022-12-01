package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.BoardContentAction;
import action.BoardDeleteFormAction;
import action.BoardDeleteProAction;
import action.BoardListAction;
import action.BoardUpdateFormAction;
import action.BoardUpdateProAction;
import action.BoardWriteFormAction;
import action.BoardWriteProAction;
import vo.ActionForward;

@WebServlet("*.bo")
public class BoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardFrontController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.요청 파악
		String requestURI = request.getRequestURI();
		//요청URL : http://localhost:8088/board/Project/boardWriteForm.bo
		//requestURL : /boardProject/boardWriteForm.bo
		
		String contextPath = request.getContextPath();
		// /boardProject
		
		String command = requestURI.substring(contextPath.length());
		// /boardWriteForm.bo
		
		//2. 요청별 처리
		Action action = null;
		//각각의 요청(게시판 글쓰기, 게시판 목록보기, 게시판 글 삭제하기 등)을 처리하는 Action 클래스들의 규격(구조, 기능)을 정의한 인터페이스
		//Action 인터페이스를 이용한 다형성을 활용해서 각 요청을 처리함.
		ActionForward forward = null;
		
		if(command.contentEquals("/boardWriteForm.bo")) {
			action = new BoardWriteFormAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.contentEquals("/BoardWritePro.bo")) {
			action = new BoardWriteProAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.contentEquals("/boardList.bo")) {
				action = new BoardListAction();
				try {
					forward = action.execute(request, response);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		else if(command.contentEquals("/boardContent.bo")) {
			action = new BoardContentAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.contentEquals("/boardUpdateForm.bo")) {
			action = new BoardUpdateFormAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.contentEquals("/boardUpdatePro.bo")) {
			action = new BoardUpdateProAction();
			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.contentEquals("/boardDeleteForm.bo")) {
			action = new BoardDeleteFormAction();
			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.contentEquals("/boardDeletePro.bo")) {
			action = new BoardDeleteProAction();
			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
				
		}
		
		//3. 포워딩
		if(forward != null) {
			//요청처리가 제대로 되었으면
			if(forward.isRedirect()) {
				response.sendRedirect(forward.getUrl());
			}
			else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getUrl());
				dispatcher.forward(request, response);
			}
		}
		
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}

