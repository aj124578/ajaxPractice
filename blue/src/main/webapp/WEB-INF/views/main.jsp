<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .main_box {
            height: 100px;  /*박스의 공간을 키워서 움직일 공간을 만들어줌*/
            display: flex;
            justify-content: center;
        }
    </style>
</head>

<body>
    <h1>메인페이지 ${user.username}</h1> <!--el표현식-->
    <hr/>
    <div class="main_box">
    <table class="main_table" border = "1">
        <tr>
            <td>번호</td>
            <td>제목</td>
            <td>내용</td>
            <td>작성자</td>
            <td>작성일자</td>
        </tr>
        <!-- 반복되는 내용 -->
        <tr>
            <td>1</td>
            <td>스프링 공부방법</td>
            <td>하루 1시간 열심히...</td>
            <td>홍길동</td>
            <td>2023.01.12</td>
        </tr>
    </table>
    </div>
</body>

</html>