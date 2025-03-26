<%-- 
    Document   : editMovie
    Created on : Mar 24, 2025, 8:17:00 AM
    Author     : Admin
--%>

<%@page import="dao.MovieDAO"%>
<%@page import="dto.Movie"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                background: linear-gradient(to bottom, #0f0c29, #302b63, #24243e);
                color: #fff;
                font-family: Arial, sans-serif;
                text-align: center;
                padding: 20px;
            }

            h2 {
                color: yellow;
                font-size: 24px;
                margin-bottom: 20px;
            }

            table {
                width: 100%;
                border-collapse: collapse;
                background: rgba(0, 0, 0, 0.8);
                box-shadow: 0px 0px 15px rgba(255, 255, 255, 0.2);
                border-radius: 10px;
                overflow: hidden;
            }

            thead th {
                background: yellow;
                color: black;
                padding: 10px;
            }

            tbody td {
                padding: 10px;
                border-bottom: 1px solid #ccc;
            }

            tr:hover {
                background: rgba(255, 255, 255, 0.1);
            }

            td img {
                width: 100px;
                border-radius: 5px;
            }

            a {
                color: yellow;
                text-decoration: none;
                font-weight: bold;
            }

            a:hover {
                color: #ffcc00;
            }

            input[type="submit"] {
                background: yellow;
                color: black;
                font-weight: bold;
                padding: 10px;
                border: none;
                cursor: pointer;
                border-radius: 5px;
                transition: background 0.3s ease-in-out;
            }

            input[type="submit"]:hover {
                background: #ffcc00;
            }
            .back-button {
                background-color: #00BFFF;
            }
            .back-button:hover {
                background-color: #009ACD;

            }
            .button-container {
                display: flex;
                justify-content: space-between;
                margin-top: 20px;
            }
        </style>
    </head>
    <body>
        <form action="MainController" method="POST">
            <input type="hidden" name="action" value="editMovie">
            <input type="text" name="txtsearchValue" value="${param.txtsearchValue}"/><br>
            <input type="submit"/>
        </form><br/>
        <c:set var="searchValue" value="${param.txtsearchValue}"/>
        <c:set var="result" value="${requestScope.SEARCH_RESULT}"/>
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
                    <th>delete</th>
                    <th>update</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="dto" items="${result}" varStatus="counter">
                    <tr> 
                <form action="MainController" method="POST">
                    <td>${counter.count}</td>
                    <td>${dto.id} <input type="hidden" name="id" value="${dto.id}" /> </td>
                    <td>${dto.name}<input type="hidden" name="name" value="${dto.name}" /> </td>
                    <td><img src="${dto.image}" width="200px"/></td>
                    <td>${dto.actor}<input type="hidden" name="actor" value="${dto.actor}" /> </td>
                    <td>${dto.category}<input type="hidden" name="category" value="${dto.category}" /></td>
                    <td>${dto.time}<input type="hidden" name="time" value="${dto.time}" /></td>
                    <td>${dto.language}<input type="hidden" name="language" value="${dto.language}" /></td>
                    <td>${dto.description}<input type="hidden" name="description" value="${dto.description}" /></td>
                    <td>${dto.isShowing}<input type="hidden" name="isShowing" value="${dto.isShowing}" /></td>
                    <td> 
                        <c:url var="deleteLink" value="MainController">
                            <c:param name="action" value="delete" />
                            <c:param name="pk" value="${dto.id}" />
                            <c:param name="lastSearchValue" value="${searchValue}" />
                        </c:url>
                        <a href="${deleteLink}">delete</a>
                    </td>
                    <td>
                        <a href="MainController?action=updateMovie&id=${dto.id}">
                            Edit
                        </a>
                    </td>
                    <input type="hidden" name="txtLastSearch" value="${searchValue}" />
                </form>
            </tr>
        </c:forEach>
    </tbody>
</table>
<div class="button-container">
    <button type="button" class="form-button back-button" onclick="window.location.href = '<%= request.getContextPath()%>/views/home.jsp'">Trở Về Trang Chủ</button>
</div>
</body>
</html>
