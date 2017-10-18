<%-- 
    Document   : shoopingCart
    Created on : 18-Oct-2017, 07:26:37
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="myCart" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Daftar Belanja</title>
    </head>
    <body>   
        <h1>Daftar Belanja :</h1>
        <myCart:forEach items="${listcart}" var="c">
           <ul><li> ${c.namabarang} <br /></ul></li>
            </myCart:forEach>
            <a href="beranda"><button>Kembali</button></a>
    </body>
</html>
