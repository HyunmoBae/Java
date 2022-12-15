package service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import vo.CartVO;

public class DogCartQtyDownnService {

	public void downCartQty(int dogId, HttpServletRequest request) {
		HttpSession session = request.getSession();
		ArrayList<CartVO> cartList = (ArrayList<CartVO>)session.getAttribute("cartList");
		
		for (int i = 0; i < cartList.size(); i++) {
			if(cartList.get(i).getDogId() == dogId) {
				cartList.get(i).setQty(cartList.get(i).getQty() - 1);
			}
		}
	}

}