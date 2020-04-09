package com.gestion_des_don.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import com.gestion_des_don.don.beans.Don;
import com.gestion_des_don.utils.DBUtils;
import com.gestion_des_don.utils.MyUtils;
 
@WebServlet(urlPatterns = { "/donList" })
public class DonListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public DonListServlet() {
        super();
    }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection conn = MyUtils.getStoredConnection(request);
 
        String errorString = null;
        List<Don> list = null;
        try {
            list = DBUtils.queryDon(conn);
        } catch (SQLException e) {
            e.printStackTrace();
            errorString = e.getMessage();
        }
        // Store info in request attribute, before forward to views
        request.setAttribute("errorString", errorString);
        request.setAttribute("donList", list);
         
        // Forward to /WEB-INF/views/donListView.jsp
        RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/donListView.jsp");
        dispatcher.forward(request, response);
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
 
}