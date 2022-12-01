package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardListService;
import vo.ActionForward;
import vo.BoardVO;
import vo.PageVO;

public class BoardListAction implements Action {

	@Override
		public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		    int pageSize = 10;
		    //한 페이지당 출력될 글의 개수
		    
		    String pageNum = request.getParameter("pageNum");
		    if (pageNum == null) {//게시판 메뉴를 클릭하고 요청했을때
		        pageNum = "1";
		    }
	
		    int currentPage = Integer.parseInt(pageNum);
		    //페이징 처리할때 페이지 번호로 연산을 하기위해서 정수타입으로 변환
		    
		    int startRow = (currentPage - 1) * pageSize + 1;
		    //해당 페이지에 출력될 첫번째 글의 레코드 번호
		    //1페이지
		    //(1 - 1) * 10 + 1 ===> 1
		    //2페이지
		    //(2 - 1) * 10 + 1 ===> 11
		    
		    int count = 0;
		    //총 글의 개수를 저장할 변수
		    
		    int number=0;
		    //해당 페이지에 출력되는 첫번째 글의 글번호
	
		    List<BoardVO> articleList = null;

		    BoardListService boardListService = new BoardListService();
		    
		    count = boardListService.getArticleCount();
		    if (count > 0) {
		        articleList = boardListService.getArticles(startRow, pageSize);
		    }
	
			number=count-(currentPage-1) * pageSize;
			//페이지번호 : 1
			//총 글의 개수 : 123
			//123 - (1 - 1) * 10 ===> 123
			int pageCount = 0;
			int startPage = 0;
			int endPage = 0;
			
			if (count > 0) {
		        pageCount = count / pageSize + 
		        		( count % pageSize == 0 ? 0 : 1);
				//총 페이지 개수
		        //123
		        //123 / 10 + 1 ===> 13
		        
		        startPage = (currentPage - 1 /10)*10+1;
		        //하나의 페이지그룹의 시작 페이지 번호
		        //현재 페이지 : 3
		        //(3 / 10) * 10 + 1 ===> 1
		        
		        //현재페이지 : 10
		        //(10/10) * 10 + 1 ===> 11
		        
				int pageBlock=10; 
				//한번에 묶여서 출력되는 페이지들의 그룹
				
		        endPage = startPage + pageBlock-1; 
		        //하나의 페이지그룹의 시작 페이지 번호 
		        
		        if (endPage > pageCount) endPage = pageCount;
		        //마지막 페이지 그룹인 경우
		        
		}
		request.setAttribute("articleList", articleList);
		PageVO pageVO = new PageVO();
		pageVO.setCount(count);
		pageVO.setCurrentPage(currentPage);
		pageVO.setEndPage(endPage);
		pageVO.setNumber(number);
		pageVO.setPageCount(pageCount);
		pageVO.setStartPage(startPage);
		request.setAttribute("pageVO", pageVO);
		
		ActionForward forward = new ActionForward();
		forward.setUrl("board/list.jsp");
		return forward;
	}

}



