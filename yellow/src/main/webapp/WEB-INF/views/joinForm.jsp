<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>회원가입페이지</h1>
    <a href="user?username=ssar&password=1234">회원가입완료</a>
    <hr/>
    <form action="user" method="post">
        <input type="text" value="ssar" name="username" placeholder="Enter username"><br/>
        <input type="text" name="passowrd" placeholder="Enter password"><br/>
        <input type="text" name="email" placeholder="Enter email"><br/>
        <input type="submit" value="회원가입완료">
    </form>
</body>
</html>