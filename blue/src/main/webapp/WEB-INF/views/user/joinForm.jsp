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
                .joinForm_box {
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
            <h1>회원가입 페이지</h1>
            <hr />
            <div class="common_center">
                <div class="joinForm_box">
                    <form action="join" method="post">
                        <input type="text" name="username" placeholder="Enter username"><br>
                        <input type="password" name="password" placeholder="Enter password"><br>
                        <input type="email" name="email" placeholder="Enter email"><br>
                        <button type="submit">회원가입</button>
                    </form>
                    <a href="loginForm">이미 회원가입이 되어 있으신가요?</a>
                </div>
            </div>
        </body>

        </html>