package cn.crazyjava.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 实现网站页面登录的功能Servlet
 */
@WebServlet("/dologin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String newinfo = request.getParameter("username");
		String userName = new String(newinfo.getBytes("iso8859_1"), "UTF-8");// 网页中文乱码处理方式
		String password = request.getParameter("psd");
		// 目前网站账号密码固定，后面此处作为连接数据库的位置
		System.out.println("打印了");// 测试是否执行
		//2017.6.6数据库使用
		
		/*if ("crazy".equals(name) && "123456".equals(password)) {
			
			 * response.setHeader("refresh", "2;URL=Welcome.jsp");//
			 * 设置头信息，网页两秒刷新一次，跳转至welcome页面
			 
			 response.sendRedirect("../JSP/welcome.jsp"); 
			RequestDispatcher rd = request.getRequestDispatcher("/JSP/Welcome.jsp");
			rd.forward(request, response);// 使用dispatcher进行跳转
			// response.sendRedirect("/MySiteServletJsp/JSP/welcome.jsp");

			request.getSession().setAttribute("userid", name);// 获取session对象，将登陆的用户名保存在session会话中
		} else {

			response.sendRedirect("/MySiteServletJsp/JSP/LoginError.jsp");// 重定向转到错误页面
		}*/
		/*
		 * out.println(name); out.println(password);
		 */
		/*
		 * out.println(new
		 * String((request.getParameter("username")).getBytes("iso8859_1"),
		 * "UTF-8"));
		 */
		if(password==null||"".equals(password)){
			RequestDispatcher rd=request.getRequestDispatcher("/MySiteServletJsp/JSP/LoginError.jsp");
		}
		else{
			
		}
	}

}































