<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <style>
                .loginForm_box {
                    border: 1px solid rgb(184, 177, 177);
                    padding: 10px;
                    width: 300px;

                }

                .common_center {
                    display: flex;
                    justify-content: center;
                }
             
            </style>
        </head>

        <body>
            <h1>로그인 페이지</h1>
            <hr />
            <!-- 로그인은 select * from usre where username=? and password=? -->
            <div class="common_center">
                <div class="loginForm_box">
                    <form action="login" method="post">
                        <input type="text" name="username" placeholder="Enter username"><br>
                        <input type="password" name="password" placeholder="Enter password"><br>
                        <button type="submit">로그인</button>
                    </form>
                    <a href="joinForm">아직 회원가입이 안되셨나요?</a>
                </div>
            </div>
        </body>

        </html>