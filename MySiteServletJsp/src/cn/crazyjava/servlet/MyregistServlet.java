package cn.crazyjava.servlet;

import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyregistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyregistServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		System.out.println("注册成了");
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//String sex = request.getParameter("sex");
		//String date = request.getParameter("date");
		//String[] hobby = request.getParameterValues("hobby");
		
		Connection conn=null;
		PreparedStatement pre=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/test_db";
			String user="root";
			String pas="root";
			conn=DriverManager.getConnection(url, user, pas);
			String sql="insert into demo(name,password)values(?,?)";
			pre=conn.prepareStatement(sql);
			pre.setString(1, username);
			pre.setString(2, password);
			System.out.println("///////");
			//pre.setString(3, sex);
			//pre.setString(3, date); 
			//pre.setString(5, hobby);
			pre.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}  
		try {
			pre.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("成功");
		/*FileWriter fw=new FileWriter("F:\\用户信息\\用户信息.txt");
		fw.write(username);
		fw.write("...");
		fw.write(password);
		fw.write("...");
		//fw.write(sex);
		//fw.write("...");
		fw.write(date);
		fw.write("...");
		//fw.write(hobby);
		fw.flush();*/

			}
	}


