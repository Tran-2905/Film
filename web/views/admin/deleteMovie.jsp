<%-- 
    Document   : deleteMovie
    Created on : Mar 24, 2025, 8:17:00 AM
    Author     : Admin
--%>

<%@page import="dao.MovieDAO"%>
<%@page import="dto.Movie"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>No.</th>
                    <th>id</th>
                    <th>name</th>
                    <th>actor</th>
                    <th>category</th>
                    <th>time</th>
                    <th>language</th>
                    <th>image</th>
                    <th>description</th>
                    <th>isShowing</th>
                </tr>
            </thead>
            <tbody

                <%
                    MovieDAO movieDAO = new MovieDAO();
                    List<Movie> movies = movieDAO.getAllMovies();
                    for (Movie movie : movies) {
                %>
                <tr> 

            <form action="MainController" method="POST">
                <td>${counter.count}</td>
                <td>${movie.id} <input type="hidden" name="id" value="${movie.id}" /> </td>
                <td><input type="text" name="name" value="${movie.name}" /> </td>
                <td><input type="text" name="actor" value="${movie.actor}" /> </td>
                <td><input type="text" name="category" value="${movie.category}" /></td>
                <td><input type="text" name="time" value="${movie.time}" /></td>
                <td><input type="text" name="language" value="${movie.language}" /></td>
                <td><input type="text" name="image" value="${movie.image}" /> </td>
                <td><input type="text" name="description" value="${movie.description}" /> </td>
                <td><input type="text" name="isShowing" value="${movie.isShowing}" /> </td>
                <td> 
                <c:url var="deleteLink" value="MainController">
                    <c:param name="action" value="delete" />
                    <c:param name="pk" value="${dto.id}" />
                    <c:param name="lastSearchValue" value="${searchValue}" />
                </c:url>
                <a href="${deleteLink}">delete</a>
                </td>
                <input type="hidden" name="txtLastSearch" value="${searchValue}" />
            </form>
        </tr>
        <% }%>
    </tbody>



</table>
</body>
</html>
