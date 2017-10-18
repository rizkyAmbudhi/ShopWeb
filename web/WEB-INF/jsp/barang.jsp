<%-- 
    Document   : barang
    Created on : Oct 17, 2017, 11:47:23 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Item Page</title>
    </head>
    <header >
        
    </header>
    <body class="container">
        <h2>Keranjang: <a href="../shoppingCart">( ${cart.size()} )</a></h2>
        <h1>Daftar Barang</h1>
        <p:forEach var="bd" items="${brg}">
            <p><ul><li><a href="${bd.id}">${bd.namabarang}</a></p></li></ul> 
        </p:forEach>
    </body>
</html>
