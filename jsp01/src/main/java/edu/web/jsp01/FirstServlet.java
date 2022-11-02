package edu.web.jsp01;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(name = "firstServlet", urlPatterns = { "/ex1" })
// 처리하는 요청 주소(request URL), 서블링 개체이름을 WAS에 등록
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstServlet() {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	//-> GET 방식의 요청일 때 WAS가 호출하는 메서드
	//-> 파라미터 request : 클라이언트가 보낸 요청에 대해 정보를 가지거있느 객체
	//-> 파라미터 response : 클라이언트가 보낸 요청에 대해 정보를 가지거있느 객체 :, Tin
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8"); // 한글 깨짐 방지

		LocalDateTime now = LocalDateTime.now();

		PrintWriter writer = response.getWriter();
		writer.append("<!doctype html>")
				.append("<html>")
				.append("    <head>")
				.append("        <meta charset='UTF-8'>")
				.append("        <title>Servlet</title>")
				.append("    </head>")
				.append("    <body>")
				.append("        <h1>첫번째 Servlet</h1>")
				.append("<h2>")
				.append(now.toString())
				.append("</h2>")
				.append("    </body>")
				.append("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	//-> POST 방시의 요청일 떄 WAS가 호출하는 메서드
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
