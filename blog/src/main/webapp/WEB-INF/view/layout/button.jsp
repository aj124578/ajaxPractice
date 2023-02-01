<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<c:choose>
   <c:when test="principal == null">
   <div class="align_center">
    <a href="user/loginForm">로그인</a>
    <a href="user/joinForm">회원가입</a>
    </div>
   </c:when>

   <c:otherwise>
   <div class="align_center">
    <a href="user/userUpdateForm">회원정보</a>
    <a href="/logout">로그아웃</a>
</div>
   </c:otherwise>
</c:choose>


