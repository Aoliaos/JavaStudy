package com.dong.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @PackageName:com.dong.servlet
 * @ClassName: MyServlet2
 * @Description:
 * @author:Dong
 * @data 7月25-025 10:35
 */
public class MyServlet2 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().write("this is my second servlet");
        System.out.println("MyServlet2.service()");
    }
}
