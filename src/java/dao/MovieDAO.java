/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Utils.DBUtils;
import dto.Movie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class MovieDAO {

    private List<Movie> accounts;

    public List<Movie> getAccounts() {
        return accounts;
    }

    public List<Movie> SearchByname(String searchValue)
            throws SQLException, ClassNotFoundException {
        List<Movie> movieList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            if (connection != null) {
                String sql = "select [id], [name], [actor], [category], [time], [language], [image], [description], [isShowing] "
                        + "from Movies "
                        + "where [name] Like ? ";
                stm = connection.prepareStatement(sql);
                if (searchValue == null) {
                    searchValue = "";
                }
                stm.setString(1, "%" + searchValue + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    Movie movie = new Movie();
                    movie.setId(rs.getString("id"));
                    movie.setName(rs.getString("name"));
                    movie.setActor(rs.getString("actor"));
                    movie.setCategory(rs.getString("category"));
                    movie.setTime(rs.getInt("time"));
                    movie.setLanguage(rs.getString("language"));
                    movie.setImage(rs.getString("image"));
                    movie.setDescription(rs.getString("description"));
                    movie.setIsShowing(rs.getBoolean("isShowing"));
                    movieList.add(movie);
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (connection != null) {//close it
                connection.close();
            }
        }
        return movieList;
    }

    public List<Movie> getNowShowingMovies() {
        List<Movie> movieList = new ArrayList<>();
        String sql = "SELECT id, name, actor, category, time, language, image, description, isShowing "
                + "FROM Movies "
                + "WHERE isShowing = 1"; 

        try (Connection conn = DBUtils.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Movie movie = new Movie();
                movie.setId(rs.getString("id"));
                movie.setName(rs.getString("name"));
                movie.setActor(rs.getString("actor"));
                movie.setCategory(rs.getString("category"));
                movie.setTime(rs.getInt("time"));
                movie.setLanguage(rs.getString("language"));
                movie.setImage(rs.getString("image"));
                movie.setDescription(rs.getString("description"));
                movie.setIsShowing(rs.getBoolean("isShowing"));
                movieList.add(movie);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movieList;
    }

    public List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();
        String sql = "SELECT * FROM Movies";

        try (Connection conn = DBUtils.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Movie movie = new Movie();
                movie.setId(rs.getString("id"));
                movie.setName(rs.getString("name"));
                movie.setActor(rs.getString("actor"));
                movie.setCategory(rs.getString("category"));
                movie.setTime(rs.getInt("time"));
                movie.setLanguage(rs.getString("language"));
                movie.setImage(rs.getString("image"));  // Lấy ảnh từ DB
                movie.setDescription(rs.getString("description"));
                movie.setIsShowing(rs.getBoolean("isShowing"));
                movies.add(movie);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movies;
    }

    public boolean addMovie(String name, String actor, String category, int time, String language,
            String image, String description, boolean isShowing) {
        String sql = "INSERT INTO Movies (id, name, actor, category, time, language, image, description, isShowing) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBUtils.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "MV" + System.currentTimeMillis());
            stmt.setString(2, name);
            stmt.setString(3, actor);
            stmt.setString(4, category);
            stmt.setInt(5, time);
            stmt.setString(6, language);
            stmt.setString(7, image);
            stmt.setString(8, description);
            stmt.setBoolean(9, isShowing);

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MovieDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean deleteMovie(String id) throws SQLException, ClassNotFoundException {
        boolean result = false;
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = DBUtils.getConnection();
            if (connection != null) {
                String sql = "UPDATE Movies "
                        + "SET [isShowing] = 0 "
                        + "WHERE id=? ";
                stm = connection.prepareStatement(sql);
                stm.setString(1, id);
                int effectiveRows = stm.executeUpdate();
                if (effectiveRows > 0) {
                    result = true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return result;
    }
}
