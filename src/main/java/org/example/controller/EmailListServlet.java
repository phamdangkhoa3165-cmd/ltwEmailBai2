package org.example.controller;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import org.example.model.business.User;
import org.example.model.data.UserDB;

@WebServlet("/emailList")
public class EmailListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
        String url = "/index.html";

        String action = req.getParameter("action");
        if (action == null) {
            action = "join";
        }

        if (action.equals("join")) {
            url = "/index.html";
        }
        else if (action.equals("add")) {
            String firstName = req.getParameter("firstName");
            String lastName = req.getParameter("lastName");
            String email = req.getParameter("email");
            String dateOfBirth = req.getParameter("dateOfBirth");
            String hearAboutUs = req.getParameter("hearAboutUs");
            String wantsUpdates = req.getParameter("wantsUpdates");
            String contactVia = req.getParameter("contactVia");

            User user = new User(firstName, lastName, email, dateOfBirth,
                    hearAboutUs != null ? hearAboutUs : "",
                    wantsUpdates != null ? wantsUpdates : "NO",
                    contactVia != null ? contactVia : "");

            UserDB.insert(user);

            // Trong Servlet: Lấy ra session hiện tại từ người dùng
            HttpSession session = req.getSession();

            // Lưu thông tin người dùng vào Session (tồn tại trên Server 30 phút)
            session.setAttribute("user", user);
            url = "/thanks.jsp";
        }

        getServletContext().getRequestDispatcher(url).forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}