import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
 *@Author:Dong
 *@Description:   //TODO
 *@Date 10:07 7月25-025
 *@return
**/

@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应内容类型
        response.setContentType("text/html");
        response.setContentType("text/html;charset=utf-8");

        //设置逻辑实现
        PrintWriter out = response.getWriter();
        out.println("<h1>Servlet后台!!!</h1>");

    }
}
