package org.example.controller;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import org.example.model.business.Survey;
import org.example.model.business.User;
import org.example.model.data.SurveyDB;
import org.example.model.data.UserDB;
import org.example.model.dto.SurveyDTO;

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
            SurveyDTO surveyDTO = new SurveyDTO(
                    req.getParameter("firstName"),
                    req.getParameter("lastName"),
                    req.getParameter("email"),
                    req.getParameter("dateOfBirth"),
                    req.getParameter("hearAboutUs"),
                    req.getParameter("wantsUpdates") != null ? "YES" : "NO",
                    req.getParameter("wantsEmail") != null ? "YES" : "NO",
                    req.getParameter("contactVia")
            );

            User user = new User(surveyDTO.getFirstName(), surveyDTO.getLastName(), surveyDTO.getEmail());
            Survey survey = new Survey(
                    user,
                    surveyDTO.getDateOfBirth(),
                    surveyDTO.getHearAboutUs(),
                    surveyDTO.getWantsUpdates(),
                    surveyDTO.getWantsEmail(),
                    surveyDTO.getContactVia()
            );

            String[] contributors = req.getParameterValues("contactVia");
            if (contributors != null) {
                String contributorsList = String.join(", ", contributors);
                surveyDTO.setContactVia(contributorsList);
            }

            UserDB.insert(user);
            SurveyDB.insert(survey);

            req.setAttribute("surveyDTO", surveyDTO);

            url = "/thanks.jsp";
        }

        getServletContext().getRequestDispatcher(url).forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}