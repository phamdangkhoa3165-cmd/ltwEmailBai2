package org.example.model.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.example.model.business.Survey;

public class SurveyDB {

    public static int insert(Survey survey) {
        UserDB.insert(survey.getUser());

        String sql = "INSERT INTO surveys (user_email, date_of_birth, hear_about_us, wants_updates, wants_email, contact_via) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBContext.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, survey.getUser().getEmail());
            ps.setString(2, survey.getDateOfBirth());
            ps.setString(3, survey.getHearAboutUs());
            ps.setString(4, survey.getWantsUpdates());
            ps.setString(5, survey.getWantsEmail());
            ps.setString(6, survey.getContactVia());

            return ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}