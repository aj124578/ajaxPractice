<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="../layout/header.jsp" %>

            <div class="align_center">
                <h1>회원가입 페이지</h1>
            </div>
            <hr>

<%@ include file="../layout/button.jsp" %>

            <div class="align_center">
                <form action="/join" method="post">
                    <input type="text" name="username" placeholder="Enter username" required><br>
                    <input type="password" name="password" placeholder="Enter password" required><br>
                    <input type="email" name="email" placeholder="Enter email" required><br>
                    <button type="submit">로그인</button>
                </form>
            </div>

 <%@ include file="../layout/footer.jsp" %>
