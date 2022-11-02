package edu.web.jsp01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */

/*
 * Servlet을 설정하는 방법:
 * 1. 배포 관리자(deployment descriptor, web.xml)에서 설정
 * 2. @WebServlet 애너테이션 이용
 * web.xml 또는 이너테이션 중 한가지 방법으로만 설정
 */

public class SecondServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("SecondServlet.doGet() 호출");
        
        response.setContentType("text/html; charset=UTF-8"); // 한글 깨짐 방지
        
        response.getWriter()
        .append("<!doctype html>")
        .append("<html>")
        .append("    <head>")
        .append("        <meta charset='UTF-8'>")
        .append("        <title>Second Servlet</title>")
        .append("    </head>")
        .append("    <body>")
        .append("        <h1>두번째 Servlet</h1>")
        .append("<a href='/jsp01'>메인페이지로 이동</a>")
        .append("    </body>")
        .append("</html>");
        }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
