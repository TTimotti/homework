package edu.web.jsp01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserInfoServlet
 */
@WebServlet(name = "UserInfoServlet", urlPatterns = { "/ex3" })
public class UserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserInfoServlet() {

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.err.println("UserInfoServlet.doGet() 호출");

		response.setContentType("text/html; charset=UTF-8"); // 한글 깨짐 방지

		response.getWriter()
				.append("<!doctype html>")
				.append("<html>")
				.append("    <head>")
				.append("        <meta charset='UTF-8'>")
				.append("        <title>UserInfo</title>")
				.append("    </head>")
				.append("    <body>")
				.append("        <h1>사용자 정보 전송</h1>")
				.append("        <form method='post'>")
				.append("           <input type='text' name='username' />")
				.append("           <input type='submit' name='제출' />")
				.append("        </form>")
				.append("        <a href='/jsp01'>메인페이지로 이동</a>")
				.append("    </body>")
				.append("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("UserInfoServlet.doPost() 호출");
		// 요청 객체의 인코딩 타입을 설정
		request.setCharacterEncoding("UTF-8");
		
		// 클라이언트가 요청으로 보낸 요청 파라미터(request parameter) 값을 읽음
		String username = request.getParameter("username");
		System.out.println("username :" + username);
		
		// 서버에서 클라이언트로 보내는 응답을 작성
		response.setContentType("text/html; charset=UTF-8"); // 한글 깨짐 방지
		
		response.getWriter()
        .append("<!doctype html>")
        .append("<html>")
        .append("    <head>")
        .append("        <meta charset='UTF-8'>")
        .append("        <title>UserInfo</title>")
        .append("    </head>")
        .append("    <body>")
        .append("        <h1>안녕하세요, " + username + "!!!</h1>")
        .append("        <a href='/jsp01'>메인페이지로 이동</a>")
        .append("    </body>")
        .append("</html>");
		
	}

}
