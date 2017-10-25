package com.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.GoodsDAO;
import com.pojo.Goods;

public class GoodsServlet extends HttpServlet {

	private GoodsDAO goodsDAO = new GoodsDAO();

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String method = request.getParameter("method");

		if ("fenye".equals(method)) {
			doFenYe(request, response);
		}

	}

	private void doFenYe(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		int page = 1;
		int size = 4;

		String pageString = request.getParameter("page");
		String sizeString = request.getParameter("size");

		if (pageString != null && pageString.trim().length() > 0) {
			page = Integer.parseInt(pageString);
		}

		if (sizeString != null && sizeString.trim().length() > 0) {
			size = Integer.parseInt(sizeString);
		}

		if (page < 1) {
			page = 1;
		}

		// 求总页数
		int count = goodsDAO.getCount();// 得到总条数
		int pageCount = count % size == 0 ? count / size : count / size + 1;
		
		if(page > pageCount){
			page = pageCount ;
		}
		
		List<Goods> list = goodsDAO.fenye(page, size);
		
		Map map = new HashMap();
		map.put("list", list);
		map.put("size", size);
		map.put("count", count);
		map.put("page", page);
		map.put("pageCount", pageCount);
		
		
		
		request.setAttribute("map", map);

		request.getRequestDispatcher("show.jsp").forward(request, response);

	}

}
