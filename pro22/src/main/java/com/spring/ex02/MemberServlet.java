package com.spring.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/member/*")
public class MemberServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		MemberDAO dao = new MemberDAO();
//		List membersList = dao.selectAllMemberList();
//		request.setAttribute("membersList", membersList);
//		RequestDispatcher dispatch = request.getRequestDispatcher("/test01/listMembers.jsp");
//		dispatch.forward(request, response);
		String name = dao.selectName();
		int pwd = dao.selectPwd();
		PrintWriter pw = response.getWriter();
		pw.write("<script>");
		pw.write("alert(' �̸� : " + name + "');");
		pw.write("alert(' ��й�ȣ : " + pwd + "');");
		pw.write("</script>");
	}

}
