package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.DogCartQtyDownnService;
import vo.ActionForward;

public class DogCartQtyDownAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int dogId = Integer.parseInt(request.getParameter("dogId"));
		DogCartQtyDownnService dogCartQtyDownnService = new DogCartQtyDownnService();
		dogCartQtyDownnService.downCartQty(dogId,request);
		
		ActionForward forward = new ActionForward();
		forward.setUrl("dogCartList.dog");
		forward.setRedirect(true);
		return forward;
	}

}
