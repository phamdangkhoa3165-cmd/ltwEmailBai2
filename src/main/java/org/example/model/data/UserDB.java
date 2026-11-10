package org.example.model.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.example.model.business.User;

public class UserDB {

    public static int insert(User user) {
        String sql = "INSERT INTO users (email, first_name, last_name, date_of_birth, hear_from, contact_via) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBContext.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, user.getEmail());
            ps.setString(2, user.getFirstName());
            ps.setString(3, user.getLastName());
            ps.setString(4, user.getDateOfBirth());
            ps.setString(5, user.getHearFrom());
            ps.setString(6, user.getContactVia());

            return ps.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}