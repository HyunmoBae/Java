package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.DogViewService;
import vo.ActionForward;
import vo.DogVO;

public class DogViewAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int dogId = Integer.parseInt(request.getParameter("dogId"));
		DogViewService dogViewService = new DogViewService();
		DogVO dogVO = dogViewService.getDog(dogId);
		
		request.setAttribute("dogVO", dogVO);
		ActionForward forward = new ActionForward();
		forward.setUrl("dogView.jsp");
		
		return forward;
	}

}
