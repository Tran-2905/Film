/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Utils.DBUtils;
import dto.Movie;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class MovieDAO {
    public boolean insertMovie(Movie movie) {
        String sql = "INSERT INTO Movies (id, name, actor, category, time, language, image, description,isShowing) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBUtils.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, movie.getId());
            stmt.setString(2, movie.getName());
            stmt.setString(3, movie.getActor());
            stmt.setString(4, movie.getCategory());
            stmt.setInt(5, movie.getTime());
            stmt.setString(6, movie.getLanguage());
            if (movie.getImage() != null) {
                stmt.setBinaryStream(7, new ByteArrayInputStream(movie.getImage()), movie.getImage().length);
            } else {
                stmt.setNull(7, Types.BLOB);
            }
            stmt.setString(8, movie.getDescription());
            stmt.setBoolean(9, movie.isIsShowing());
            return stmt.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public List<Movie> getNowShowingMovies() {
        List<Movie> movieList = new ArrayList<>();
        String sql = "SELECT id, name, actor, category, time, language, image, description FROM Movie WHERE isShowing = 1";
        
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
                movie.setImage(rs.getBytes("image")); // Lấy ảnh dạng binary
                movie.setDescription(rs.getString("description"));

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
                movie.setImage(rs.getBytes("image"));  // Lấy ảnh từ DB
                movie.setDescription(rs.getString("description"));

                movies.add(movie);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movies;
    }
    public boolean addMovie(String name, String actor, String category, int time, String language, 
                            InputStream image, long imageSize, String description, boolean isShowing) {
        String sql = "INSERT INTO Movies (id, name, actor, category, time, language, image, description, isShowing) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DBUtils.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, "MV" + System.currentTimeMillis()); 
            stmt.setString(2, name);
            stmt.setString(3, actor);
            stmt.setString(4, category);
            stmt.setInt(5, time);
            stmt.setString(6, language);

            if (image != null) {
                stmt.setBinaryStream(7, image, (int) imageSize);
            } else {
                stmt.setNull(7, Types.BLOB);
            }

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
}
