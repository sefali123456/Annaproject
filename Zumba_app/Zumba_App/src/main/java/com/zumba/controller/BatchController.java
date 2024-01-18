package com.zumba.controller;

import com.zumba.bean.batch;
import com.zumba.service.BatchService;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BatchController")
public class BatchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      BatchService bs= new BatchService(); 
    
    public BatchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		int batchid = Integer.parseInt(request.getParameter("batchid"));
		String typeofbatch = request.getParameter("typeofbatch");
		String time = request.getParameter("time");
		
		batch batch = new batch(batchid, typeofbatch, time);
		String result = bs.storeBatch(batch);
		pw.println(result);
		RequestDispatcher rd = request.getRequestDispatcher("addBatch.jsp");
		rd.include(request, response);
		response.setContentType("text/html");
	}

}