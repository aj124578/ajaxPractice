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
    <h1>상품 상세 페이지</h1>
    <hr>
     <form action="/product/addForm" method="post">
        <button type="submit">수정</button>
    </form>
    <table border="1">
        <tr>
            <th>번호</th>
            <th>상품명</th>
            <th>가격</th>
            <th>재고량</th>
            <th>등록일자</th>
        </tr>

         <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.qty}</td>
            <td>${product.createdAt}</td>
        </tr>

    </table>
</body>
</html>