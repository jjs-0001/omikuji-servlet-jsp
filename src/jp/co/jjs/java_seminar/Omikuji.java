package jp.co.jjs.java_seminar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class omikuji
 */
@WebServlet("/Omikuji")
public class Omikuji extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Omikuji() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
	    double uranai = Math.random();
	    String result;
	    String hyouka;

	    if(uranai > 0.75){
	      result = "大吉";
	      hyouka = "今日はとっても良い日です";
	    }else if(uranai > 0.50){
	      result = "吉";
	      hyouka = "そこそこです";
	    }else if(uranai > 0.25){
	      result = "小吉";
	      hyouka = "少々悪いかもしれません";
	    }else{
	      result = "凶";
	      hyouka = "最悪です";
	    }

	    request.setAttribute("result", result);
	    request.setAttribute("hyouka", hyouka);

	    RequestDispatcher dispatcher = request.getRequestDispatcher("omikuji.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
